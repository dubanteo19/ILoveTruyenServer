package com.nonglam.ILoveTruyen.model;


import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String password;
    private String fullName;
    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
    private List<Comment> comments;
}
