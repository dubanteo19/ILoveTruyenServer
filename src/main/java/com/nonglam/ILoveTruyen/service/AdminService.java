package com.nonglam.ILoveTruyen.service;

import com.nonglam.ILoveTruyen.dto.DashboardDTO;
import com.nonglam.ILoveTruyen.repository.CategoryRepository;
import com.nonglam.ILoveTruyen.repository.ComicDetailRepository;
import com.nonglam.ILoveTruyen.repository.CommentRepository;
import com.nonglam.ILoveTruyen.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private final CommentRepository commentRepository;
    private final UserRepository userRepository;
    private final ComicDetailRepository comicDetailRepository;
    private final CategoryRepository categoryRepository;

    public AdminService(CommentRepository commentRepository, UserRepository userRepository, ComicDetailRepository comicDetailRepository, CategoryRepository categoryRepository) {
        this.commentRepository = commentRepository;
        this.userRepository = userRepository;
        this.categoryRepository = categoryRepository;
        this.comicDetailRepository = comicDetailRepository;
    }

    public DashboardDTO getDashboard() {
        Integer totalComments = (int) commentRepository.count();
        Integer totalUsers = (int) userRepository.count();
        Integer totalComics = (int) comicDetailRepository.count();
        Integer totalCategories = (int) categoryRepository.count();
        return new DashboardDTO(totalComics,totalComments,totalUsers,totalCategories);
    }
}
