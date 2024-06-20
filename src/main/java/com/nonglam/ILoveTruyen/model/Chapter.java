package com.nonglam.ILoveTruyen.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "chapters")
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private ComicDetail comicDetail;
    @ElementCollection
    private List<String> imageUrl;

}
