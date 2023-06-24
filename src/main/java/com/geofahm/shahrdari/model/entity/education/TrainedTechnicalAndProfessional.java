package com.geofahm.shahrdari.model.entity.education;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "trained_technical_and_professional")
public class TrainedTechnicalAndProfessional implements Serializable {



    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "all_trained")
    private String allTrained;

    @Column(name = "city")
    private String city;

    @Column(name = "man_culture")
    private String manCulture;

    @Column(name = "man_farmer")
    private String manFarmer;

    @Column(name = "man_industrial")
    private String manIndustrial;

    @Column(name = "man_services")
    private String manServices;

    @Column(name = "man_trained")
    private String manTrained;

    @Column(name = "women_culture")
    private String womenCulture;

    @Column(name = "women_farmer")
    private String womenFarmer;

    @Column(name = "women_industrial")
    private String womenIndustrial;

    @Column(name = "women_services")
    private String womenServices;

    @Column(name = "women_trained")
    private String womenTrained;

    @Column(name = "year")
    private String year;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setAllTrained(String allTrained) {
        this.allTrained = allTrained;
    }

    public String getAllTrained() {
        return allTrained;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setManCulture(String manCulture) {
        this.manCulture = manCulture;
    }

    public String getManCulture() {
        return manCulture;
    }

    public void setManFarmer(String manFarmer) {
        this.manFarmer = manFarmer;
    }

    public String getManFarmer() {
        return manFarmer;
    }

    public void setManIndustrial(String manIndustrial) {
        this.manIndustrial = manIndustrial;
    }

    public String getManIndustrial() {
        return manIndustrial;
    }

    public void setManServices(String manServices) {
        this.manServices = manServices;
    }

    public String getManServices() {
        return manServices;
    }

    public void setManTrained(String manTrained) {
        this.manTrained = manTrained;
    }

    public String getManTrained() {
        return manTrained;
    }

    public void setWomenCulture(String womenCulture) {
        this.womenCulture = womenCulture;
    }

    public String getWomenCulture() {
        return womenCulture;
    }

    public void setWomenFarmer(String womenFarmer) {
        this.womenFarmer = womenFarmer;
    }

    public String getWomenFarmer() {
        return womenFarmer;
    }

    public void setWomenIndustrial(String womenIndustrial) {
        this.womenIndustrial = womenIndustrial;
    }

    public String getWomenIndustrial() {
        return womenIndustrial;
    }

    public void setWomenServices(String womenServices) {
        this.womenServices = womenServices;
    }

    public String getWomenServices() {
        return womenServices;
    }

    public void setWomenTrained(String womenTrained) {
        this.womenTrained = womenTrained;
    }

    public String getWomenTrained() {
        return womenTrained;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "TrainedTechnicalAndProfessional{" +
                "id=" + id + '\'' +
                "allTrained=" + allTrained + '\'' +
                "city=" + city + '\'' +
                "manCulture=" + manCulture + '\'' +
                "manFarmer=" + manFarmer + '\'' +
                "manIndustrial=" + manIndustrial + '\'' +
                "manServices=" + manServices + '\'' +
                "manTrained=" + manTrained + '\'' +
                "womenCulture=" + womenCulture + '\'' +
                "womenFarmer=" + womenFarmer + '\'' +
                "womenIndustrial=" + womenIndustrial + '\'' +
                "womenServices=" + womenServices + '\'' +
                "womenTrained=" + womenTrained + '\'' +
                "year=" + year + '\'' +
                '}';
    }
}
