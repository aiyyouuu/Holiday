package com.example.holiday.Model;

public class AllModel {
    String tanggal;
    String NamaHariBesar;
    String overview;

    public AllModel(String tanggal, String NamaHariBesar, String overview){
        this.tanggal = tanggal;
        this.NamaHariBesar = NamaHariBesar;
        this.overview = overview;
    }

    public String getTanggal(){return tanggal; }

    public String getNamaHariBesar(){return NamaHariBesar;}

    public String getOverview(){return overview; }

    public void setOverview(String overview){this.overview = overview;}
}
