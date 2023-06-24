package com.geofahm.shahrdari.model.entity.building;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "building10_1")
public class Building101 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "year")
    private String year;

    @Column(name = "certification")
    private String certification;

    @Column(name = "land_area")
    private String landArea;

    @Column(name = "infrastructure_area")
    private String infrastructureArea;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getCertification() {
        return certification;
    }

    public void setLandArea(String landArea) {
        this.landArea = landArea;
    }

    public String getLandArea() {
        return landArea;
    }

    public void setInfrastructureArea(String infrastructureArea) {
        this.infrastructureArea = infrastructureArea;
    }

    public String getInfrastructureArea() {
        return infrastructureArea;
    }

    @Override
    public String toString() {
        return "Building101{" +
                "id=" + id + '\'' +
                "year=" + year + '\'' +
                "certification=" + certification + '\'' +
                "landArea=" + landArea + '\'' +
                "infrastructureArea=" + infrastructureArea + '\'' +
                '}';
    }
}
