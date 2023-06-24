package com.geofahm.shahrdari.model.entity.mohit;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mohit2_3")
public class Mohit23 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "jam")
    private String jam;

    @Column(name = "ore")
    private String ore;

    @Column(name = "fosfat")
    private String fosfat;

    @Column(name = "nitrat")
    private String nitrat;

    @Column(name = "solfat")
    private String solfat;

    @Column(name = "superes")
    private String superes;

    @Column(name = "splpeta")
    private String splpeta;

    @Column(name = "clropeta")
    private String clropeta;

    @Column(name = "microelment")
    private String microelment;

    @Column(name = "other")
    private String other;

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

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getJam() {
        return jam;
    }

    public void setOre(String ore) {
        this.ore = ore;
    }

    public String getOre() {
        return ore;
    }

    public void setFosfat(String fosfat) {
        this.fosfat = fosfat;
    }

    public String getFosfat() {
        return fosfat;
    }

    public void setNitrat(String nitrat) {
        this.nitrat = nitrat;
    }

    public String getNitrat() {
        return nitrat;
    }

    public void setSolfat(String solfat) {
        this.solfat = solfat;
    }

    public String getSolfat() {
        return solfat;
    }

    public String getSuperes() {
        return superes;
    }

    public void setSuperes(String superes) {
        this.superes = superes;
    }

    public void setSplpeta(String splpeta) {
        this.splpeta = splpeta;
    }

    public String getSplpeta() {
        return splpeta;
    }

    public void setClropeta(String clropeta) {
        this.clropeta = clropeta;
    }

    public String getClropeta() {
        return clropeta;
    }

    public void setMicroelment(String microelment) {
        this.microelment = microelment;
    }

    public String getMicroelment() {
        return microelment;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getOther() {
        return other;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }


}
