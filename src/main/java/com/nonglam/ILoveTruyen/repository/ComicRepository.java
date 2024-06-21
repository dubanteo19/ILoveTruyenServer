package com.nonglam.ILoveTruyen.repository;

import com.nonglam.ILoveTruyen.model.Comic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComicRepository extends JpaRepository<Comic,Integer> {
    List<Comic> findAllByNameContains(String name);
}
