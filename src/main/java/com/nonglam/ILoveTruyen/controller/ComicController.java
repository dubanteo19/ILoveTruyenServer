package com.nonglam.ILoveTruyen.controller;

import com.nonglam.ILoveTruyen.service.ComicService;
import com.nonglam.ILoveTruyen.model.Comic;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comics")
public class ComicController {
    private final ComicService comicService;

    public ComicController(ComicService comicService) {
        this.comicService = comicService;
    }
    @GetMapping("")
    public ResponseEntity<List<Comic>> getAllComic(){
        var comics = comicService.findAll();
        return new ResponseEntity<>(comics, HttpStatus.OK);
    }
    @GetMapping("recomendations")
    public ResponseEntity<List<Comic>> getRecommendedComics(){
        var comics = comicService.getRecomendedComics();
        return new ResponseEntity<>(comics, HttpStatus.OK);
    }
    @GetMapping("hot")
    public ResponseEntity<List<Comic>> getHotComics(){
        var comics = comicService.getHotComics();
        return new ResponseEntity<>(comics, HttpStatus.OK);
    }
}
