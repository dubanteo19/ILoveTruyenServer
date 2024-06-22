package com.nonglam.ILoveTruyen.dataLoader;

import com.nonglam.ILoveTruyen.model.Category;
import com.nonglam.ILoveTruyen.model.ComicDetail;
import com.nonglam.ILoveTruyen.model.Status;
import com.nonglam.ILoveTruyen.service.CategoryService;
import com.nonglam.ILoveTruyen.service.ComicDetailService;
import com.nonglam.ILoveTruyen.service.ComicService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@Order(4)
public class ComicDetailLoader implements CommandLineRunner {
    private final ComicDetailService comicDetailService;
    private final ComicService comicService;
    private final CategoryService categoryService;

    public ComicDetailLoader(ComicDetailService comicDetailService, ComicService comicService, CategoryService categoryService) {
        this.comicDetailService = comicDetailService;
        this.comicService = comicService;
        this.categoryService = categoryService;
    }

    @Override
    public void run(String... args) throws Exception {
        ComicDetail OnePiececomicDetail = new ComicDetail();
        OnePiececomicDetail.setComic(comicService.findById(1));
        OnePiececomicDetail.setStatus(Status.UPDATING);
        OnePiececomicDetail.setDescription("One Piece là câu truyện kể về Luffy và các thuyền viên của mình");
        OnePiececomicDetail.setCategories(List.of(categoryService.findById(1), categoryService.findById(2)));

        ComicDetail tgdqComiccomicDetail = new ComicDetail();
        tgdqComiccomicDetail.setComic(comicService.findById(2));
        tgdqComiccomicDetail.setStatus(Status.UPDATING);
        tgdqComiccomicDetail.setDescription("Kimetsu no Yaiba – Tanjirou là con cả của gia đình");
        tgdqComiccomicDetail.setCategories(List.of(categoryService.findById(3), categoryService.findById(4)));

        ComicDetail onePunchManComiccomicDetail = new ComicDetail();
        onePunchManComiccomicDetail.setComic(comicService.findById(3));
        onePunchManComiccomicDetail.setStatus(Status.UPDATING);
        onePunchManComiccomicDetail.setDescription("Onepunch-Man là một Manga thể loại siêu anh hùng với đặc trưng phồng tôm đấm phát chết luôn… Lol!!! ");
        onePunchManComiccomicDetail.setCategories(List.of(categoryService.findById(1), categoryService.findById(2)));

        ComicDetail linh_khi_khoi_phuc_tu_ca_chep_tien_hoa_thanh_than_longComicDetail = new ComicDetail();
        linh_khi_khoi_phuc_tu_ca_chep_tien_hoa_thanh_than_longComicDetail.setComic(comicService.findById(4));
        linh_khi_khoi_phuc_tu_ca_chep_tien_hoa_thanh_than_longComicDetail.setStatus(Status.UPDATING);
        linh_khi_khoi_phuc_tu_ca_chep_tien_hoa_thanh_than_longComicDetail.setDescription("Linh khí hồi phục về sau, yếu nhất thức tỉnh giả Lâm Thu bị hệ thống 9527 chọn trúng, có thể mỗi ngày rút lấy một cái kỹ năng mới!");
        linh_khi_khoi_phuc_tu_ca_chep_tien_hoa_thanh_than_longComicDetail.setCategories(List.of(categoryService.findById(1), categoryService.findById(2)));

        ComicDetail tltdComicDetail = new ComicDetail();
        tltdComicDetail.setComic(comicService.findById(5));
        tltdComicDetail.setStatus(Status.UPDATING);
        tltdComicDetail.setDescription("Truyện tranh Ta Là Tà Đế được cập nhật nhanh và đầy đủ nhất tại ILoveTruyen. Bạn đọc đừng quên để lại bình luận và chia sẻ, ủng hộ ILoveTruyen ra các chương mới nhất của truyện Ta Là Tà Đế.");
        tltdComicDetail.setCategories(List.of(categoryService.findById(1), categoryService.findById(2)));

        ComicDetail daiquangialamahoangComicDetail = new ComicDetail();
        daiquangialamahoangComicDetail.setComic(comicService.findById(6));
        daiquangialamahoangComicDetail.setStatus(Status.UPDATING);
        daiquangialamahoangComicDetail.setDescription("Truyện tranh Đại Quản Gia Là Ma Hoàng được cập nhật nhanh và đầy đủ nhất tại ILoveTruyen. Bạn đọc đừng quên để lại bình luận và chia sẻ, ủng hộ ILoveTruyen ra các chương mới nhất của truyện Đại Quản Gia Là Ma Hoàng.");
        daiquangialamahoangComicDetail.setCategories(List.of(categoryService.findById(4), categoryService.findById(2)));

        ComicDetail bachluyenthanhthanDetail = new ComicDetail();
        bachluyenthanhthanDetail.setComic(comicService.findById(7));
        bachluyenthanhthanDetail.setStatus(Status.FINISHED);
        bachluyenthanhthanDetail.setDescription("Cảnh giới: Luyện nhục cảnh, Luyện cốt cảnh, Luyện tạng cảnh.... La Chính vì gái mà bị đày làm nô bộc. La Bái Nhiên tham vọng đầy mình La Chính lại vì gái mà đâm đầu tu luyện La Gia trong phủ nước sôi lửa bỏng, tranh giành kịch liệt...");
        bachluyenthanhthanDetail.setCategories(List.of(categoryService.findById(3), categoryService.findById(2)));

        ComicDetail Mikako_SanComicDetail = new ComicDetail();
        Mikako_SanComicDetail.setComic(comicService.findById(8));
        Mikako_SanComicDetail.setStatus(Status.INACTIVE);
        Mikako_SanComicDetail.setDescription("Đối với Mikako, tương lai lúc nào cũng \"chưa quyết định được\", nhưng những ngày tháng cấp 3 của cô sẽ sớm kết thúc.");
        Mikako_SanComicDetail.setCategories(List.of(categoryService.findById(1), categoryService.findById(4)));

        ComicDetail nguyenTonComicDetail = new ComicDetail();
        nguyenTonComicDetail.setComic(comicService.findById(9));
        nguyenTonComicDetail.setStatus(Status.UPDATING);
        nguyenTonComicDetail.setDescription("Truyện tranh Nguyên Tôn được cập nhật nhanh và đầy đủ nhất tại ILoveTruyen. Bạn đọc đừng quên để lại bình luận và chia sẻ, ủng hộ ILoveTruyen ra các chương mới nhất của truyện Nguyên Tôn.");
        nguyenTonComicDetail.setCategories(List.of(categoryService.findById(5), categoryService.findById(2)));

        ComicDetail thanChiCanhComicDetail = new ComicDetail();
        thanChiCanhComicDetail.setComic(comicService.findById(10));
        thanChiCanhComicDetail.setStatus(Status.UPDATING);
        thanChiCanhComicDetail.setDescription("Thần Giới bị tấn công bởi một ngoại lực thần bí. Trò chơi Thần Chiến kéo dài hàng nghìn năm luân hồi và mỗi lần đều kết thúc với sự thất bại tuyệt vọng của các vị thần. ");
        thanChiCanhComicDetail.setCategories(List.of(categoryService.findById(2), categoryService.findById(4)));

        comicDetailService.save(OnePiececomicDetail);
        comicDetailService.save(tgdqComiccomicDetail);
        comicDetailService.save(onePunchManComiccomicDetail);
        comicDetailService.save(linh_khi_khoi_phuc_tu_ca_chep_tien_hoa_thanh_than_longComicDetail);
        comicDetailService.save(tltdComicDetail);
        comicDetailService.save(daiquangialamahoangComicDetail);
        comicDetailService.save(bachluyenthanhthanDetail);
        comicDetailService.save(Mikako_SanComicDetail);
        comicDetailService.save(nguyenTonComicDetail);
        comicDetailService.save(thanChiCanhComicDetail);

    }
}
