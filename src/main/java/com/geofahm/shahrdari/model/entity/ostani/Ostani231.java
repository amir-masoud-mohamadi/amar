package com.geofahm.shahrdari.model.entity.ostani;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ostani23_1")
public class Ostani231 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "m_nakhales_dakheli")
    private String mNakhalesDakheli;

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

    public void setMNakhalesDakheli(String mNakhalesDakheli) {
        this.mNakhalesDakheli = mNakhalesDakheli;
    }

    public String getMNakhalesDakheli() {
        return mNakhalesDakheli;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Ostani231{" +
                "id=" + id + '\'' +
                "city=" + city + '\'' +
                "mNakhalesDakheli=" + mNakhalesDakheli + '\'' +
                "year=" + year + '\'' +
                '}';
    }
}
