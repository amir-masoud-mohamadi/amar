package com.geofahm.shahrdari.model.entity.hotel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "hotel10_10")
public class Hotel1010 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "num")
    private String num;

    @Column(name = "company_t")
    private String companyT;

    @Column(name = "fund")
    private String fund;

    @Column(name = "zakhireh")
    private String zakhireh;

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

    public void setNum(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public void setCompanyT(String companyT) {
        this.companyT = companyT;
    }

    public String getCompanyT() {
        return companyT;
    }

    public void setFund(String fund) {
        this.fund = fund;
    }

    public String getFund() {
        return fund;
    }

    public void setZakhireh(String zakhireh) {
        this.zakhireh = zakhireh;
    }

    public String getZakhireh() {
        return zakhireh;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Hotel1010{" +
                "id=" + id + '\'' +
                "city=" + city + '\'' +
                "num=" + num + '\'' +
                "companyT=" + companyT + '\'' +
                "fund=" + fund + '\'' +
                "zakhireh=" + zakhireh + '\'' +
                "year=" + year + '\'' +
                '}';
    }
}
