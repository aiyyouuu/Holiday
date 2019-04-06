package com.example.holiday.Presenter;

import android.content.Context;

import com.example.holiday.View.MainView;
import com.example.holiday.Model.AllModel;

import java.util.ArrayList;
import java.util.List;

public class AllPresenter {
    Context context;
    List<AllModel> allModels = new ArrayList<>();
    MainView view;
    public AllPresenter(MainView view, Context context){
        this.view = view;
        this.context = context;
    }

    public void setData(){
        AllModel all;
        all = new AllModel("Jumat, 19 April 2019", "Wafat Isa Al Masih","Nama hari raya umat Kristen untuk memperingati kenaikan Yesus Kristus ke surga ");
        allModels.add(all);
        all = new AllModel("Rabu, 1 Mei 2019", "Hari Buruh Internasional","Dikenal dengan sebutan May Day. Hari buruh ini adalah sebuah hari libur (di beberapa negara) tahunan yang berawal dari usaha gerakan serikat buruh untuk merayakan keberhasilan ekonomi dan sosial para buruh.");
        allModels.add(all);
        all = new AllModel("Senin, 27 Mei 2019", "Hari Pahlawan"," Hari nasional yang bukan hari libur yang ditetapkan oleh pemerintah Indonesia, ");
        allModels.add(all);
        all = new AllModel("Kamis, 30 Mei 2019", "Kenaikan Isa Al Masih","Nama hari raya umat Kristen untuk memperingati kenaikan Yesus Kristus ke surga ");
        allModels.add(all);
        all = new AllModel("Rabu, 5 Juni 2019", "Hari Raya Idul Fitri 1440H","Lebaran di Indonesia adalah hari raya umat Islam yang jatuh pada tanggal 1 Syawal pada penanggalan Hijriyah dan menandakan berakhirnya puasa pada bulan Ramadhan");
        allModels.add(all);
        all = new AllModel("Kamis, 6 Juni 2019", "Hari Raya Idul Fitri 1440H","Lebaran di Indonesia adalah hari raya umat Islam yang jatuh pada tanggal 1 Syawal pada penanggalan Hijriyah dan menandakan berakhirnya puasa pada bulan Ramadhan ");
        allModels.add(all);
        all = new AllModel("Senin, 12 Agustus 2019", "Hari Raya Idul Adha 1440H","Sebuah hari raya Islam. Pada hari ini diperingati peristiwa kurban.  umat Islam berkumpul pada pagi hari dan melakukan salat Ied bersama-sama di tanah lapang atau di masjid ");
        allModels.add(all);
        all = new AllModel("Rabu, 25 Desember 2019", "Hari Raya Natal"," Hari raya umat Kristen yang diperingati setiap tahun oleh umat Kristiani pada tanggal 25 Desember untuk memperingati hari kelahiran Yesus Kristus.");
        allModels.add(all);
        view.onSuccess(allModels);
    }
}
