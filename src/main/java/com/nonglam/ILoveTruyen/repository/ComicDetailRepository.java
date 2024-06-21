package com.nonglam.ILoveTruyen.repository;

import com.nonglam.ILoveTruyen.model.ComicDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComicDetailRepository extends JpaRepository<ComicDetail,Integer> {
    ComicDetail findByComic_Id(Integer comic_id);
    List<ComicDetail> findAllComicDetailByCategoriesId(Integer categories_id);
}
