package com.nonglam.ILoveTruyen.service;

import com.nonglam.ILoveTruyen.dto.ComicAdd;
import com.nonglam.ILoveTruyen.model.Category;
import com.nonglam.ILoveTruyen.model.Comic;
import com.nonglam.ILoveTruyen.model.ComicDetail;
import com.nonglam.ILoveTruyen.model.Status;
import com.nonglam.ILoveTruyen.repository.CategoryRepository;
import com.nonglam.ILoveTruyen.repository.ComicDetailRepository;
import com.nonglam.ILoveTruyen.repository.ComicRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ComicService {
    private final ComicRepository comicRepository;
    private final ComicDetailRepository comicDetailRepository;
    private CategoryRepository categoryRepository;

    public ComicService(ComicRepository comicRepository, ComicDetailRepository comicDetailRepository, CategoryRepository categoryRepository) {
        this.comicRepository = comicRepository;
        this.comicDetailRepository = comicDetailRepository;
        this.categoryRepository = categoryRepository;
    }

    public List<Comic> findAll() {
        return comicRepository.findAll();
    }

    public Comic save(Comic comic) {
        return comicRepository.save(comic);
    }

    public Comic save(ComicAdd comicAdd) {
        Comic comic = new Comic(0, comicAdd.name(), 0, 0, comicAdd.thumbUrl(), LocalDateTime.now(), 0);
        var savedComic = comicRepository.save(comic);
        ComicDetail comicDetail = new ComicDetail();
        comicDetail.setComic(savedComic);
        comicDetail.setDescription(comicAdd.description());
        List<Category> categories = new ArrayList<>();
        for (Integer i : comicAdd.categoriesId()) {
            categories.add(categoryRepository.findById(i).get());
        }
        comicDetail.setCategories(categories);
        comicDetail.setStatus(Status.UPDATING);
        comicDetailRepository.save(comicDetail);
        return savedComic;
    }

    public Comic findById(Integer id) {
        return comicRepository.findById(id).orElseThrow();
    }

    public List<Comic> getRecomendedComics() {
        return comicRepository.findAll(Sort.by(Sort.Direction.DESC, "likes"));
    }

    public List<Comic> getHotComics() {
        return comicRepository.findAll(Sort.by(Sort.Direction.DESC, "views"));
    }

    public List<Comic> getLatestComics() {
        return comicRepository.findAll(Sort.by(Sort.Direction.DESC, "createdDate"));
    }

    public List<Comic> searchByName(String name) {
        return comicRepository.findAllByNameContains(name);
    }

    public List<Comic> getComicsByCategoryId(Integer id) {
        var comicDetails = comicDetailRepository.findAllComicDetailByCategoriesId(id);
        return comicDetails.stream().map(ComicDetail::getComic).toList();
    }

    public int increaseViews(Integer id) {
        var comic = comicRepository.findById(id).orElseThrow();
        var updatedViews = comic.getViews() + 1;
        comic.setViews(updatedViews);
        comicRepository.save(comic);
        return updatedViews;
    }

    public int increaseLikes(Integer id) {
        var comic = comicRepository.findById(id).orElseThrow();
        var updatedLikes = comic.getLikes() + 1;
        comic.setLikes(updatedLikes);
        comicRepository.save(comic);
        return updatedLikes;
    }

    public int decreaseLikes(Integer id) {
        var comic = comicRepository.findById(id).orElseThrow();
        var updatedLikes = comic.getLikes() - 1;
        comic.setLikes(updatedLikes);
        comicRepository.save(comic);
        return updatedLikes;
    }
}
