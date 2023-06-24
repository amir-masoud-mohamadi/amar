package com.geofahm.shahrdari.model.entity.education;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "education17_21")
public class Education1721 implements Serializable {



    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "men")
    private String men;

    @Column(name = "total")
    private String total;

    @Column(name = "women")
    private String women;

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

    public void setMen(String men) {
        this.men = men;
    }

    public String getMen() {
        return men;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotal() {
        return total;
    }

    public void setWomen(String women) {
        this.women = women;
    }

    public String getWomen() {
        return women;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Education1721{" +
                "id=" + id + '\'' +
                "city=" + city + '\'' +
                "men=" + men + '\'' +
                "total=" + total + '\'' +
                "women=" + women + '\'' +
                "year=" + year + '\'' +
                '}';
    }
}
