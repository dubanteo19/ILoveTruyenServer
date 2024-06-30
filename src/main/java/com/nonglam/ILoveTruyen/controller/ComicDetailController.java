package com.nonglam.ILoveTruyen.controller;

import com.nonglam.ILoveTruyen.model.Category;
import com.nonglam.ILoveTruyen.model.Chapter;
import com.nonglam.ILoveTruyen.model.ComicDetail;
import com.nonglam.ILoveTruyen.model.Comment;
import com.nonglam.ILoveTruyen.service.ChapterService;
import com.nonglam.ILoveTruyen.service.ComicDetailService;
import com.nonglam.ILoveTruyen.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comic-detail")
public class ComicDetailController {
    private final ComicDetailService comicDetailService;
    private final ChapterService chapterService;

    public ComicDetailController(ComicDetailService comicDetailService, ChapterService chapterService) {
        this.comicDetailService = comicDetailService;
        this.chapterService = chapterService;
    }

    @GetMapping
    public ResponseEntity<List<ComicDetail>> findAll() throws Exception {
        return new ResponseEntity<>(comicDetailService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ComicDetail> findById(@PathVariable Integer id) throws Exception {
        return new ResponseEntity<>(comicDetailService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/{id}/comments")
    public ResponseEntity<List<Comment>> getCommentsByComicId(@PathVariable Integer id) throws Exception {
        var comments = comicDetailService.findAllCommentsById(id);
        return new ResponseEntity<>(comments, HttpStatus.OK);
    }

    @GetMapping("/{id}/categories")
    public ResponseEntity<List<Category>> getAllCategoryById(@PathVariable Integer id) {
        return new ResponseEntity<>(comicDetailService.getAllCategoryById(id), HttpStatus.OK);
    }

    @GetMapping("/{id}/chapters")
    public ResponseEntity<List<Chapter>> getAllChapterById(@PathVariable Integer id) {
        return new ResponseEntity<>(chapterService.findAllChapterByComicId(id), HttpStatus.OK);
    }
}
