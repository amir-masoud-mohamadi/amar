package com.geofahm.shahrdari.model.entity.mohit;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mohit2_7")
public class Mohit27 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "jam")
    private String jam;

    @Column(name = "jangal")
    private String jangal;

    @Column(name = "kh_jangal")
    private String khJangal;

    @Column(name = "year")
    private String year;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getJam() {
        return jam;
    }

    public void setJangal(String jangal) {
        this.jangal = jangal;
    }

    public String getJangal() {
        return jangal;
    }

    public void setKhJangal(String khJangal) {
        this.khJangal = khJangal;
    }

    public String getKhJangal() {
        return khJangal;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Mohit27{" +
                "id=" + id + '\'' +
                "jam=" + jam + '\'' +
                "jangal=" + jangal + '\'' +
                "khJangal=" + khJangal + '\'' +
                "year=" + year + '\'' +
                '}';
    }
}
