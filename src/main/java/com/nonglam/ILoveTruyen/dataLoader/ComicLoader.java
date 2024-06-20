package com.nonglam.ILoveTruyen.dataLoader;

import com.nonglam.ILoveTruyen.model.Comic;
import com.nonglam.ILoveTruyen.service.ComicService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;
@Controller
public class ComicLoader implements CommandLineRunner {
    private final ComicService comicService;

    public ComicLoader(ComicService comicService) {
        this.comicService = comicService;
    }


    @Override
    public void run(String... args) throws Exception {
        Comic onePiceComic = new Comic(1, "One Piece", 100, 50, "https://firebasestorage.googleapis.com/v0/b/ilovetruyen-c0144.appspot.com/o/one_piece.jpg?alt=media&token=299ce8fe-04d6-40fa-8e78-c5cb808afddc", LocalDateTime.now(), 1);
        Comic tgdqComic = new Comic(2, "Thanh gươm diệt quỷ", 120, 60, "https://firebasestorage.googleapis.com/v0/b/ilovetruyen-c0144.appspot.com/o/thanh-guom-diet-quy.jpg?alt=media&token=4e0a1711-5730-4b9d-8cba-80421a04ffb0", LocalDateTime.now(), 2);
        Comic onePunchManComic = new Comic(3, "One Punch Man", 1560, 560, "https://firebasestorage.googleapis.com/v0/b/ilovetruyen-c0144.appspot.com/o/one_piece.jpg?alt=media&token=299ce8fe-04d6-40fa-8e78-c5cb808afddc", LocalDateTime.now(), 10);
        comicService.save(onePiceComic);
        comicService.save(tgdqComic);
        comicService.save(onePunchManComic);
    }
}
