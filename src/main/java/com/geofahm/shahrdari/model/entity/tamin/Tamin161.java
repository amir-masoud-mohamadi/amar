package com.geofahm.shahrdari.model.entity.tamin;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tamin16_1")
public class Tamin161 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "marakez_koodak")
    private String marakezKoodak;

    @Column(name = "afrad_koodak")
    private String afradKoodak;

    @Column(name = "marakez_asib")
    private String marakezAsib;

    @Column(name = "mahde_koodak")
    private String mahdeKoodak;

    @Column(name = "koodak_mahd")
    private String koodakMahd;

    @Column(name = "year")
    private String year;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setMarakezKoodak(String marakezKoodak) {
        this.marakezKoodak = marakezKoodak;
    }

    public String getMarakezKoodak() {
        return marakezKoodak;
    }

    public void setAfradKoodak(String afradKoodak) {
        this.afradKoodak = afradKoodak;
    }

    public String getAfradKoodak() {
        return afradKoodak;
    }

    public void setMarakezAsib(String marakezAsib) {
        this.marakezAsib = marakezAsib;
    }

    public String getMarakezAsib() {
        return marakezAsib;
    }

    public void setMahdeKoodak(String mahdeKoodak) {
        this.mahdeKoodak = mahdeKoodak;
    }

    public String getMahdeKoodak() {
        return mahdeKoodak;
    }

    public void setKoodakMahd(String koodakMahd) {
        this.koodakMahd = koodakMahd;
    }

    public String getKoodakMahd() {
        return koodakMahd;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Tamin161{" +
                "id=" + id + '\'' +
                "city=" + city + '\'' +
                "marakezKoodak=" + marakezKoodak + '\'' +
                "afradKoodak=" + afradKoodak + '\'' +
                "marakezAsib=" + marakezAsib + '\'' +
                "mahdeKoodak=" + mahdeKoodak + '\'' +
                "koodakMahd=" + koodakMahd + '\'' +
                "year=" + year + '\'' +
                '}';
    }
}
