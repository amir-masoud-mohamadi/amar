package com.geofahm.shahrdari.model.entity.farm;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "agriculture5_2")
public class Agriculture52 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "zerat")
    private String zerat;

    @Column(name = "baghdari")
    private String baghdari;

    @Column(name = "k_golkhane")
    private String kGolkhane;

    @Column(name = "p_dam_sangin")
    private String pDamSangin;

    @Column(name = "p_dam_s")
    private String pDamS;

    @Column(name = "p_zanbor")
    private String pZanbor;

    @Column(name = "p_kerm")
    private String pKerm;

    @Column(name = "p_teyor")
    private String pTeyor;

    @Column(name = "p_mahi")
    private String pMahi;

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

    public void setZerat(String zerat) {
        this.zerat = zerat;
    }

    public String getZerat() {
        return zerat;
    }

    public void setBaghdari(String baghdari) {
        this.baghdari = baghdari;
    }

    public String getBaghdari() {
        return baghdari;
    }

    public void setKGolkhane(String kGolkhane) {
        this.kGolkhane = kGolkhane;
    }

    public String getKGolkhane() {
        return kGolkhane;
    }

    public void setPDamSangin(String pDamSangin) {
        this.pDamSangin = pDamSangin;
    }

    public String getPDamSangin() {
        return pDamSangin;
    }

    public void setPDamS(String pDamS) {
        this.pDamS = pDamS;
    }

    public String getPDamS() {
        return pDamS;
    }

    public void setPZanbor(String pZanbor) {
        this.pZanbor = pZanbor;
    }

    public String getPZanbor() {
        return pZanbor;
    }

    public void setPKerm(String pKerm) {
        this.pKerm = pKerm;
    }

    public String getPKerm() {
        return pKerm;
    }

    public void setPTeyor(String pTeyor) {
        this.pTeyor = pTeyor;
    }

    public String getPTeyor() {
        return pTeyor;
    }

    public void setPMahi(String pMahi) {
        this.pMahi = pMahi;
    }

    public String getPMahi() {
        return pMahi;
    }

    @Override
    public String toString() {
        return "Agriculture52{" +
                "id=" + id + '\'' +
                "city=" + city + '\'' +
                "zerat=" + zerat + '\'' +
                "baghdari=" + baghdari + '\'' +
                "kGolkhane=" + kGolkhane + '\'' +
                "pDamSangin=" + pDamSangin + '\'' +
                "pDamS=" + pDamS + '\'' +
                "pZanbor=" + pZanbor + '\'' +
                "pKerm=" + pKerm + '\'' +
                "pTeyor=" + pTeyor + '\'' +
                "pMahi=" + pMahi + '\'' +
                '}';
    }
}
