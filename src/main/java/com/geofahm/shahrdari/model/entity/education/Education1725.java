package com.geofahm.shahrdari.model.entity.education;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "education17_25")
public class Education1725 implements Serializable {



    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "all_associate_degree")
    private String allAssociateDegree;

    @Column(name = "all_expert")
    private String allExpert;

    @Column(name = "all_masters")
    private String allMasters;

    @Column(name = "all_phd")
    private String allPhd;

    @Column(name = "all_phds")
    private String allPhds;

    @Column(name = "city")
    private String city;

    @Column(name = "men")
    private String men;

    @Column(name = "men_associate_degree")
    private String menAssociateDegree;

    @Column(name = "men_expert")
    private String menExpert;

    @Column(name = "men_masters")
    private String menMasters;

    @Column(name = "men_phd")
    private String menPhd;

    @Column(name = "men_phds")
    private String menPhds;

    @Column(name = "total")
    private String total;

    @Column(name = "women")
    private String women;

    @Column(name = "women_associate_degree")
    private String womenAssociateDegree;

    @Column(name = "women_expert")
    private String womenExpert;

    @Column(name = "women_masters")
    private String womenMasters;

    @Column(name = "women_phd")
    private String womenPhd;

    @Column(name = "women_phds")
    private String womenPhds;

    @Column(name = "year")
    private String year;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setAllAssociateDegree(String allAssociateDegree) {
        this.allAssociateDegree = allAssociateDegree;
    }

    public String getAllAssociateDegree() {
        return allAssociateDegree;
    }

    public void setAllExpert(String allExpert) {
        this.allExpert = allExpert;
    }

    public String getAllExpert() {
        return allExpert;
    }

    public void setAllMasters(String allMasters) {
        this.allMasters = allMasters;
    }

    public String getAllMasters() {
        return allMasters;
    }

    public void setAllPhd(String allPhd) {
        this.allPhd = allPhd;
    }

    public String getAllPhd() {
        return allPhd;
    }

    public void setAllPhds(String allPhds) {
        this.allPhds = allPhds;
    }

    public String getAllPhds() {
        return allPhds;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setMen(String men) {
        this.men = men;
    }

    public String getMen() {
        return men;
    }

    public void setMenAssociateDegree(String menAssociateDegree) {
        this.menAssociateDegree = menAssociateDegree;
    }

    public String getMenAssociateDegree() {
        return menAssociateDegree;
    }

    public void setMenExpert(String menExpert) {
        this.menExpert = menExpert;
    }

    public String getMenExpert() {
        return menExpert;
    }

    public void setMenMasters(String menMasters) {
        this.menMasters = menMasters;
    }

    public String getMenMasters() {
        return menMasters;
    }

    public void setMenPhd(String menPhd) {
        this.menPhd = menPhd;
    }

    public String getMenPhd() {
        return menPhd;
    }

    public void setMenPhds(String menPhds) {
        this.menPhds = menPhds;
    }

    public String getMenPhds() {
        return menPhds;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotal() {
        return total;
    }

    public void setWomen(String women) {
        this.women = women;
    }

    public String getWomen() {
        return women;
    }

    public void setWomenAssociateDegree(String womenAssociateDegree) {
        this.womenAssociateDegree = womenAssociateDegree;
    }

    public String getWomenAssociateDegree() {
        return womenAssociateDegree;
    }

    public void setWomenExpert(String womenExpert) {
        this.womenExpert = womenExpert;
    }

    public String getWomenExpert() {
        return womenExpert;
    }

    public void setWomenMasters(String womenMasters) {
        this.womenMasters = womenMasters;
    }

    public String getWomenMasters() {
        return womenMasters;
    }

    public void setWomenPhd(String womenPhd) {
        this.womenPhd = womenPhd;
    }

    public String getWomenPhd() {
        return womenPhd;
    }

    public void setWomenPhds(String womenPhds) {
        this.womenPhds = womenPhds;
    }

    public String getWomenPhds() {
        return womenPhds;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Education1725{" +
                "id=" + id + '\'' +
                "allAssociateDegree=" + allAssociateDegree + '\'' +
                "allExpert=" + allExpert + '\'' +
                "allMasters=" + allMasters + '\'' +
                "allPhd=" + allPhd + '\'' +
                "allPhds=" + allPhds + '\'' +
                "city=" + city + '\'' +
                "men=" + men + '\'' +
                "menAssociateDegree=" + menAssociateDegree + '\'' +
                "menExpert=" + menExpert + '\'' +
                "menMasters=" + menMasters + '\'' +
                "menPhd=" + menPhd + '\'' +
                "menPhds=" + menPhds + '\'' +
                "total=" + total + '\'' +
                "women=" + women + '\'' +
                "womenAssociateDegree=" + womenAssociateDegree + '\'' +
                "womenExpert=" + womenExpert + '\'' +
                "womenMasters=" + womenMasters + '\'' +
                "womenPhd=" + womenPhd + '\'' +
                "womenPhds=" + womenPhds + '\'' +
                "year=" + year + '\'' +
                '}';
    }
}
