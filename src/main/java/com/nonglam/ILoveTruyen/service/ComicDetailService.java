package com.nonglam.ILoveTruyen.service;

import com.nonglam.ILoveTruyen.model.Category;
import com.nonglam.ILoveTruyen.model.ComicDetail;
import com.nonglam.ILoveTruyen.model.Comment;
import com.nonglam.ILoveTruyen.repository.ComicDetailRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComicDetailService {
    private final ComicDetailRepository comicDetailRepository;

    public ComicDetailService(ComicDetailRepository comicDetailRepository) {
        this.comicDetailRepository = comicDetailRepository;
    }

    public ComicDetail save(ComicDetail comicDetail){
        return comicDetailRepository.save(comicDetail);
    }
    public ComicDetail findById(Integer id) throws Exception {
        var comicDetail= comicDetailRepository.findByComic_Id(id);
        if(comicDetail==null) throw new Exception("Comic not found");
        return comicDetail;
    }
    public List<Category> getAllCategoryById(Integer id){
        return comicDetailRepository.findByComic_Id(id).getCategories();
    }

    public List<Comment> findAllCommentsById(Integer comicId) throws Exception {
        var comicDetail = comicDetailRepository.findById(comicId);
        if(comicDetail.isEmpty()) throw new Exception("Comic not found");
        return comicDetail.get().getComments();
    }
}
