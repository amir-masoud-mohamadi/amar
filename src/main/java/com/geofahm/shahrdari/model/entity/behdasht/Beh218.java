package com.geofahm.shahrdari.model.entity.behdasht;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "beh2_18")
public class Beh218 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "pezeshk")
    private String pezeshk;

    @Column(name = "danan")
    private String danan;

    @Column(name = "dr")
    private String dr;

    @Column(name = "daro")
    private String daro;

    @Column(name = "pm")
    private String pm;

    @Column(name = "pfm")
    private String pfm;

    @Column(name = "drt")
    private String drt;

    @Column(name = "year")
    private String year;

    @Column(name = "sum")
    private String sum;

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

    public void setPezeshk(String pezeshk) {
        this.pezeshk = pezeshk;
    }

    public String getPezeshk() {
        return pezeshk;
    }

    public void setDanan(String danan) {
        this.danan = danan;
    }

    public String getDanan() {
        return danan;
    }

    public void setDr(String dr) {
        this.dr = dr;
    }

    public String getDr() {
        return dr;
    }

    public void setDaro(String daro) {
        this.daro = daro;
    }

    public String getDaro() {
        return daro;
    }

    public void setPm(String pm) {
        this.pm = pm;
    }

    public String getPm() {
        return pm;
    }

    public void setPfm(String pfm) {
        this.pfm = pfm;
    }

    public String getPfm() {
        return pfm;
    }

    public void setDrt(String drt) {
        this.drt = drt;
    }

    public String getDrt() {
        return drt;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return "Beh218{" +
                "id=" + id + '\'' +
                "city=" + city + '\'' +
                "pezeshk=" + pezeshk + '\'' +
                "danan=" + danan + '\'' +
                "dr=" + dr + '\'' +
                "daro=" + daro + '\'' +
                "pm=" + pm + '\'' +
                "pfm=" + pfm + '\'' +
                "drt=" + drt + '\'' +
                "year=" + year + '\'' +
                "sum=" + sum + '\'' +
                '}';
    }
}
