package com.nonglam.ILoveTruyen.dataLoader;

import com.nonglam.ILoveTruyen.model.Chapter;
import com.nonglam.ILoveTruyen.model.ComicDetail;
import com.nonglam.ILoveTruyen.model.ContentImg;
import com.nonglam.ILoveTruyen.service.ChapterService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
@Controller
@Order(6)
public class ChapterLoader implements CommandLineRunner {
    private final ChapterService chapterService;

    public ChapterLoader(ChapterService chapterService) {
        this.chapterService = chapterService;
    }

    @Override
    public void run(String... args) throws Exception {
        //one piece
        var onePieceChapter1 = new Chapter();
        onePieceChapter1.setCount(1);

        var onePieceComicDetail1 = new ComicDetail();
        onePieceComicDetail1.setId(1);
        onePieceChapter1.setComicDetail(onePieceComicDetail1);

        chapterService.save(onePieceChapter1);

        var onePieceChapter1Image1 = new ContentImg(0, 1, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece-128-chap-1-0.jpg?alt=media&token=8da90f6a-c701-4fae-9ede-4972036ec768", onePieceChapter1);
        var onePieceChapter1Image2 = new ContentImg(0, 2, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-1%2Fone-piece-128-chap-1-1.jpg?alt=media&token=ec9608dc-6bde-409b-8bd0-594fc7326c22", onePieceChapter1);
        var onePieceChapter1Image3 = new ContentImg(0, 3, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-1%2Fone-piece-128-chap-1-2.jpg?alt=media&token=02e267f4-acb1-4584-bfc6-b7adaa1640eb", onePieceChapter1);
        var onePieceChapter1Image4 = new ContentImg(0, 4, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-1%2Fone-piece-128-chap-1-3.jpg?alt=media&token=dfa254b4-c784-4f95-8a31-826a7fb63d19", onePieceChapter1);
        var onePieceChapter1Image5 = new ContentImg(0, 5, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-1%2Fone-piece-128-chap-1-4.jpg?alt=media&token=a81129f4-3219-4b0a-bc44-6bce700fce6d", onePieceChapter1);
        var onePieceChapter1Image6 = new ContentImg(0, 6, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-1%2Fone-piece-128-chap-1-5.jpg?alt=media&token=372b96fd-821a-4f09-9569-19ae6ff57b78", onePieceChapter1);
        var onePieceChapter1Image7 = new ContentImg(0, 7, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-1%2Fone-piece-128-chap-1-6.jpg?alt=media&token=0835fdbf-93eb-4d1a-ac01-0fceaaac7c75", onePieceChapter1);
        var onePieceChapter1Image8 = new ContentImg(0, 8, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-1%2Fone-piece-128-chap-1-7.jpg?alt=media&token=983b20df-3e30-4d0b-91fc-2d12362807a0", onePieceChapter1);
        var onePieceChapter1Image9 = new ContentImg(0, 9, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-1%2Fone-piece-128-chap-1-8.jpg?alt=media&token=413b7b56-3d59-4aac-adb9-8ba96f8aa881", onePieceChapter1);
        var onePieceChapter1Image10 = new ContentImg(0, 10, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-1%2Fone-piece-128-chap-1-9.jpg?alt=media&token=5b9dcf63-8709-42da-ad59-3c4a81e4832e", onePieceChapter1);
        var onePieceChapter1Image11 = new ContentImg(0, 11, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-1%2Fone-piece-128-chap-1-10.jpg?alt=media&token=46de91df-e497-4f92-bc03-e7b63d42ac2d", onePieceChapter1);
        var onePieceChapter1Image12 = new ContentImg(0, 12, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-1%2Fone-piece-128-chap-1-11.jpg?alt=media&token=e80af370-1964-4456-bf9e-9c384c23df01", onePieceChapter1);
        var onePieceChapter1Image13 = new ContentImg(0, 13, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-1%2Fone-piece-128-chap-1-12.jpg?alt=media&token=204d5dba-0dc4-4411-808c-0a3a02d242a2", onePieceChapter1);
        var onePieceChapter1Image14 = new ContentImg(0, 14, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-1%2Fone-piece-128-chap-1-13.jpg?alt=media&token=1b5c906d-26bb-4b0a-9ce9-ede4d25277d4", onePieceChapter1);
        var onePieceChapter1Image15 = new ContentImg(0, 15, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-1%2Fone-piece-128-chap-1-14.jpg?alt=media&token=a6079c7b-5dbe-4a2d-ab30-9925fd3cae5c", onePieceChapter1);
        var onePieceChapter1Images = List.of(onePieceChapter1Image1, onePieceChapter1Image2, onePieceChapter1Image3
                ,onePieceChapter1Image4, onePieceChapter1Image5,onePieceChapter1Image6,onePieceChapter1Image7
                ,onePieceChapter1Image8,onePieceChapter1Image9,onePieceChapter1Image10,onePieceChapter1Image11,
                onePieceChapter1Image12, onePieceChapter1Image13,onePieceChapter1Image14,onePieceChapter1Image15);

        var onePieceChapter2 = new Chapter();
        onePieceChapter2.setCount(2);

        var onePieceComicDetail2 = new ComicDetail();
        onePieceComicDetail2.setId(1);
        onePieceChapter2.setComicDetail(onePieceComicDetail2);

        chapterService.save(onePieceChapter2);
        var onePieceChapter2Image1 = new ContentImg(0, 1, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-2%2Fone-piece-128-chap-2-0.jpg?alt=media&token=2de8935a-b287-4c89-8674-97fd61e54e7f", onePieceChapter2);
        var onePieceChapter2Image2 = new ContentImg(0, 2, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-2%2Fone-piece-128-chap-2-1.jpg?alt=media&token=06d5d45f-f1ab-48a3-9380-c9be2b18f51e", onePieceChapter2);
        var onePieceChapter2Image3 = new ContentImg(0, 3, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-2%2Fone-piece-128-chap-2-2.jpg?alt=media&token=1d9ac1dd-f91d-4584-8467-e6330ab639e5", onePieceChapter2);
        var onePieceChapter2Image4 = new ContentImg(0, 4, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-2%2Fone-piece-128-chap-2-3.jpg?alt=media&token=83c7a94d-c078-4fb3-81fa-ed35ea26f236", onePieceChapter2);
        var onePieceChapter2Image5 = new ContentImg(0, 5, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-2%2Fone-piece-128-chap-2-4.jpg?alt=media&token=51c702eb-4f25-4dde-bfff-3062910d641a", onePieceChapter2);
        var onePieceChapter2Image6 = new ContentImg(0, 6, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-2%2Fone-piece-128-chap-2-5.jpg?alt=media&token=143462fe-1613-4139-8389-6c635f53ce74", onePieceChapter2);
        var onePieceChapter2Image7 = new ContentImg(0, 7, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-2%2Fone-piece-128-chap-2-6.jpg?alt=media&token=a971414c-9070-4fcc-8963-8f70ebccb97e", onePieceChapter2);
        var onePieceChapter2Image8 = new ContentImg(0, 8, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-2%2Fone-piece-128-chap-2-7.jpg?alt=media&token=6997099f-c3ca-4436-98e0-a937a6fbd948", onePieceChapter2);
        var onePieceChapter2Image9 = new ContentImg(0, 9, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-2%2Fone-piece-128-chap-2-8.jpg?alt=media&token=da3aba9a-795e-40f2-9e31-488f714a4db1", onePieceChapter2);
        var onePieceChapter2Image10 = new ContentImg(0, 10, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-2%2Fone-piece-128-chap-2-9.jpg?alt=media&token=051d53dd-1d02-460a-ad8a-040a9f41a6ae", onePieceChapter2);
        var onePieceChapter2Image11 = new ContentImg(0, 11, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-2%2Fone-piece-128-chap-2-10.jpg?alt=media&token=03ce94a6-81c7-4561-82dd-076aa6d2530a", onePieceChapter2);
        var onePieceChapter2Image12 = new ContentImg(0, 12, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-2%2Fone-piece-128-chap-2-11.jpg?alt=media&token=ec832a10-41b2-49f3-a4dd-ecb5deb70b94", onePieceChapter2);
        var onePieceChapter2Image13 = new ContentImg(0, 13, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-2%2Fone-piece-128-chap-2-12.jpg?alt=media&token=ed03d4df-7799-4339-b204-6790307357c6", onePieceChapter2);
        var onePieceChapter2Image14 = new ContentImg(0, 14, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-2%2Fone-piece-128-chap-2-13.jpg?alt=media&token=8775d607-34fe-47e4-977d-6ab023854848", onePieceChapter2);
        var onePieceChapter2Image15 = new ContentImg(0, 15, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-2%2Fone-piece-128-chap-2-14.jpg?alt=media&token=fa66dfee-6d2d-4790-b862-43b3c4723823", onePieceChapter2);

        var onePieceChapter2Images = List.of(
                onePieceChapter2Image1,
                onePieceChapter2Image2,
                onePieceChapter2Image3,
                onePieceChapter2Image4,
                onePieceChapter2Image5,
                onePieceChapter2Image6,
                onePieceChapter2Image7,
                onePieceChapter2Image8,
                onePieceChapter2Image9,
                onePieceChapter2Image10,
                onePieceChapter2Image11,
                onePieceChapter2Image12,
                onePieceChapter2Image13,
                onePieceChapter2Image14,
                onePieceChapter2Image15
        );

        var onePieceChapter3 = new Chapter();
        onePieceChapter3.setCount(3);

        var onePieceComicDetail3 = new ComicDetail();
        onePieceComicDetail3.setId(1);
        onePieceChapter3.setComicDetail(onePieceComicDetail3);

        chapterService.save(onePieceChapter3);
        var onePieceChapter3Image1 = new ContentImg(0, 1, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-3%2Fone-piece-128-chap-3-0.jpg?alt=media&token=ea5f5324-8b61-4b12-be04-18e1a8ef7aec", onePieceChapter3);
        var onePieceChapter3Image2 = new ContentImg(0, 2, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-3%2Fone-piece-128-chap-3-1.jpg?alt=media&token=c459aebc-e3ff-408a-88cd-29d8a4600400", onePieceChapter3);
        var onePieceChapter3Image3 = new ContentImg(0, 3, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-3%2Fone-piece-128-chap-3-2.jpg?alt=media&token=7f353377-82c2-47ef-873b-20cad7723e79", onePieceChapter3);
        var onePieceChapter3Image4 = new ContentImg(0, 4, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-3%2Fone-piece-128-chap-3-3.jpg?alt=media&token=1a3f6bb0-3874-4063-b7f9-4ecb0060bc32", onePieceChapter3);
        var onePieceChapter3Image5 = new ContentImg(0, 5, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-3%2Fone-piece-128-chap-3-4.jpg?alt=media&token=fb6f6412-9e0d-47c8-9629-1c30d1f04d46", onePieceChapter3);
        var onePieceChapter3Image6 = new ContentImg(0, 6, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-3%2Fone-piece-128-chap-3-5.jpg?alt=media&token=98c79166-c704-4e48-b93b-2680a4575d4d", onePieceChapter3);
        var onePieceChapter3Image7 = new ContentImg(0, 7, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-3%2Fone-piece-128-chap-3-6.jpg?alt=media&token=e6d46b52-b52b-4a3c-bc75-b77747d718c2", onePieceChapter3);
        var onePieceChapter3Image8 = new ContentImg(0, 8, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-3%2Fone-piece-128-chap-3-7.jpg?alt=media&token=5c0ce217-0cfe-47fe-9f15-ebeb0793c301", onePieceChapter3);
        var onePieceChapter3Image9 = new ContentImg(0, 9, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-3%2Fone-piece-128-chap-3-8.jpg?alt=media&token=5a6368ec-2b56-49c1-a3a9-689edbc2f72a", onePieceChapter3);
        var onePieceChapter3Image10 = new ContentImg(0, 10, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-3%2Fone-piece-128-chap-3-9.jpg?alt=media&token=462636b6-070e-4291-abfc-13affd7014c2", onePieceChapter3);
        var onePieceChapter3Images = List.of(
                onePieceChapter3Image1,
                onePieceChapter3Image2,
                onePieceChapter3Image3,
                onePieceChapter3Image4,
                onePieceChapter3Image5,
                onePieceChapter3Image6,
                onePieceChapter3Image7,
                onePieceChapter3Image8,
                onePieceChapter3Image9,
                onePieceChapter3Image10
        );

        onePieceChapter1.setContentImgList(onePieceChapter1Images);
        chapterService.save(onePieceChapter1);

        onePieceChapter2.setContentImgList(onePieceChapter2Images);
        chapterService.save(onePieceChapter2);
        onePieceChapter3.setContentImgList(onePieceChapter3Images);
        chapterService.save(onePieceChapter3);

        // Thanh gươm diệt quỷ
        var tgdqChapter1 = new Chapter();
        tgdqChapter1.setCount(1);

        var tgdqComicDetail1 = new ComicDetail();
        tgdqComicDetail1.setId(2);
        tgdqChapter1.setComicDetail(tgdqComicDetail1);

        chapterService.save(tgdqChapter1);

        var tgdqChapter1Image1 = new ContentImg(0, 1, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/thanh-guom-diet-quy%2Fthanh-guom-diet-quy-2624-chap-1%2Fthanh-guom-diet-quy-2624-chap-1-1.jpg?alt=media&token=8719278a-0171-43d5-a8ad-5a1d011fa89f", tgdqChapter1);
        var tgdqChapter1Image2 = new ContentImg(0, 2, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/thanh-guom-diet-quy%2Fthanh-guom-diet-quy-2624-chap-1%2Fthanh-guom-diet-quy-2624-chap-1-2.jpg?alt=media&token=d6a8c8ca-7d32-4a71-b7d5-6f7950cbc8b8", tgdqChapter1);
        var tgdqChapter1Image3 = new ContentImg(0, 3, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/thanh-guom-diet-quy%2Fthanh-guom-diet-quy-2624-chap-1%2Fthanh-guom-diet-quy-2624-chap-1-3.jpg?alt=media&token=e054d3ec-2cc5-43e9-aa82-ed9070cc2802", tgdqChapter1);
        var tgdqChapter1Image4 = new ContentImg(0, 4, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/thanh-guom-diet-quy%2Fthanh-guom-diet-quy-2624-chap-1%2Fthanh-guom-diet-quy-2624-chap-1-4.jpg?alt=media&token=4b48b681-e6c6-4e0b-a9de-aa800630483a", tgdqChapter1);
        var tgdqChapter1Image5 = new ContentImg(0, 5, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/thanh-guom-diet-quy%2Fthanh-guom-diet-quy-2624-chap-1%2Fthanh-guom-diet-quy-2624-chap-1-5.jpg?alt=media&token=0c1894f3-f8f5-412e-a762-c600a8ed04b1", tgdqChapter1);
        var tgdqChapter1Image6 = new ContentImg(0, 6, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/thanh-guom-diet-quy%2Fthanh-guom-diet-quy-2624-chap-1%2Fthanh-guom-diet-quy-2624-chap-1-6.jpg?alt=media&token=60f37cf7-4650-43db-b844-6e8dd5e88cf0", tgdqChapter1);
        var tgdqChapter1Image7 = new ContentImg(0, 7, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/thanh-guom-diet-quy%2Fthanh-guom-diet-quy-2624-chap-1%2Fthanh-guom-diet-quy-2624-chap-1-7.jpg?alt=media&token=2cd2a42e-9cad-4b3e-920a-b29e1ec94b41", tgdqChapter1);

        var tgdqChapter1Images = List.of(
                tgdqChapter1Image1,
                tgdqChapter1Image2,
                tgdqChapter1Image3,
                tgdqChapter1Image4,
                tgdqChapter1Image5,
                tgdqChapter1Image6,
                tgdqChapter1Image7
        );

        tgdqChapter1.setContentImgList(tgdqChapter1Images);
        chapterService.save(tgdqChapter1);

        var tgdqChapter2 = new Chapter();
        tgdqChapter2.setCount(2);

        var tgdqComicDetail2 = new ComicDetail();
        tgdqComicDetail2.setId(2);
        tgdqChapter2.setComicDetail(tgdqComicDetail2);

        chapterService.save(tgdqChapter2);

        var tgdqChapter2Image1 = new ContentImg(0, 1, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/thanh-guom-diet-quy%2Fthanh-guom-diet-quy-2624-chap-2%2Fimageye___-_thanh-guom-diet-quy-2.png?alt=media&token=26e68964-4362-4365-b1ef-853675ebf38a", tgdqChapter2);
        var tgdqChapter2Image2 = new ContentImg(0, 2, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/thanh-guom-diet-quy%2Fthanh-guom-diet-quy-2624-chap-2%2Fimageye___-_thanh-guom-diet-quy-3.png?alt=media&token=2a272443-a3ac-4357-b02f-51c5a0750c20", tgdqChapter2);
        var tgdqChapter2Image3 = new ContentImg(0, 3, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/thanh-guom-diet-quy%2Fthanh-guom-diet-quy-2624-chap-2%2Fimageye___-_thanh-guom-diet-quy-4.png?alt=media&token=63ce42b4-b63e-48d6-b76d-7d62f0d7905e", tgdqChapter2);
        var tgdqChapter2Image4 = new ContentImg(0, 4, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/thanh-guom-diet-quy%2Fthanh-guom-diet-quy-2624-chap-2%2Fimageye___-_thanh-guom-diet-quy-5.png?alt=media&token=17959565-4c74-4118-9f3f-0d6fbcee1885", tgdqChapter2);
        var tgdqChapter2Image5 = new ContentImg(0, 5, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/thanh-guom-diet-quy%2Fthanh-guom-diet-quy-2624-chap-2%2Fimageye___-_thanh-guom-diet-quy-6.png?alt=media&token=2b24ba9e-be55-4ac0-bf2c-ab8a5430a3b4", tgdqChapter2);
        var tgdqChapter2Image6 = new ContentImg(0, 6, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/thanh-guom-diet-quy%2Fthanh-guom-diet-quy-2624-chap-2%2Fimageye___-_thanh-guom-diet-quy-7.png?alt=media&token=efd2679d-c8a7-4068-93c6-ed15532e9332", tgdqChapter2);
        var tgdqChapter2Image7 = new ContentImg(0, 7, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/thanh-guom-diet-quy%2Fthanh-guom-diet-quy-2624-chap-2%2Fimageye___-_thanh-guom-diet-quy-8.png?alt=media&token=5b65b728-d54d-472b-93e9-9c4dec94eba8", tgdqChapter2);
        var tgdqChapter2Image8 = new ContentImg(0, 8, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/thanh-guom-diet-quy%2Fthanh-guom-diet-quy-2624-chap-2%2Fimageye___-_thanh-guom-diet-quy-9.png?alt=media&token=e69eca0f-d7e4-4dff-ba90-cfb037772aab", tgdqChapter2);

        var tgdqChapter2Images = List.of(
                tgdqChapter2Image1,
                tgdqChapter2Image2,
                tgdqChapter2Image3,
                tgdqChapter2Image4,
                tgdqChapter2Image5,
                tgdqChapter2Image6,
                tgdqChapter2Image7,
                tgdqChapter2Image8
        );

        tgdqChapter2.setContentImgList(tgdqChapter2Images);
        chapterService.save(tgdqChapter2);

        var tgdqChapter3 = new Chapter();
        tgdqChapter3.setCount(3);

        var tgdqComicDetail3 = new ComicDetail();
        tgdqComicDetail3.setId(2);
        tgdqChapter3.setComicDetail(tgdqComicDetail3);

        chapterService.save(tgdqChapter3);
        var tgdqChapter3Image1 = new ContentImg(0, 1, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/thanh-guom-diet-quy%2Fthanh-guom-diet-quy-2624-chap-3%2Fimageye___-_thanh-guom-diet-quy-2.png?alt=media&token=1f62531f-d432-4fcb-a2fa-e6b57bdbc3e8", onePieceChapter3);
        var tgdqChapter3Image2 = new ContentImg(0, 2, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/thanh-guom-diet-quy%2Fthanh-guom-diet-quy-2624-chap-3%2Fimageye___-_thanh-guom-diet-quy-3.png?alt=media&token=2634a2d1-619a-4453-abbd-1e1078d05036", tgdqChapter3);
        var tgdqChapter3Image3 = new ContentImg(0, 3, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/thanh-guom-diet-quy%2Fthanh-guom-diet-quy-2624-chap-3%2Fimageye___-_thanh-guom-diet-quy-4.png?alt=media&token=5e728d17-2757-4f50-9cd8-4df95a7f2b3e", tgdqChapter3);
        var tgdqChapter3Image4 = new ContentImg(0, 4, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/thanh-guom-diet-quy%2Fthanh-guom-diet-quy-2624-chap-3%2Fimageye___-_thanh-guom-diet-quy-5.png?alt=media&token=1b740008-421c-48e2-a44c-1fdae1fc569c", tgdqChapter3);
        var tgdqChapter3Image5 = new ContentImg(0, 5, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/thanh-guom-diet-quy%2Fthanh-guom-diet-quy-2624-chap-3%2Fimageye___-_thanh-guom-diet-quy-6.png?alt=media&token=f424d67f-141a-4894-aadf-ac9288ff1e9d", tgdqChapter3);

        var tgdqChapter3Images = List.of(
                tgdqChapter3Image1,
                tgdqChapter3Image2,
                tgdqChapter3Image3,
                tgdqChapter3Image4,
                tgdqChapter3Image5
        );

        tgdqChapter3.setContentImgList(tgdqChapter3Images);
        chapterService.save(tgdqChapter3);

        //One Punch Man
        var onePunchManChapter1 = new Chapter();
        onePunchManChapter1.setCount(1);

        var onePunchManComicDetail1 = new ComicDetail();
        onePunchManComicDetail1.setId(3);
        onePunchManChapter1.setComicDetail(onePunchManComicDetail1);

        chapterService.save(onePunchManChapter1);

        var onePunchManChapter1Image1 = new ContentImg(0, 1, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-1%2Fonepunch-man-244-chap-1-2.jpeg?alt=media&token=224577b5-2257-42f9-b38e-5423e80c6337", onePunchManChapter1);
        var onePunchManChapter1Image2 = new ContentImg(0, 2, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-1%2Fonepunch-man-244-chap-1-3.jpeg?alt=media&token=4aa2ec91-af30-4ef6-9a03-8a60dca27f27", onePunchManChapter1);
        var onePunchManChapter1Image3 = new ContentImg(0, 3, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-1%2Fonepunch-man-244-chap-1-5.jpeg?alt=media&token=6e0071c0-6309-48b6-b7a8-25df6adc730f", onePunchManChapter1);
        var onePunchManChapter1Image4 = new ContentImg(0, 4, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-1%2Fonepunch-man-244-chap-1-6.jpeg?alt=media&token=6b8b4e46-1733-45bb-b1ca-009cd51a3b86", onePunchManChapter1);
        var onePunchManChapter1Image5 = new ContentImg(0, 5, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-1%2Fonepunch-man-244-chap-1-7.jpeg?alt=media&token=4edff761-e943-4c4e-a0f0-31e3ee206cd4", onePunchManChapter1);
        var onePunchManChapter1Image6 = new ContentImg(0, 6, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-1%2Fonepunch-man-244-chap-1-8.jpeg?alt=media&token=c0408627-a637-4b06-8b96-63cd8c806421", onePunchManChapter1);
        var onePunchManChapter1Image7 = new ContentImg(0, 7, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-1%2Fonepunch-man-244-chap-1-9.jpeg?alt=media&token=75e16ec5-3082-4739-9eb3-32f50c115c74", onePunchManChapter1);
        var onePunchManChapter1Image8 = new ContentImg(0, 8, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-1%2Fonepunch-man-244-chap-1-10.jpeg?alt=media&token=017d247c-8060-4e20-ba6f-1082dacf53be", onePunchManChapter1);
        var onePunchManChapter1Image9 = new ContentImg(0, 9, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-1%2Fonepunch-man-244-chap-1-11.jpeg?alt=media&token=59a893ad-a388-44d5-9d3e-4bbd88c67c9a", onePunchManChapter1);
        var onePunchManChapter1Image10 = new ContentImg(0, 10, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-1%2Fonepunch-man-244-chap-1-12.jpeg?alt=media&token=07285545-5e78-4786-be8a-ce5ac9b56426", onePunchManChapter1);
        var onePunchManChapter1Image11 = new ContentImg(0, 11, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-1%2Fonepunch-man-244-chap-1-13.jpeg?alt=media&token=44b60914-c6bb-467a-a6d4-7be2277fe59f", onePunchManChapter1);
        var onePunchManChapter1Image12 = new ContentImg(0, 12, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-1%2Fonepunch-man-244-chap-1-14.jpeg?alt=media&token=4ca0d72c-7e9e-4811-9991-171f8b45bcc0", onePunchManChapter1);
        var onePunchManChapter1Image13 = new ContentImg(0, 13, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-1%2Fonepunch-man-244-chap-1-15.jpeg?alt=media&token=aa93fa72-d4d2-43cc-ab0a-77b2a00b98a7", onePunchManChapter1);
        var onePunchManChapter1Image14 = new ContentImg(0, 14, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-1%2Fonepunch-man-244-chap-1-16.jpeg?alt=media&token=62679142-46a4-4a69-b464-38c0ba09dc33", onePunchManChapter1);
        var onePunchManChapter1Image15 = new ContentImg(0, 15, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-1%2Fonepunch-man-244-chap-1-17.jpeg?alt=media&token=22392408-ec49-49b4-91d7-eee0a5f28557", onePunchManChapter1);

        var onePunchManChapter1Images = List.of(
                onePunchManChapter1Image1,
                onePunchManChapter1Image2,
                onePunchManChapter1Image3,
                onePunchManChapter1Image4,
                onePunchManChapter1Image5,
                onePunchManChapter1Image6,
                onePunchManChapter1Image7,
                onePunchManChapter1Image8,
                onePunchManChapter1Image9,
                onePunchManChapter1Image10,
                onePunchManChapter1Image11,
                onePunchManChapter1Image12,
                onePunchManChapter1Image13,
                onePunchManChapter1Image14,
                onePunchManChapter1Image15
        );

        onePunchManChapter1.setContentImgList(onePunchManChapter1Images);
        chapterService.save(onePunchManChapter1);

        var onePunchManChapter2 = new Chapter();
        onePunchManChapter2.setCount(2);

        var onePunchManComicDetail2 = new ComicDetail();
        onePunchManComicDetail2.setId(3);
        onePunchManChapter2.setComicDetail(onePunchManComicDetail2);

        chapterService.save(onePunchManChapter2);

        var onePunchManChapter2Image1 = new ContentImg(0, 1, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-1%2Fonepunch-man-244-chap-1-17.jpeg?alt=media&token=22392408-ec49-49b4-91d7-eee0a5f28557", onePunchManChapter2);
        var onePunchManChapter2Image2 = new ContentImg(0, 2, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-2%2Fonepunch-man-244-chap-2-3.jpeg?alt=media&token=4611269e-e192-42fe-90f9-4bcae01abba4", onePunchManChapter2);
        var onePunchManChapter2Image3 = new ContentImg(0, 3, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-2%2Fonepunch-man-244-chap-2-4.jpeg?alt=media&token=ec1383ab-5fa7-408a-8c6f-0cc20cbde0b0", onePunchManChapter2);
        var onePunchManChapter2Image4 = new ContentImg(0, 4, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-2%2Fonepunch-man-244-chap-2-5.jpeg?alt=media&token=fd7e3bbf-6205-49e5-b94a-efd2d87447c0", onePunchManChapter2);
        var onePunchManChapter2Image5 = new ContentImg(0, 5, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-2%2Fonepunch-man-244-chap-2-6.jpeg?alt=media&token=bea79a10-ec77-4a02-9f45-994fe0249105", onePunchManChapter2);
        var onePunchManChapter2Image6 = new ContentImg(0, 6, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-2%2Fonepunch-man-244-chap-2-7.jpeg?alt=media&token=127070d5-6ec6-4fd9-82ee-6a06d36275aa", onePunchManChapter2);
        var onePunchManChapter2Image7 = new ContentImg(0, 7, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-2%2Fonepunch-man-244-chap-2-8.jpeg?alt=media&token=49a2c832-4813-40e8-9d52-b0dc4abceec9", onePunchManChapter2);
        var onePunchManChapter2Image8 = new ContentImg(0, 8, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-2%2Fonepunch-man-244-chap-2-9.jpeg?alt=media&token=753bddc4-1dc7-402f-83d3-462c328e194e", onePunchManChapter2);
        var onePunchManChapter2Image9 = new ContentImg(0, 9, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-2%2Fonepunch-man-244-chap-2-10.jpeg?alt=media&token=3239c1e5-372e-4092-a2df-3885f5afb75e", onePunchManChapter2);
        var onePunchManChapter2Image10 = new ContentImg(0, 10, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-2%2Fonepunch-man-244-chap-2-11.jpeg?alt=media&token=45d4bd7c-1a06-4b1e-b8eb-f51d1b720869", onePunchManChapter2);
        var onePunchManChapter2Image11 = new ContentImg(0, 11, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-2%2Fonepunch-man-244-chap-2-12.jpeg?alt=media&token=5acfeca6-b3ec-402b-8d30-bdc97ebceb21", onePunchManChapter2);
        var onePunchManChapter2Image12 = new ContentImg(0, 12, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-2%2Fonepunch-man-244-chap-2-13.jpeg?alt=media&token=86430512-90d1-4c68-98cf-82fe18a28b1d", onePunchManChapter2);
        var onePunchManChapter2Image13 = new ContentImg(0, 13, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-2%2Fonepunch-man-244-chap-2-14.jpeg?alt=media&token=35224268-41a2-4179-977b-21c4b948cde4", onePunchManChapter2);
        var onePunchManChapter2Image14 = new ContentImg(0, 14, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/onepunch-man%2Fonepunch-man-244-chap-2%2Fonepunch-man-244-chap-2-15.jpeg?alt=media&token=ad0b3c38-70bc-4dfa-89c0-16ed63703637", onePunchManChapter2);

        var onePunchManChapter2Images = List.of(
                onePunchManChapter2Image1,
                onePunchManChapter2Image2,
                onePunchManChapter2Image3,
                onePunchManChapter2Image4,
                onePunchManChapter2Image5,
                onePunchManChapter2Image6,
                onePunchManChapter2Image7,
                onePunchManChapter2Image8,
                onePunchManChapter2Image9,
                onePunchManChapter2Image10,
                onePunchManChapter2Image11,
                onePunchManChapter2Image12,
                onePunchManChapter2Image13,
                onePunchManChapter2Image14
        );

        onePunchManChapter2.setContentImgList(onePunchManChapter2Images);
        chapterService.save(onePunchManChapter2);


        //Linh Khí Khôi Phục: Ta Mỗi Ngày Thu Được Một Cái Kỹ Năng Mới
        var linhKhiKhoiPhucChapter1 = new Chapter();
        linhKhiKhoiPhucChapter1.setCount(1);

        var linhKhiKhoiPhucComicDetail1 = new ComicDetail();
        linhKhiKhoiPhucComicDetail1.setId(4);
        linhKhiKhoiPhucChapter1.setComicDetail(linhKhiKhoiPhucComicDetail1);

        chapterService.save(linhKhiKhoiPhucChapter1);

        var linhKhiKhoiPhucChapter1Image1 = new ContentImg(0, 1, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-1%2F003.jpg?alt=media&token=1e933f6c-9eb3-41d5-a1be-a16f38767059", linhKhiKhoiPhucChapter1);
        var linhKhiKhoiPhucChapter1Image2 = new ContentImg(0, 2, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-1%2F004.jpg?alt=media&token=906deab7-32c9-4e87-bb7c-91547da8591e", linhKhiKhoiPhucChapter1);
        var linhKhiKhoiPhucChapter1Image3 = new ContentImg(0, 3, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-1%2F006.jpg?alt=media&token=57cf15d1-a845-4021-966c-92a2cb3a2085", linhKhiKhoiPhucChapter1);
        var linhKhiKhoiPhucChapter1Image4 = new ContentImg(0, 4, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-1%2F007.jpg?alt=media&token=363cd704-c2f5-489f-9dfb-4e09aa2a3304", linhKhiKhoiPhucChapter1);
        var linhKhiKhoiPhucChapter1Image5 = new ContentImg(0, 5, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-1%2F008.jpg?alt=media&token=656c220e-c337-44c5-9262-71c0b1bee8aa", linhKhiKhoiPhucChapter1);
        var linhKhiKhoiPhucChapter1Image6 = new ContentImg(0, 6, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-1%2F009.jpg?alt=media&token=57c33cbb-a87c-41db-a490-5b3d777d574a", linhKhiKhoiPhucChapter1);
        var linhKhiKhoiPhucChapter1Image7 = new ContentImg(0, 7, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-1%2F010.jpg?alt=media&token=99e1102e-8c95-47d0-9398-ea51adfa685b", linhKhiKhoiPhucChapter1);
        var linhKhiKhoiPhucChapter1Image8 = new ContentImg(0, 8, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-1%2F011.jpg?alt=media&token=0ef4ac5d-c062-4e30-8256-66d283a3a3a6", linhKhiKhoiPhucChapter1);
        var linhKhiKhoiPhucChapter1Image9 = new ContentImg(0, 9, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-1%2F012.jpg?alt=media&token=0f6c5fc0-cd9c-434e-be45-26440fc9d774", linhKhiKhoiPhucChapter1);
        var linhKhiKhoiPhucChapter1Image10 = new ContentImg(0, 10, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-1%2F013.jpg?alt=media&token=1be9dc40-f2f4-4cde-81b5-0e4555fcf95f", linhKhiKhoiPhucChapter1);

        var linhKhiKhoiPhucChapter1Images = List.of(
                linhKhiKhoiPhucChapter1Image1,
                linhKhiKhoiPhucChapter1Image2,
                linhKhiKhoiPhucChapter1Image3,
                linhKhiKhoiPhucChapter1Image4,
                linhKhiKhoiPhucChapter1Image5,
                linhKhiKhoiPhucChapter1Image6,
                linhKhiKhoiPhucChapter1Image7,
                linhKhiKhoiPhucChapter1Image8,
                linhKhiKhoiPhucChapter1Image9,
                linhKhiKhoiPhucChapter1Image10
        );

        linhKhiKhoiPhucChapter1.setContentImgList(linhKhiKhoiPhucChapter1Images);
        chapterService.save(linhKhiKhoiPhucChapter1);

        var linhKhiKhoiPhucChapter2 = new Chapter();
        linhKhiKhoiPhucChapter2.setCount(2);

        var linhKhiKhoiPhucComicDetail2 = new ComicDetail();
        linhKhiKhoiPhucComicDetail2.setId(4);
        linhKhiKhoiPhucChapter2.setComicDetail(linhKhiKhoiPhucComicDetail2);

        chapterService.save(linhKhiKhoiPhucChapter2);

        var linhKhiKhoiPhucChapter2Image1 = new ContentImg(0, 1, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-2%2F003.jpg?alt=media&token=d21c00d8-7b50-4d9c-80e3-767e7fcf73db", linhKhiKhoiPhucChapter2);
        var linhKhiKhoiPhucChapter2Image2 = new ContentImg(0, 2, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-2%2F004.jpg?alt=media&token=3dd0c72c-98fe-4a8a-a7ea-108763f5ec99", linhKhiKhoiPhucChapter2);
        var linhKhiKhoiPhucChapter2Image3 = new ContentImg(0, 3, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-2%2F006.jpg?alt=media&token=c1ca8363-21ed-4dff-8a02-2040fb8b2050", linhKhiKhoiPhucChapter2);
        var linhKhiKhoiPhucChapter2Image4 = new ContentImg(0, 4, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-2%2F007.jpg?alt=media&token=9c60f8ad-4323-4c77-b48c-bd9ac421f4aa", linhKhiKhoiPhucChapter2);
        var linhKhiKhoiPhucChapter2Image5 = new ContentImg(0, 5, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-2%2F008.jpg?alt=media&token=22b5c458-972f-42ba-a310-02157b2b594f", linhKhiKhoiPhucChapter2);
        var linhKhiKhoiPhucChapter2Image6 = new ContentImg(0, 6, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-2%2F009.jpg?alt=media&token=542a2092-aa3b-4efd-9f81-cd494e965f2f", linhKhiKhoiPhucChapter2);
        var linhKhiKhoiPhucChapter2Image7 = new ContentImg(0, 7, "https://console.firebase.google.com/u/0/project/i-love-truyen/storage/i-love-truyen.appspot.com/files/~2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742~2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-2", linhKhiKhoiPhucChapter2);
        var linhKhiKhoiPhucChapter2Image8 = new ContentImg(0, 8, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-2%2F011.jpg?alt=media&token=fd5fd3fa-10d4-4736-8565-d8fc73824fd8", linhKhiKhoiPhucChapter2);
        var linhKhiKhoiPhucChapter2Image9 = new ContentImg(0, 9, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-2%2F012.jpg?alt=media&token=a7cb0186-37c5-4ed0-a1ce-803bb6db15de", linhKhiKhoiPhucChapter2);
        var linhKhiKhoiPhucChapter2Image10 = new ContentImg(0, 10, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-2%2F013.jpg?alt=media&token=fc37fb32-2511-496f-97ff-19930bb6b8ba", linhKhiKhoiPhucChapter2);

        var linhKhiKhoiPhucChapter2Images = List.of(
                linhKhiKhoiPhucChapter2Image1,
                linhKhiKhoiPhucChapter2Image2,
                linhKhiKhoiPhucChapter2Image3,
                linhKhiKhoiPhucChapter2Image4,
                linhKhiKhoiPhucChapter2Image5,
                linhKhiKhoiPhucChapter2Image6,
                linhKhiKhoiPhucChapter2Image7,
                linhKhiKhoiPhucChapter2Image8,
                linhKhiKhoiPhucChapter2Image9,
                linhKhiKhoiPhucChapter2Image10
        );

        linhKhiKhoiPhucChapter2.setContentImgList(linhKhiKhoiPhucChapter2Images);
        chapterService.save(linhKhiKhoiPhucChapter2);

        var linhKhiKhoiPhucChapter3 = new Chapter();
        linhKhiKhoiPhucChapter3.setCount(3);

        var linhKhiKhoiPhucComicDetail3 = new ComicDetail();
        linhKhiKhoiPhucComicDetail3.setId(4);
        linhKhiKhoiPhucChapter3.setComicDetail(linhKhiKhoiPhucComicDetail3);

        chapterService.save(linhKhiKhoiPhucChapter3);

        var linhKhiKhoiPhucChapter3Image1 = new ContentImg(0, 1, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-2%2F003.jpg?alt=media&token=d21c00d8-7b50-4d9c-80e3-767e7fcf73db", linhKhiKhoiPhucChapter3);
        var linhKhiKhoiPhucChapter3Image2 = new ContentImg(0, 2, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-3%2Fdownload%20(1).jpg?alt=media&token=5a8997f8-106e-44f7-8a9f-185586df9607", linhKhiKhoiPhucChapter3);
        var linhKhiKhoiPhucChapter3Image3 = new ContentImg(0, 3, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-3%2Fdownload%20(2).jpg?alt=media&token=7950cbef-628a-4564-a566-0d06fd4da396", linhKhiKhoiPhucChapter3);
        var linhKhiKhoiPhucChapter3Image4 = new ContentImg(0, 4, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-3%2Fdownload%20(3).jpg?alt=media&token=1428f91c-79f1-41c0-932f-d5f656846164", linhKhiKhoiPhucChapter3);
        var linhKhiKhoiPhucChapter3Image5 = new ContentImg(0, 5, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-3%2Fdownload%20(4).jpg?alt=media&token=403ee108-733e-4c0b-b7b1-c48a5375f226", linhKhiKhoiPhucChapter3);
        var linhKhiKhoiPhucChapter3Image6 = new ContentImg(0, 6, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-3%2Fdownload%20(5).jpg?alt=media&token=2f27246e-87d7-4a57-8cbe-833d5214992b", linhKhiKhoiPhucChapter3);
        var linhKhiKhoiPhucChapter3Image7 = new ContentImg(0, 7, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-3%2Fdownload%20(6).jpg?alt=media&token=20f5d3d3-36ad-42eb-ba08-9d8bf69229ef", linhKhiKhoiPhucChapter3);
        var linhKhiKhoiPhucChapter3Image8 = new ContentImg(0, 8, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-3%2Fdownload%20(7).jpg?alt=media&token=5dd20067-71ab-4842-ac90-0bc6f6a512f9", linhKhiKhoiPhucChapter3);
        var linhKhiKhoiPhucChapter3Image9 = new ContentImg(0, 9, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-3%2Fdownload%20(8).jpg?alt=media&token=fdf9378a-7f23-47b0-b417-d45f3421e88d", linhKhiKhoiPhucChapter3);
        var linhKhiKhoiPhucChapter3Image10 = new ContentImg(0, 10, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/linh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-15742%2Flinh-khi-khoi-phuc-tu-ca-chep-tien-hoa-thanh-than-long-chap-3%2Fdownload%20(9).jpg?alt=media&token=fb1d2b1e-192a-4220-977f-2b53b89e3a6a", linhKhiKhoiPhucChapter3);

        var linhKhiKhoiPhucChapter3Images = List.of(
                linhKhiKhoiPhucChapter3Image1,
                linhKhiKhoiPhucChapter3Image2,
                linhKhiKhoiPhucChapter3Image3,
                linhKhiKhoiPhucChapter3Image4,
                linhKhiKhoiPhucChapter3Image5,
                linhKhiKhoiPhucChapter3Image6,
                linhKhiKhoiPhucChapter3Image7,
                linhKhiKhoiPhucChapter3Image8,
                linhKhiKhoiPhucChapter3Image9,
                linhKhiKhoiPhucChapter3Image10
        );

        linhKhiKhoiPhucChapter3.setContentImgList(linhKhiKhoiPhucChapter3Images);
        chapterService.save(linhKhiKhoiPhucChapter3);

        //Ta là tà đế
        var taLaTaDeChapter1 = new Chapter();
        taLaTaDeChapter1.setCount(1);

        var taLaTaDeComicDetail1 = new ComicDetail();
        taLaTaDeComicDetail1.setId(5);
        taLaTaDeChapter1.setComicDetail(taLaTaDeComicDetail1);

        chapterService.save(taLaTaDeChapter1);

        var taLaTaDeChapter1Image1 = new ContentImg(0, 1, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/ta-la-ta-de%2Fta-la-ta-de-chap-1%2Fdownload%20(1).jpg?alt=media&token=ae63d491-e49c-4404-ba0e-600bec4ee457", taLaTaDeChapter1);
        var taLaTaDeChapter1Image2 = new ContentImg(0, 2, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/ta-la-ta-de%2Fta-la-ta-de-chap-1%2Fdownload%20(2).jpg?alt=media&token=62b329dc-67a4-4e36-833d-e12c2e273001", taLaTaDeChapter1);
        var taLaTaDeChapter1Image3 = new ContentImg(0, 3, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/ta-la-ta-de%2Fta-la-ta-de-chap-1%2Fdownload%20(3).jpg?alt=media&token=438af2bb-0c8c-4fcb-93bf-b21f7f1eb593", taLaTaDeChapter1);
        var taLaTaDeChapter1Image4 = new ContentImg(0, 4, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/ta-la-ta-de%2Fta-la-ta-de-chap-1%2Fdownload%20(4).jpg?alt=media&token=74e9c366-9cfe-4639-97cf-e46072aeb508", taLaTaDeChapter1);
        var taLaTaDeChapter1Image5 = new ContentImg(0, 5, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/ta-la-ta-de%2Fta-la-ta-de-chap-1%2Fdownload%20(5).jpg?alt=media&token=d42ff91e-7a12-4d81-9a7c-29368bab3e69", taLaTaDeChapter1);
        var taLaTaDeChapter1Image6 = new ContentImg(0, 6, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/ta-la-ta-de%2Fta-la-ta-de-chap-1%2Fdownload%20(6).jpg?alt=media&token=0ce8e960-1a82-4b3b-b59d-5f3d0555c555", taLaTaDeChapter1);
        var taLaTaDeChapter1Image7 = new ContentImg(0, 7, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/ta-la-ta-de%2Fta-la-ta-de-chap-1%2Fdownload%20(7).jpg?alt=media&token=86b2cf4b-202d-4547-b28e-294a35f992fb", taLaTaDeChapter1);
        var taLaTaDeChapter1Image8 = new ContentImg(0, 8, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/ta-la-ta-de%2Fta-la-ta-de-chap-1%2Fdownload%20(8).jpg?alt=media&token=f5ace051-f0cd-4d76-bb21-2448313e0829", taLaTaDeChapter1);
        var taLaTaDeChapter1Image9 = new ContentImg(0, 9, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/ta-la-ta-de%2Fta-la-ta-de-chap-1%2Fdownload%20(9).jpg?alt=media&token=0b960c00-dfc6-4f43-ac52-68ee1625c3c5", taLaTaDeChapter1);
        var taLaTaDeChapter1Images = List.of(
                taLaTaDeChapter1Image1,
                taLaTaDeChapter1Image2,
                taLaTaDeChapter1Image3,
                taLaTaDeChapter1Image4,
                taLaTaDeChapter1Image5,
                taLaTaDeChapter1Image6,
                taLaTaDeChapter1Image7,
                taLaTaDeChapter1Image8,
                taLaTaDeChapter1Image9
        );

        taLaTaDeChapter1.setContentImgList(taLaTaDeChapter1Images);
        chapterService.save(taLaTaDeChapter1);

        var taLaTaDeChapter2 = new Chapter();
        taLaTaDeChapter2.setCount(2);

        var taLaTaDeComicDetail2 = new ComicDetail();
        taLaTaDeComicDetail2.setId(5);
        taLaTaDeChapter2.setComicDetail(taLaTaDeComicDetail2);

        chapterService.save(taLaTaDeChapter2);

        var taLaTaDeChapter2Image1 = new ContentImg(0, 1, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/ta-la-ta-de%2Fta-la-ta-de-chap-2%2Fdownload%20(1).jpg?alt=media&token=e57b71f6-c4e9-4720-b2cb-e199305d8ad0", taLaTaDeChapter2);
        var taLaTaDeChapter2Image2 = new ContentImg(0, 2, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/ta-la-ta-de%2Fta-la-ta-de-chap-2%2Fdownload%20(2).jpg?alt=media&token=cc58d200-92ad-4a39-8aa5-1be521615fab", taLaTaDeChapter2);
        var taLaTaDeChapter2Image3 = new ContentImg(0, 3, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/ta-la-ta-de%2Fta-la-ta-de-chap-2%2Fdownload%20(3).jpg?alt=media&token=891328da-2fba-49bb-8bfa-ed1a9d4dac60", taLaTaDeChapter2);
        var taLaTaDeChapter2Image4 = new ContentImg(0, 4, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/ta-la-ta-de%2Fta-la-ta-de-chap-2%2Fdownload%20(4).jpg?alt=media&token=25023afd-6bfc-439f-b5cd-5e44e9f9286b", taLaTaDeChapter2);
        var taLaTaDeChapter2Image5 = new ContentImg(0, 5, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/ta-la-ta-de%2Fta-la-ta-de-chap-2%2Fdownload%20(5).jpg?alt=media&token=52d4b32d-382f-4208-a91a-b7a2d3c11818", taLaTaDeChapter2);
        var taLaTaDeChapter2Image6 = new ContentImg(0, 6, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/ta-la-ta-de%2Fta-la-ta-de-chap-2%2Fdownload%20(6).jpg?alt=media&token=869839b5-2e58-4af8-bc2b-d857f32ef78e", taLaTaDeChapter2);
        var taLaTaDeChapter2Image7 = new ContentImg(0, 7, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/ta-la-ta-de%2Fta-la-ta-de-chap-2%2Fdownload%20(7).jpg?alt=media&token=edc96119-8c82-47ff-a257-39391d341d38", taLaTaDeChapter2);
        var taLaTaDeChapter2Image8 = new ContentImg(0, 8, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/ta-la-ta-de%2Fta-la-ta-de-chap-2%2Fdownload%20(8).jpg?alt=media&token=4c9bea2f-26c2-4dda-b29e-2913ee006177", taLaTaDeChapter2);

        var taLaTaDeChapter2Images = List.of(
                taLaTaDeChapter2Image1,
                taLaTaDeChapter2Image2,
                taLaTaDeChapter2Image3,
                taLaTaDeChapter2Image4,
                taLaTaDeChapter2Image5,
                taLaTaDeChapter2Image6,
                taLaTaDeChapter2Image7,
                taLaTaDeChapter2Image8
        );

        taLaTaDeChapter2.setContentImgList(taLaTaDeChapter2Images);
        chapterService.save(taLaTaDeChapter2);

        var taLaTaDeChapter3 = new Chapter();
        taLaTaDeChapter3.setCount(3);

        var taLaTaDeComicDetail3 = new ComicDetail();
        taLaTaDeComicDetail3.setId(3);
        taLaTaDeChapter3.setComicDetail(taLaTaDeComicDetail3);

        chapterService.save(taLaTaDeChapter3);

        var taLaTaDeChapter3Image1 = new ContentImg(0, 1, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/ta-la-ta-de%2Fta-la-ta-de-chap-3%2Fdownload%20(1).jpg?alt=media&token=9afaf2f0-1426-44e0-a41b-5582fb2a6a46", taLaTaDeChapter3);
        var taLaTaDeChapter3Image2 = new ContentImg(0, 2, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/ta-la-ta-de%2Fta-la-ta-de-chap-3%2Fdownload%20(2).jpg?alt=media&token=4e89d416-d58c-4198-b359-509865178f5d", taLaTaDeChapter3);
        var taLaTaDeChapter3Image3 = new ContentImg(0, 3, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/ta-la-ta-de%2Fta-la-ta-de-chap-3%2Fdownload%20(3).jpg?alt=media&token=f8fc2c69-b2c7-4e30-abd3-5badbaf9f48e", taLaTaDeChapter3);
        var taLaTaDeChapter3Image4 = new ContentImg(0, 4, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/ta-la-ta-de%2Fta-la-ta-de-chap-3%2Fdownload%20(4).jpg?alt=media&token=2f2b4938-4462-4a80-aa89-64fd2da68c1f", taLaTaDeChapter3);
        var taLaTaDeChapter3Image5 = new ContentImg(0, 5, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/ta-la-ta-de%2Fta-la-ta-de-chap-3%2Fdownload%20(5).jpg?alt=media&token=651995c3-fc37-4b2b-9af0-349c4263786a", taLaTaDeChapter3);
        var taLaTaDeChapter3Image6 = new ContentImg(0, 6, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/ta-la-ta-de%2Fta-la-ta-de-chap-3%2Fdownload%20(6).jpg?alt=media&token=c04a4fc7-cd1f-490e-86ee-a59ff213bee2", taLaTaDeChapter3);
        var taLaTaDeChapter3Image7 = new ContentImg(0, 7, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/ta-la-ta-de%2Fta-la-ta-de-chap-3%2Fdownload%20(7).jpg?alt=media&token=f2a6b037-88cf-4025-8950-687c95ea5259", taLaTaDeChapter3);

        var taLaTaDeChapter3Images = List.of(
                taLaTaDeChapter3Image1,
                taLaTaDeChapter3Image2,
                taLaTaDeChapter3Image3,
                taLaTaDeChapter3Image4,
                taLaTaDeChapter3Image5,
                taLaTaDeChapter3Image6,
                taLaTaDeChapter3Image7
        );

        taLaTaDeChapter3.setContentImgList(taLaTaDeChapter3Images);
        chapterService.save(taLaTaDeChapter3);

        //Đại quản gia là ma hoàng
        var daiQuanGiaLaMaHoangChapter1 = new Chapter();
        daiQuanGiaLaMaHoangChapter1.setCount(1);

        var daiQuanGiaLaMaHoangComicDetail1 = new ComicDetail();
        daiQuanGiaLaMaHoangComicDetail1.setId(6);
        daiQuanGiaLaMaHoangChapter1.setComicDetail(daiQuanGiaLaMaHoangComicDetail1);

        chapterService.save(daiQuanGiaLaMaHoangChapter1);

        var daiQuanGiaLaMaHoangChapter1Image1 = new ContentImg(0, 1, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/dai-quan-gia-la-ma-hoang%2Fdai-quan-gia-la-ma-hoang-chap-0%2Fdownload%20(0).jpg?alt=media&token=9021bb1b-b047-40ec-bd3c-aadc6c77a8b7", daiQuanGiaLaMaHoangChapter1);
        var daiQuanGiaLaMaHoangChapter1Image2 = new ContentImg(0, 2, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/dai-quan-gia-la-ma-hoang%2Fdai-quan-gia-la-ma-hoang-chap-0%2Fdownload%20(1).jpg?alt=media&token=a106d54a-9c4f-4ab1-be3d-6ca67bc76c03", daiQuanGiaLaMaHoangChapter1);
        var daiQuanGiaLaMaHoangChapter1Image3 = new ContentImg(0, 3, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/dai-quan-gia-la-ma-hoang%2Fdai-quan-gia-la-ma-hoang-chap-0%2Fdownload%20(2).jpg?alt=media&token=17e6699f-8c39-42ca-a048-f7380ff6746b", daiQuanGiaLaMaHoangChapter1);
        var daiQuanGiaLaMaHoangChapter1Image4 = new ContentImg(0, 4, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/dai-quan-gia-la-ma-hoang%2Fdai-quan-gia-la-ma-hoang-chap-0%2Fdownload%20(3).jpg?alt=media&token=15909c6a-9089-458e-b3cf-d7e5d74c6b4e", daiQuanGiaLaMaHoangChapter1);
        var daiQuanGiaLaMaHoangChapter1Image5 = new ContentImg(0, 5, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/dai-quan-gia-la-ma-hoang%2Fdai-quan-gia-la-ma-hoang-chap-0%2Fdownload%20(4).jpg?alt=media&token=7997e621-c6a8-4fed-8e56-dfb5d4099b40", daiQuanGiaLaMaHoangChapter1);
        var daiQuanGiaLaMaHoangChapter1Image6 = new ContentImg(0, 6, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/dai-quan-gia-la-ma-hoang%2Fdai-quan-gia-la-ma-hoang-chap-0%2Fdownload%20(5).jpg?alt=media&token=f4f17e42-b2b8-4be0-9299-0070b7e3d08f", daiQuanGiaLaMaHoangChapter1);
        var daiQuanGiaLaMaHoangChapter1Image7 = new ContentImg(0, 7, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/dai-quan-gia-la-ma-hoang%2Fdai-quan-gia-la-ma-hoang-chap-0%2Fdownload%20(6).jpg?alt=media&token=68259008-4eae-46e3-b5f3-d88640fb94ca", daiQuanGiaLaMaHoangChapter1);
        var daiQuanGiaLaMaHoangChapter1Image8 = new ContentImg(0, 8, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/dai-quan-gia-la-ma-hoang%2Fdai-quan-gia-la-ma-hoang-chap-0%2Fdownload%20(7).jpg?alt=media&token=371e961a-e5c4-4c9f-bda0-94441bc8f13a", daiQuanGiaLaMaHoangChapter1);

        var daiQuanGiaLaMaHoangChapter1Images = List.of(
                daiQuanGiaLaMaHoangChapter1Image1,
                daiQuanGiaLaMaHoangChapter1Image2,
                daiQuanGiaLaMaHoangChapter1Image3,
                daiQuanGiaLaMaHoangChapter1Image4,
                daiQuanGiaLaMaHoangChapter1Image5,
                daiQuanGiaLaMaHoangChapter1Image6,
                daiQuanGiaLaMaHoangChapter1Image7,
                daiQuanGiaLaMaHoangChapter1Image8
        );

        daiQuanGiaLaMaHoangChapter1.setContentImgList(daiQuanGiaLaMaHoangChapter1Images);
        chapterService.save(daiQuanGiaLaMaHoangChapter1);

        var daiQuanGiaLaMaHoangChapter2 = new Chapter();
        daiQuanGiaLaMaHoangChapter2.setCount(2);

        var daiQuanGiaLaMaHoangComicDetail2 = new ComicDetail();
        daiQuanGiaLaMaHoangComicDetail2.setId(6);
        daiQuanGiaLaMaHoangChapter2.setComicDetail(daiQuanGiaLaMaHoangComicDetail2);

        chapterService.save(daiQuanGiaLaMaHoangChapter2);

        var daiQuanGiaLaMaHoangChapter2Image1 = new ContentImg(0, 1, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/dai-quan-gia-la-ma-hoang%2Fdai-quan-gia-la-ma-hoang-chap-1%2Fdownload%20(0).jpg?alt=media&token=d496cca3-542f-4e6e-a0e3-8001e060d4c8", daiQuanGiaLaMaHoangChapter2);
        var daiQuanGiaLaMaHoangChapter2Image2 = new ContentImg(0, 2, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/dai-quan-gia-la-ma-hoang%2Fdai-quan-gia-la-ma-hoang-chap-1%2Fdownload%20(1).jpg?alt=media&token=38358fb9-e322-4e39-9496-30bb6d7a4478", daiQuanGiaLaMaHoangChapter2);
        var daiQuanGiaLaMaHoangChapter2Image3 = new ContentImg(0, 3, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/dai-quan-gia-la-ma-hoang%2Fdai-quan-gia-la-ma-hoang-chap-1%2Fdownload%20(2).jpg?alt=media&token=da55bd76-4c97-4d67-87da-3133eb6c28e6", daiQuanGiaLaMaHoangChapter2);
        var daiQuanGiaLaMaHoangChapter2Image4 = new ContentImg(0, 4, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/dai-quan-gia-la-ma-hoang%2Fdai-quan-gia-la-ma-hoang-chap-1%2Fdownload%20(3).jpg?alt=media&token=86cc836a-499b-4d75-9a41-03534884e7dc", daiQuanGiaLaMaHoangChapter2);
        var daiQuanGiaLaMaHoangChapter2Image5 = new ContentImg(0, 5, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/dai-quan-gia-la-ma-hoang%2Fdai-quan-gia-la-ma-hoang-chap-1%2Fdownload%20(4).jpg?alt=media&token=4e02f1d9-3ce1-43d4-915a-1ff7608d2469", daiQuanGiaLaMaHoangChapter2);
        var daiQuanGiaLaMaHoangChapter2Image6 = new ContentImg(0, 6, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/dai-quan-gia-la-ma-hoang%2Fdai-quan-gia-la-ma-hoang-chap-1%2Fdownload%20(5).jpg?alt=media&token=0f6d56a7-0ab4-4515-adc7-ad9d03ca4d5d", daiQuanGiaLaMaHoangChapter2);

        var daiQuanGiaLaMaHoangChapter2Images = List.of(
                daiQuanGiaLaMaHoangChapter2Image1,
                daiQuanGiaLaMaHoangChapter2Image2,
                daiQuanGiaLaMaHoangChapter2Image3,
                daiQuanGiaLaMaHoangChapter2Image4,
                daiQuanGiaLaMaHoangChapter2Image5,
                daiQuanGiaLaMaHoangChapter2Image6
        );

        daiQuanGiaLaMaHoangChapter2.setContentImgList(daiQuanGiaLaMaHoangChapter2Images);
        chapterService.save(daiQuanGiaLaMaHoangChapter2);

        //Bách luyện thành thần

    }
}
