package com.nonglam.ILoveTruyen.dataLoader;

import com.nonglam.ILoveTruyen.model.Comic;
import com.nonglam.ILoveTruyen.service.ComicService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;
@Controller
@Order(1)
public class ComicLoader implements CommandLineRunner {
    private final ComicService comicService;

    public ComicLoader(ComicService comicService) {
        this.comicService = comicService;
    }


    @Override
    public void run(String... args) throws Exception {
        Comic onePiceComic = new Comic(1, "One Piece", 100, 50, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fdao-hai-tac.jpg?alt=media&token=8ce110da-efbf-4f02-a6e4-760ccacb8a95", LocalDateTime.now(), 1);
        Comic tgdqComic = new Comic(2, "Thanh gươm diệt quỷ", 120, 60, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/thanh-guom-diet-quy%2Fkimetsu-no-yaiba.jpg?alt=media&token=7081c889-132d-4999-8852-670d3e81a426", LocalDateTime.now(), 2);
        Comic onePunchManComic = new Comic(3, "One Punch Man", 1560, 560, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man.jpg?alt=media&token=74cc94f4-defd-4333-aae4-8b5ffc15fa79", LocalDateTime.now(), 10);

        comicService.save(onePiceComic);
        comicService.save(tgdqComic);
        comicService.save(onePunchManComic);
    }
}
