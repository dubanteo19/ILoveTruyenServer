package com.nonglam.ILoveTruyen.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "comics")
public class Comic {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private int views;
    private int likes;
    private String thumbUrl;
    @CreationTimestamp
    private LocalDateTime createdDate;
    private int latestChapter;
}
