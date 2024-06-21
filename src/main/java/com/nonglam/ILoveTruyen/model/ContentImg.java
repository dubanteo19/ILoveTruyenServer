package com.nonglam.ILoveTruyen.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ContentImg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int count;
    private String url;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chapter_id",referencedColumnName = "id")
    @JsonBackReference
    private Chapter chapter;
}
