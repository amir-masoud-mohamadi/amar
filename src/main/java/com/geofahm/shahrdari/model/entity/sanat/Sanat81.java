package com.geofahm.shahrdari.model.entity.sanat;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "sanat8_1")
public class Sanat81 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "t_javaz")
    private String tJavaz;

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

    public String gettJavaz() {
        return tJavaz;
    }

    public void settJavaz(String tJavaz) {
        this.tJavaz = tJavaz;
    }

    public void setTJavaz(String tJavaz) {
        this.tJavaz = tJavaz;
    }

    public String getTJavaz() {
        return tJavaz;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Sanat81{" +
                "id=" + id + '\'' +

                "tJavaz=" + tJavaz + '\'' +
                "year=" + year + '\'' +
                '}';
    }
}
