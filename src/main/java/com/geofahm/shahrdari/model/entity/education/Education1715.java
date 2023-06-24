package com.geofahm.shahrdari.model.entity.education;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "education17_15")
public class Education1715 implements Serializable {



    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "all_student")
    private String allStudent;

    @Column(name = "boy_students")
    private String boyStudents;

    @Column(name = "city")
    private String city;

    @Column(name = "classes")
    private String classes;

    @Column(name = "girl_students")
    private String girlStudents;

    @Column(name = "schools")
    private String schools;

    @Column(name = "year")
    private String year;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setAllStudent(String allStudent) {
        this.allStudent = allStudent;
    }

    public String getAllStudent() {
        return allStudent;
    }

    public void setBoyStudents(String boyStudents) {
        this.boyStudents = boyStudents;
    }

    public String getBoyStudents() {
        return boyStudents;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getClasses() {
        return classes;
    }

    public void setGirlStudents(String girlStudents) {
        this.girlStudents = girlStudents;
    }

    public String getGirlStudents() {
        return girlStudents;
    }

    public void setSchools(String schools) {
        this.schools = schools;
    }

    public String getSchools() {
        return schools;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Education1715{" +
                "id=" + id + '\'' +
                "allStudent=" + allStudent + '\'' +
                "boyStudents=" + boyStudents + '\'' +
                "city=" + city + '\'' +
                "classes=" + classes + '\'' +
                "girlStudents=" + girlStudents + '\'' +
                "schools=" + schools + '\'' +
                "year=" + year + '\'' +
                '}';
    }
}
