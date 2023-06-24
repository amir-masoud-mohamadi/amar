package com.geofahm.shahrdari.model.entity.weather;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "weather1_8")
public class Weather18 implements Serializable {



    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "low_min")
    private String lowMin;

    @Column(name = "min")
    private String min;

    @Column(name = "min_max")
    private String minMax;

    @Column(name = "min_min")
    private String minMin;

    @Column(name = "up_max")
    private String upMax;

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

    public void setLowMin(String lowMin) {
        this.lowMin = lowMin;
    }

    public String getLowMin() {
        return lowMin;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMin() {
        return min;
    }

    public void setMinMax(String minMax) {
        this.minMax = minMax;
    }

    public String getMinMax() {
        return minMax;
    }

    public void setMinMin(String minMin) {
        this.minMin = minMin;
    }

    public String getMinMin() {
        return minMin;
    }

    public void setUpMax(String upMax) {
        this.upMax = upMax;
    }

    public String getUpMax() {
        return upMax;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Weather18{" +
                "id=" + id + '\'' +
                "city=" + city + '\'' +
                "lowMin=" + lowMin + '\'' +
                "min=" + min + '\'' +
                "minMax=" + minMax + '\'' +
                "minMin=" + minMin + '\'' +
                "upMax=" + upMax + '\'' +
                "year=" + year + '\'' +
                '}';
    }
}
