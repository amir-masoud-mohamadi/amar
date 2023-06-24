package com.geofahm.shahrdari.model.entity.weather;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "weather1_3")
public class Weather13 implements Serializable {



    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "area")
    private String area;

    @Column(name = "city")
    private String city;

    @Column(name = "t_bakhsh")
    private String tBakhsh;

    @Column(name = "t_city")
    private String tCity;

    @Column(name = "t_dehestan")
    private String tDehestan;

    @Column(name = "year")
    private String year;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setTBakhsh(String tBakhsh) {
        this.tBakhsh = tBakhsh;
    }

    public String getTBakhsh() {
        return tBakhsh;
    }

    public void setTCity(String tCity) {
        this.tCity = tCity;
    }

    public String getTCity() {
        return tCity;
    }

    public void setTDehestan(String tDehestan) {
        this.tDehestan = tDehestan;
    }

    public String getTDehestan() {
        return tDehestan;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Weather13{" +
                "id=" + id + '\'' +
                "area=" + area + '\'' +
                "city=" + city + '\'' +
                "tBakhsh=" + tBakhsh + '\'' +
                "tCity=" + tCity + '\'' +
                "tDehestan=" + tDehestan + '\'' +
                "year=" + year + '\'' +
                '}';
    }
}
