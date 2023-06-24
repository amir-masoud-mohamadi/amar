package com.geofahm.shahrdari.model.entity.weather;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "weather1_7")
public class Weather17 implements Serializable {



    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "max")
    private String max;

    @Column(name = "min")
    private String min;

    @Column(name = "miyangin")
    private String miyangin;

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

    public void setMax(String max) {
        this.max = max;
    }

    public String getMax() {
        return max;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMin() {
        return min;
    }

    public void setMiyangin(String miyangin) {
        this.miyangin = miyangin;
    }

    public String getMiyangin() {
        return miyangin;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Weather17{" +
                "id=" + id + '\'' +
                "city=" + city + '\'' +
                "max=" + max + '\'' +
                "min=" + min + '\'' +
                "miyangin=" + miyangin + '\'' +
                "year=" + year + '\'' +
                '}';
    }
}
