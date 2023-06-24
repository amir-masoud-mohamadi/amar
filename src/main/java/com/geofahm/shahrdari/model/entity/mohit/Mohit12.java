package com.geofahm.shahrdari.model.entity.mohit;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mohit1_2")
public class Mohit12 implements Serializable {



    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "faza_sabz")
    private String fazaSabz;

    @Column(name = "jam_jangal")
    private String jamJangal;

    @Column(name = "park_jangali")
    private String parkJangali;

    @Column(name = "year")
    private String year;

    @Column(name = "zakhire_jangal")
    private String zakhireJangal;

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

    public void setFazaSabz(String fazaSabz) {
        this.fazaSabz = fazaSabz;
    }

    public String getFazaSabz() {
        return fazaSabz;
    }

    public void setJamJangal(String jamJangal) {
        this.jamJangal = jamJangal;
    }

    public String getJamJangal() {
        return jamJangal;
    }

    public void setParkJangali(String parkJangali) {
        this.parkJangali = parkJangali;
    }

    public String getParkJangali() {
        return parkJangali;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setZakhireJangal(String zakhireJangal) {
        this.zakhireJangal = zakhireJangal;
    }

    public String getZakhireJangal() {
        return zakhireJangal;
    }

    @Override
    public String toString() {
        return "Mohit12{" +
                "id=" + id + '\'' +
                "city=" + city + '\'' +
                "fazaSabz=" + fazaSabz + '\'' +
                "jamJangal=" + jamJangal + '\'' +
                "parkJangali=" + parkJangali + '\'' +
                "year=" + year + '\'' +
                "zakhireJangal=" + zakhireJangal + '\'' +
                '}';
    }
}
