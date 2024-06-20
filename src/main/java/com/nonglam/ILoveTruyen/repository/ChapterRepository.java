package com.nonglam.ILoveTruyen.repository;

import com.nonglam.ILoveTruyen.model.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChapterRepository extends JpaRepository<Chapter, Integer> {
    List<Chapter> findByComicDetail_Id(Integer id);
}
