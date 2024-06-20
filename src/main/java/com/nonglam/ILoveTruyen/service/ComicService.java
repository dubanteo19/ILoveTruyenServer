package com.nonglam.ILoveTruyen.service;

import com.nonglam.ILoveTruyen.model.Comic;
import com.nonglam.ILoveTruyen.repository.ComicRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComicService {
    private final ComicRepository comicRepository;

    public ComicService(ComicRepository comicRepository) {
        this.comicRepository = comicRepository;
    }
    public List<Comic> findAll(){
        return comicRepository.findAll();
    }
    public Comic save(Comic comic){
        return comicRepository.save(comic);
    }
    public Comic findById(Integer id){
        return comicRepository.findById(id).orElseThrow();
    }

    public List<Comic> getRecomendedComics() {
        return comicRepository.findAll(Sort.by(Sort.Direction.DESC,"likes"));
    }
    public List<Comic> getHotComics() {
        return comicRepository.findAll(Sort.by(Sort.Direction.DESC,"views"));
    }
}
