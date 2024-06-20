package com.nonglam.ILoveTruyen.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String text;
    @ManyToOne
    private User user;
    @ManyToOne
    private ComicDetail comicDetail;
    private LocalDateTime createdDate;

}
