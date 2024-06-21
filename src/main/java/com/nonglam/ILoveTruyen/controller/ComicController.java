package com.nonglam.ILoveTruyen.controller;

import com.nonglam.ILoveTruyen.service.ComicService;
import com.nonglam.ILoveTruyen.model.Comic;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comics")
public class ComicController {
    private final ComicService comicService;

    public ComicController(ComicService comicService) {
        this.comicService = comicService;
    }

    @GetMapping()
    public ResponseEntity<List<Comic>> getAllComic() {
        var comics = comicService.findAll();
        return new ResponseEntity<>(comics, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Comic> findById(@PathVariable Integer id) {
        var comic = comicService.findById(id);
        return new ResponseEntity<>(comic, HttpStatus.OK);
    }
    @GetMapping("recomendations")
    public ResponseEntity<List<Comic>> getRecommendedComics() {
        var comics = comicService.getRecomendedComics();
        return new ResponseEntity<>(comics, HttpStatus.OK);
    }

    @GetMapping("hot")
    public ResponseEntity<List<Comic>> getHotComics() {
        var comics = comicService.getHotComics();
        return new ResponseEntity<>(comics, HttpStatus.OK);
    }

    @GetMapping("latest")
    public ResponseEntity<List<Comic>> getLatestComics() {
        var comics = comicService.getLatestComics();
        return new ResponseEntity<>(comics, HttpStatus.OK);
    }

    @GetMapping("/search/{name}")
    public ResponseEntity<List<Comic>> searchByName(@PathVariable String name) {
        var comics = comicService.searchByName(name);
        return new ResponseEntity<>(comics, HttpStatus.OK);
    }
    @GetMapping("/category/{id}")
    public ResponseEntity<List<Comic>> getComicsByCategoryId(@PathVariable Integer id) {
        var comics = comicService.getComicsByCategoryId(id);
        return new ResponseEntity<>(comics, HttpStatus.OK);
    }
    @PutMapping("/views/{id}/increase")
    public ResponseEntity<Integer> increaseViews(@PathVariable Integer id) {
        comicService.increaseViews(id);
        return new ResponseEntity<>(1, HttpStatus.OK);
    }

    @PutMapping("/likes/{id}/like")
    public ResponseEntity<Integer> like(@PathVariable Integer id) {
        comicService.increaseLikes(id);
        return new ResponseEntity<>(1, HttpStatus.OK);
    }

    @PutMapping("/likes/{id}/unlike")
    public ResponseEntity<Integer> unlike(@PathVariable Integer id) {
        comicService.decreaseLikes(id);
        return new ResponseEntity<>(1, HttpStatus.OK);
    }


}
