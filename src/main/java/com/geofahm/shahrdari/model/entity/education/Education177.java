package com.geofahm.shahrdari.model.entity.education;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "education17_7")
public class Education177 implements Serializable {



    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "academic_period")
    private String academicPeriod;

    @Column(name = "all_students")
    private String allStudents;

    @Column(name = "boys_students")
    private String boysStudents;

    @Column(name = "girl_student")
    private String girlStudent;

    @Column(name = "year")
    private String year;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setAcademicPeriod(String academicPeriod) {
        this.academicPeriod = academicPeriod;
    }

    public String getAcademicPeriod() {
        return academicPeriod;
    }

    public void setAllStudents(String allStudents) {
        this.allStudents = allStudents;
    }

    public String getAllStudents() {
        return allStudents;
    }

    public void setBoysStudents(String boysStudents) {
        this.boysStudents = boysStudents;
    }

    public String getBoysStudents() {
        return boysStudents;
    }

    public void setGirlStudent(String girlStudent) {
        this.girlStudent = girlStudent;
    }

    public String getGirlStudent() {
        return girlStudent;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Education177{" +
                "id=" + id + '\'' +
                "academicPeriod=" + academicPeriod + '\'' +
                "allStudents=" + allStudents + '\'' +
                "boysStudents=" + boysStudents + '\'' +
                "girlStudent=" + girlStudent + '\'' +
                "year=" + year + '\'' +
                '}';
    }
}
