package com.nonglam.ILoveTruyen.service;

import com.nonglam.ILoveTruyen.model.Chapter;
import com.nonglam.ILoveTruyen.repository.ChapterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterService {
    private final ChapterRepository chapterRepository;

    public ChapterService(ChapterRepository chapterRepository) {
        this.chapterRepository = chapterRepository;
    }
    public List<Chapter> findAllChapterByComicId(Integer id){
        return chapterRepository.findByComicDetail_Id(id);
    };
    public Chapter save(Chapter chapter){
        return chapterRepository.save(chapter);
    }
}
