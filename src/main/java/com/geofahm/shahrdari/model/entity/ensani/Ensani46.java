package com.geofahm.shahrdari.model.entity.ensani;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ensani4_6")
public class Ensani46 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;
    @Column(name = "city")
    private String city;

    @Column(name = "t_f")
    private String tF;

    @Column(name = "m_z")
    private String mZ;

    @Column(name = "m_m")
    private String mM;

    @Column(name = "z_m")
    private String zM;

    @Column(name = "m_z_k")
    private String mZK;

    @Column(name = "m_k")
    private String mK;

    @Column(name = "z_k")
    private String zK;

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

    public void setTF(String tF) {
        this.tF = tF;
    }

    public String getTF() {
        return tF;
    }

    public void setMZ(String mZ) {
        this.mZ = mZ;
    }

    public String getMZ() {
        return mZ;
    }

    public void setMM(String mM) {
        this.mM = mM;
    }

    public String getMM() {
        return mM;
    }

    public void setZM(String zM) {
        this.zM = zM;
    }

    public String getZM() {
        return zM;
    }

    public void setMZK(String mZK) {
        this.mZK = mZK;
    }

    public String getMZK() {
        return mZK;
    }

    public void setMK(String mK) {
        this.mK = mK;
    }

    public String getMK() {
        return mK;
    }

    public void setZK(String zK) {
        this.zK = zK;
    }

    public String getZK() {
        return zK;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Ensani46{" +
                "id=" + id + '\'' +
                "city=" + city + '\'' +
                "tF=" + tF + '\'' +
                "mZ=" + mZ + '\'' +
                "mM=" + mM + '\'' +
                "zM=" + zM + '\'' +
                "mZK=" + mZK + '\'' +
                "mK=" + mK + '\'' +
                "zK=" + zK + '\'' +
                "year=" + year + '\'' +
                '}';
    }
}
