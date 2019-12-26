package com.redhoarifin.psico;

public class QuestionBank {

    private String textQuestions [] = {
            "1. Anda sedang berada di dalam ruangan gelap dan diluar terdapat pembunuh yang sedang mencari anda. " +
                    "Tidak ada benda apapun yang dapat dipakai untuk pertahanan diri. Dimanakah anda akan bersembunyi?",
            "2. Anda sedang haus dan menemukan mesin penjual otomatis, namun minuman di dalam mesin penjual otomatis " +
                    "tidak ada yang bermerk, hanya ada warnanya. Lalu, minuman dengan warna apa yang akan anda pilih?",
            "3. Saat anda berada dalam hutan yang gelap, tepat di depan anda terlihat ada rumah musim panas. Saat anda sedang" +
                    " melihat ke arah rumah itu, tiba-tiba ada sesuatu melintas di belakang anda. Apakah yang melintas?",
            "4. Anda seringkali melihat ke arah cermin, tetapi setiap sedang bercermin anda selalu merasa tidak puas. Apa alasannya?",
            "5. Di dinding rumah kosong terdapat prajurit yang sedang terluka. Dimanakah dia terluka?",
            "6. Anda akhirnya memutuskan untuk membunuh orang yang anda benci selama 10 tahun. Lalu anda pergi" +
                    " ke sebuah toko untuk membeli pisau. Ada dua pilihan, pisau harga 60 ribu dan " +
                    "pisau harga 600 ribu. Lalu anda membeli yang 60 ribu tanpa ragu. Apa alasannya?",
            "7. Ada tetanggamu yang jarang sekali terlihat, menurutmu dia kenapa?",
            "8.  Apa yang paling anda suka? Perkelahian? Pornografi? Sikap brutal? Kenakalan? Atau kisah misteri?",
            "9. Seseorang memerhatikan anda tanpa mengalihkan pandangan matanya dari anda. Apa yang ada di pikiran anda?",
            "10. Bila anda ingin membunuh seseorang dalam ruangan kecil (kamar mandi, lemari, atau kamar tidurnya) apa yang anda akan lakukan?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Belakang Pintu","Kamar Mandi","Bawah Meja"},
            {"Biru", "Bening/Putih Bersih", "Hitam"},
            {"Anjing", "Hantu", "Manusia"},
            {"Tidak menyukai penampilan diri sendiri", "Terdapat luka di wajah", "Kaca Kotor"},
            {"Kepala", "Mata", "Dada"},
            {"Tidak suka menggunakan banyak uang","Dapat membunuh dengan lebih sakit","Pisau tersebut terlihat lebih tajam"},
            {"Dia meninggal atau tidak suka keramaian","Dia sibuk atau ada keperluan","Tidak Ingin Tahu"},
            {"Pornografi","Kenakalan","Hal Lainya"},
            {"Baper dikira suka","Melakukan hal sadis tak terduga","Ada yang aneh pada diri saya"},
            {"Di racun","Tembak Mati","Dikurung saja sampai kehabisan napas. Tutup semua akses masuk udara biar mati perlahan"}
    };

    private String mCorrectAnswers[] =
            {"Belakang Pintu",
                    "Bening/Putih Bersih",
                    "Anjing",
                    "Kaca Kotor",
                    "Mata",
                    "Dapat membunuh dengan lebih sakit",
                    "Dia meninggal atau tidak suka keramaian",
                    "Pornografi",
                    "Melakukan hal sadis tak terduga",
                    "Dikurung saja sampai kehabisan napas. Tutup semua akses masuk udara biar mati perlahan"





    };

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}