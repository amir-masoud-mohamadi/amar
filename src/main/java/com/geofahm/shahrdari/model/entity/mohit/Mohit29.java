package com.geofahm.shahrdari.model.entity.mohit;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mohit2_9")
public class Mohit29 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "amalit_sang")
    private String amalitSang;

    @Column(name = "band")
    private String band;

    @Column(name = "rip")
    private String rip;

    @Column(name = "dayk")
    private String dayk;

    @Column(name = "chale")
    private String chale;

    @Column(name = "mamat")
    private String mamat;

    @Column(name = "khoshk")
    private String khoshk;

    @Column(name = "band_sabok")
    private String bandSabok;

    @Column(name = "bazr")
    private String bazr;

    @Column(name = "nahal")
    private String nahal;

    @Column(name = "mahal_gheyr")
    private String mahalGheyr;

    @Column(name = "hefazat")
    private String hefazat;

    @Column(name = "abyari")
    private String abyari;

    @Column(name = "ehdas")
    private String ehdas;

    @Column(name = "bazrpash")
    private String bazrpash;

    @Column(name = "kope")
    private String kope;

    @Column(name = "betoni")
    private String betoni;

    @Column(name = "bankt")
    private String bankt;

    @Column(name = "nahal_moser")
    private String nahalMoser;

    @Column(name = "year")
    private String year;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setAmalitSang(String amalitSang) {
        this.amalitSang = amalitSang;
    }

    public String getAmalitSang() {
        return amalitSang;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getBand() {
        return band;
    }

    public void setRip(String rip) {
        this.rip = rip;
    }

    public String getRip() {
        return rip;
    }

    public void setDayk(String dayk) {
        this.dayk = dayk;
    }

    public String getDayk() {
        return dayk;
    }

    public void setChale(String chale) {
        this.chale = chale;
    }

    public String getChale() {
        return chale;
    }

    public void setMamat(String mamat) {
        this.mamat = mamat;
    }

    public String getMamat() {
        return mamat;
    }

    public void setKhoshk(String khoshk) {
        this.khoshk = khoshk;
    }

    public String getKhoshk() {
        return khoshk;
    }

    public void setBandSabok(String bandSabok) {
        this.bandSabok = bandSabok;
    }

    public String getBandSabok() {
        return bandSabok;
    }

    public void setBazr(String bazr) {
        this.bazr = bazr;
    }

    public String getBazr() {
        return bazr;
    }

    public void setNahal(String nahal) {
        this.nahal = nahal;
    }

    public String getNahal() {
        return nahal;
    }

    public void setMahalGheyr(String mahalGheyr) {
        this.mahalGheyr = mahalGheyr;
    }

    public String getMahalGheyr() {
        return mahalGheyr;
    }

    public void setHefazat(String hefazat) {
        this.hefazat = hefazat;
    }

    public String getHefazat() {
        return hefazat;
    }

    public void setAbyari(String abyari) {
        this.abyari = abyari;
    }

    public String getAbyari() {
        return abyari;
    }

    public void setEhdas(String ehdas) {
        this.ehdas = ehdas;
    }

    public String getEhdas() {
        return ehdas;
    }

    public void setBazrpash(String bazrpash) {
        this.bazrpash = bazrpash;
    }

    public String getBazrpash() {
        return bazrpash;
    }

    public void setKope(String kope) {
        this.kope = kope;
    }

    public String getKope() {
        return kope;
    }

    public void setBetoni(String betoni) {
        this.betoni = betoni;
    }

    public String getBetoni() {
        return betoni;
    }

    public void setBankt(String bankt) {
        this.bankt = bankt;
    }

    public String getBankt() {
        return bankt;
    }

    public void setNahalMoser(String nahalMoser) {
        this.nahalMoser = nahalMoser;
    }

    public String getNahalMoser() {
        return nahalMoser;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Mohit29{" +
                "id=" + id + '\'' +
                "amalitSang=" + amalitSang + '\'' +
                "band=" + band + '\'' +
                "rip=" + rip + '\'' +
                "dayk=" + dayk + '\'' +
                "chale=" + chale + '\'' +
                "mamat=" + mamat + '\'' +
                "khoshk=" + khoshk + '\'' +
                "bandSabok=" + bandSabok + '\'' +
                "bazr=" + bazr + '\'' +
                "nahal=" + nahal + '\'' +
                "mahalGheyr=" + mahalGheyr + '\'' +
                "hefazat=" + hefazat + '\'' +
                "abyari=" + abyari + '\'' +
                "ehdas=" + ehdas + '\'' +
                "bazrpash=" + bazrpash + '\'' +
                "kope=" + kope + '\'' +
                "betoni=" + betoni + '\'' +
                "bankt=" + bankt + '\'' +
                "nahalMoser=" + nahalMoser + '\'' +
                "year=" + year + '\'' +
                '}';
    }
}
