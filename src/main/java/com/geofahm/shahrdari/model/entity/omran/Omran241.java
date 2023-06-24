package com.geofahm.shahrdari.model.entity.omran;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "omran24_1")
@Entity
public class Omran241 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "t_farhangsara")
    private String tFarhangsara;

    @Column(name = "m_farhangsara")
    private String mFarhangsara;

    @Column(name = "t_tarebar")
    private String tTarebar;

    @Column(name = "m_tarebar")
    private String mTarebar;

    @Column(name = "t_aramestan")
    private String tAramestan;

    @Column(name = "m_aramestan")
    private String mAramestan;

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

    public void setTFarhangsara(String tFarhangsara) {
        this.tFarhangsara = tFarhangsara;
    }

    public String getTFarhangsara() {
        return tFarhangsara;
    }

    public void setMFarhangsara(String mFarhangsara) {
        this.mFarhangsara = mFarhangsara;
    }

    public String getMFarhangsara() {
        return mFarhangsara;
    }

    public void setTTarebar(String tTarebar) {
        this.tTarebar = tTarebar;
    }

    public String getTTarebar() {
        return tTarebar;
    }

    public void setMTarebar(String mTarebar) {
        this.mTarebar = mTarebar;
    }

    public String getMTarebar() {
        return mTarebar;
    }

    public void setTAramestan(String tAramestan) {
        this.tAramestan = tAramestan;
    }

    public String getTAramestan() {
        return tAramestan;
    }

    public void setMAramestan(String mAramestan) {
        this.mAramestan = mAramestan;
    }

    public String getMAramestan() {
        return mAramestan;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Omran241{" +
                "id=" + id + '\'' +
                "city=" + city + '\'' +
                "tFarhangsara=" + tFarhangsara + '\'' +
                "mFarhangsara=" + mFarhangsara + '\'' +
                "tTarebar=" + tTarebar + '\'' +
                "mTarebar=" + mTarebar + '\'' +
                "tAramestan=" + tAramestan + '\'' +
                "mAramestan=" + mAramestan + '\'' +
                "year=" + year + '\'' +
                '}';
    }
}
