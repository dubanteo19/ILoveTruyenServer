package com.nonglam.ILoveTruyen.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    @JsonBackReference
    private User user;
    @ManyToOne
    @JoinColumn(name = "comic_detail_id",referencedColumnName = "id")
    @JsonBackReference
    private ComicDetail comicDetail;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdDate;

}
