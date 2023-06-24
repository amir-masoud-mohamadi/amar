package com.geofahm.shahrdari.model.entity.population;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "average_population")
public class AveragePopulation implements Serializable {



    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "average")
    private String average;

    @Column(name = "population")
    private String population;

    @Column(name = "year")
    private String year;

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

    public String getAverage() {
        return average;
    }

    public void setAverage(String average) {
        this.average = average;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }
}
