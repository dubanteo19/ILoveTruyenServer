package com.nonglam.ILoveTruyen.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "comic_details")
public class ComicDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    @Enumerated(EnumType.STRING)
    private Status status;
    @JoinColumn(name = "comic_id", referencedColumnName = "id")
    @OneToOne
    private Comic comic;
    @OneToMany(mappedBy = "comicDetail", fetch = FetchType.LAZY)
    private List<Comment> comments;

    @ManyToMany()
    @JoinTable(
            name = "comic_details_categories",
            joinColumns = @JoinColumn(name = "comic_detail_id"),
            inverseJoinColumns = @JoinColumn(name = "categoty_id")
    )
    private List<Category> categories;
}
