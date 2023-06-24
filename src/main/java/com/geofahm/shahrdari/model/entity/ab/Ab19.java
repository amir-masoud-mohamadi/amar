package com.geofahm.shahrdari.model.entity.ab;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ab1_9")
public class Ab19 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "total_discharge")
    private String totalDischarge;

    @Column(name = "number_wells")
    private String numberWells;

    @Column(name = "annual_discharge")
    private String annualDischarge;

    @Column(name = "annual_emptying")
    private String annualEmptying;

    @Column(name = "number_aqueducts")
    private String numberAqueducts;

    @Column(name = "annual_emptying1")
    private String annualEmptying1;

    @Column(name = "number_springs")
    private String numberSprings;

    @Column(name = "annual_discharg")
    private String annualDischarg;

    @Column(name = "year")
    private String year;

    @Column(name = "number_wells1")
    private String numberWells1;

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

    public void setTotalDischarge(String totalDischarge) {
        this.totalDischarge = totalDischarge;
    }

    public String getTotalDischarge() {
        return totalDischarge;
    }

    public void setNumberWells(String numberWells) {
        this.numberWells = numberWells;
    }

    public String getNumberWells() {
        return numberWells;
    }

    public void setAnnualDischarge(String annualDischarge) {
        this.annualDischarge = annualDischarge;
    }

    public String getAnnualDischarge() {
        return annualDischarge;
    }

    public void setAnnualEmptying(String annualEmptying) {
        this.annualEmptying = annualEmptying;
    }

    public String getAnnualEmptying() {
        return annualEmptying;
    }

    public void setNumberAqueducts(String numberAqueducts) {
        this.numberAqueducts = numberAqueducts;
    }

    public String getNumberAqueducts() {
        return numberAqueducts;
    }

    public void setAnnualEmptying1(String annualEmptying1) {
        this.annualEmptying1 = annualEmptying1;
    }

    public String getAnnualEmptying1() {
        return annualEmptying1;
    }

    public void setNumberSprings(String numberSprings) {
        this.numberSprings = numberSprings;
    }

    public String getNumberSprings() {
        return numberSprings;
    }

    public void setAnnualDischarg(String annualDischarg) {
        this.annualDischarg = annualDischarg;
    }

    public String getAnnualDischarg() {
        return annualDischarg;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setNumberWells1(String numberWells1) {
        this.numberWells1 = numberWells1;
    }

    public String getNumberWells1() {
        return numberWells1;
    }

    @Override
    public String toString() {
        return "Ab19{" +
                "id=" + id + '\'' +
                "city=" + city + '\'' +
                "totalDischarge=" + totalDischarge + '\'' +
                "numberWells=" + numberWells + '\'' +
                "annualDischarge=" + annualDischarge + '\'' +
                "annualEmptying=" + annualEmptying + '\'' +
                "numberAqueducts=" + numberAqueducts + '\'' +
                "annualEmptying1=" + annualEmptying1 + '\'' +
                "numberSprings=" + numberSprings + '\'' +
                "annualDischarg=" + annualDischarg + '\'' +
                "numberWells1=" + numberWells1 + '\'' +
                '}';
    }
}
