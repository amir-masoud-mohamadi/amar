package com.geofahm.shahrdari.model.entity.sport;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "sport19_1")
public class Sport191 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "production")
    private String production;

    @Column(name = "year")
    private String year;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getProduction() {
        return production;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Sport191{" +
                "id=" + id + '\'' +

                "production=" + production + '\'' +
                "year=" + year + '\'' +
                '}';
    }
}
