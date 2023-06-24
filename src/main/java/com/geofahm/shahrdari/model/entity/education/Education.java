package com.geofahm.shahrdari.model.entity.education;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "education")
public class Education implements Serializable {



    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "all_employers")
    private String allEmployers;

    @Column(name = "all_students")
    private String allStudents;

    @Column(name = "boys_student")
    private String boysStudent;

    @Column(name = "city")
    private String city;

    @Column(name = "girls_student")
    private String girlsStudent;

    @Column(name = "teachers")
    private String teachers;

    @Column(name = "year")
    private String year;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setAllEmployers(String allEmployers) {
        this.allEmployers = allEmployers;
    }

    public String getAllEmployers() {
        return allEmployers;
    }

    public void setAllStudents(String allStudents) {
        this.allStudents = allStudents;
    }

    public String getAllStudents() {
        return allStudents;
    }

    public void setBoysStudent(String boysStudent) {
        this.boysStudent = boysStudent;
    }

    public String getBoysStudent() {
        return boysStudent;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setGirlsStudent(String girlsStudent) {
        this.girlsStudent = girlsStudent;
    }

    public String getGirlsStudent() {
        return girlsStudent;
    }

    public void setTeachers(String teachers) {
        this.teachers = teachers;
    }

    public String getTeachers() {
        return teachers;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Education{" +
                "id=" + id + '\'' +
                "allEmployers=" + allEmployers + '\'' +
                "allStudents=" + allStudents + '\'' +
                "boysStudent=" + boysStudent + '\'' +
                "city=" + city + '\'' +
                "girlsStudent=" + girlsStudent + '\'' +
                "teachers=" + teachers + '\'' +
                "year=" + year + '\'' +
                '}';
    }
}
