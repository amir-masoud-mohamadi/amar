package com.geofahm.shahrdari.model.entity.hazineh;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "daramad1_21")
public class Daramad121 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "av")
    private String av;

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

    public void setAv(String av) {
        this.av = av;
    }

    public String getAv() {
        return av;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Daramad121{" +
                "id=" + id + '\'' +
                "city=" + city + '\'' +
                "av=" + av + '\'' +
                "year=" + year + '\'' +
                '}';
    }
}
