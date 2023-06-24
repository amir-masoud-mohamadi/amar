package com.geofahm.shahrdari.model.entity.ertebatat;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ertebat1_13")
public class Ertebat113 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "kol")
    private String kol;

    @Column(name = "mash")
    private String mash;

    @Column(name = "shahr")
    private String shahr;

    @Column(name = "shari")
    private String shari;

    @Column(name = "rosta")
    private String rosta;

    @Column(name = "rostaee")
    private String rostaee;

    @Column(name = "noghat")
    private String noghat;

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

    public void setKol(String kol) {
        this.kol = kol;
    }

    public String getKol() {
        return kol;
    }

    public void setMash(String mash) {
        this.mash = mash;
    }

    public String getMash() {
        return mash;
    }

    public void setShahr(String shahr) {
        this.shahr = shahr;
    }

    public String getShahr() {
        return shahr;
    }

    public void setShari(String shari) {
        this.shari = shari;
    }

    public String getShari() {
        return shari;
    }

    public void setRosta(String rosta) {
        this.rosta = rosta;
    }

    public String getRosta() {
        return rosta;
    }

    public void setRostaee(String rostaee) {
        this.rostaee = rostaee;
    }

    public String getRostaee() {
        return rostaee;
    }

    public void setNoghat(String noghat) {
        this.noghat = noghat;
    }

    public String getNoghat() {
        return noghat;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Ertebat113{" +
                "id=" + id + '\'' +
                "city=" + city + '\'' +
                "kol=" + kol + '\'' +
                "mash=" + mash + '\'' +
                "shahr=" + shahr + '\'' +
                "shari=" + shari + '\'' +
                "rosta=" + rosta + '\'' +
                "rostaee=" + rostaee + '\'' +
                "noghat=" + noghat + '\'' +
                "year=" + year + '\'' +
                '}';
    }
}
