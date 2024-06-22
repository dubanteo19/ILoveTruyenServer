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
        Comic linh_khi_khoi_phuc_tu_ca_chep_tien_hoa_thanh_than_longComic = new Comic(4, "Linh Khí Khôi Phục: Ta Mỗi Ngày Thu Được Một Cái Kỹ Năng Mới", 10, 60, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long.jpg?alt=media&token=7471972e-5f39-453e-a647-4ec08fed5fdf", LocalDateTime.now(), 4);
        Comic talatadeComic = new Comic(5, "Ta là tà đế", 13, 50, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/ta-la-ta-de%2Fta-la-ta-de_1573619796.jpg?alt=media&token=98f9f57c-86a7-4d5c-a271-7f0ddf12c33b", LocalDateTime.now(), 2);
        Comic daiquangialamahoangComic = new Comic(6, "Đại quản gia là ma hoàng", 1560, 560, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/dai-quan-gia-la-ma-hoang%2Fdai-quan-gia-la-ma-hoang_1555489297.jpg?alt=media&token=991b1365-ee5c-4470-953f-1694b5952c5e", LocalDateTime.now(), 10);
        Comic bachluyenthanhthanComic = new Comic(7, "Bách luyện thành thần", 600, 50, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/bach-luyen-thanh-than%2Fbach-luyen-thanh-than_1444715692.jpg?alt=media&token=76b9b1ac-0e10-4240-b048-bed52d718eed", LocalDateTime.now(), 5);
        Comic Mikako_SanComic = new Comic(8, "Mikako-San", 120, 60, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/Mikako-San%2Fmikako-san_1718611456.jpg?alt=media&token=10e4eee6-8366-40c1-b5d6-bcf9ada9eeee", LocalDateTime.now(), 2);
        Comic nguyenTonComic = new Comic(9, "Nguyên tôn", 1560, 560, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/nguyen-ton%2Fnguyen-ton_1513349962.jpg?alt=media&token=cedfff7d-bebd-4de6-92a1-c04353bbce47", LocalDateTime.now(), 3);
        Comic thanChiCanhComic = new Comic(10, "Thần chi canh", 100, 50, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/than-chi-canh%2Fthan-chi-canh_1710986870.jpg?alt=media&token=dfac1425-0dbc-45b8-b8e2-716b9d59750a", LocalDateTime.now(), 7);
        comicService.save(onePiceComic);
        comicService.save(onePiceComic);
        comicService.save(tgdqComic);
        comicService.save(onePunchManComic);
        comicService.save(linh_khi_khoi_phuc_tu_ca_chep_tien_hoa_thanh_than_longComic);
        comicService.save(talatadeComic);
        comicService.save(daiquangialamahoangComic);
        comicService.save(bachluyenthanhthanComic);
        comicService.save(Mikako_SanComic);
        comicService.save(nguyenTonComic);
        comicService.save(thanChiCanhComic);
    }
}
