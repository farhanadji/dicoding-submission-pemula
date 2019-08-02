package com.farhan.submissionfilm.Data;

import com.farhan.submissionfilm.Model.Movie;

import java.util.ArrayList;

public class MovieData {

    public static String[][] data = new String[][]{
            {"0","The Lion King", "Simba mengidolakan ayahnya, Raja Mufasa, dan mengambil hati takdir kerajaannya sendiri. Tetapi tidak semua orang di kerajaan itu merayakan kedatangan anaknya yang baru. Scar, saudara lelaki Mufasa — dan mantan pewaris takhta — memiliki rencana sendiri.", "https://image.tmdb.org/t/p/w500/pSfwXxP94xktZKn3UaeVe6VdFZl.jpg"},
            {"1","Avengers: Endgame", "Terdampar di luar angkasa tanpa persediaan makanan dan minuman, Tony Stark berusaha mengirim pesan untuk Pepper Potts dimana persediaan oksigen mulai menipis. Sementara itu para Avengers yang tersisa harus menemukan cara untuk mengembalikan 50% mahluk di seluruh dunia yang telah dilenyapkan oleh Thanos.","https://image.tmdb.org/t/p/w500/or06FN3Dka5tukK1e9sl16pB3iy.jpg"},
            {"2","Fast & Furious Presents: Hobbs & Shaw","A spinoff of The Fate of the Furious, focusing on Johnson's US Diplomatic Security Agent Luke Hobbs forming an unlikely alliance with Statham's Deckard Shaw.","https://image.tmdb.org/t/p/w500/keym7MPn1icW1wWfzMnW3HeuzWU.jpg"},
            {"3","Spider-Man: Far from Home","Peter Parker dan teman-temannya melakukan perjalanan musim panas ke Eropa. Namun, mereka hampir tidak dapat beristirahat - Peter harus setuju untuk membantu Nick Fury mengungkap misteri makhluk yang menyebabkan bencana alam dan kehancuran di seluruh benua.","https://image.tmdb.org/t/p/w500/rjbNpRMoVvqHmhmksbokcyCr7wn.jpg"},
            {"4","Alita: Battle Angel","Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.","https://image.tmdb.org/t/p/w500/xRWht48C2V8XNfzvPehyClOvDni.jpg"},
            {"5","Avengers: Infinity War","Karena Avengers dan sekutunya terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh seorang pahlawan, bahaya baru telah muncul dari bayangan kosmik: Thanos. Seorang lalim penghujatan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan yang tak terbayangkan, dan menggunakannya untuk menimbulkan kehendak memutar pada semua realitas. Segala sesuatu yang telah diperjuangkan oleh Avengers telah berkembang hingga saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.","https://image.tmdb.org/t/p/w500/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg"},
            {"6","Toy Story 4","Woody selalu yakin tentang tempatnya di dunia dan bahwa prioritasnya adalah merawat anaknya, apakah itu Andy atau Bonnie. Tetapi ketika Bonnie menambahkan mainan baru yang enggan disebut \"Forky\" ke kamarnya, petualangan perjalanan bersama teman-teman lama dan baru akan menunjukkan kepada Woody seberapa besar dunia untuk sebuah mainan.","https://image.tmdb.org/t/p/w500/w9kR8qbmQ01HwnvK4alvnQ2ca0L.jpg"},
            {"7","Pokémon Detective Pikachu","Tim Goodman harus bekerja keras setelah ayahnya Harry Goodman hilang pasca mengalami sebuah kecelakaan mobil. Dalam penyelidikannya, Tim bertemu dengan Detective Pikachu. Keduanya bekerjasama mengungkap hilangnya Harry.","https://image.tmdb.org/t/p/w500/l1fZUbfY7GTNVYsYwrwsSmNHTeJ.jpg"},
            {"8","Aladdin","Aladdin adalah penjahat jalanan baik hati. Ia akan bersaing dengan Jafar seorang penyihir jahat untuk memperebutkan lampu ajaib yang memiliki kekuatan membuat keinginan terdalam mereka menjadi kenyataan.","https://image.tmdb.org/t/p/w500/3iYQTLGoy7QnjcUYRJy4YrAgGvp.jpg"},
            {"9","John Wick","Ex-hitman John Wick comes out of retirement to track down the gangsters that took everything from him.","https://image.tmdb.org/t/p/w500/b9uYMMbm87IBFOq59pppvkkkgNg.jpg"}
    };

    public static ArrayList<Movie> getListData() {
        ArrayList<Movie> list = new ArrayList<>();
        for(String[] aData : data){
            Movie mov = new Movie();
            mov.setId(Integer.parseInt(aData[0]));
            mov.setTitle(aData[1]);
            mov.setDesc(aData[2]);
            mov.setPhoto(aData[3]);

            list.add(mov);
        }
        return list;
    }

}
