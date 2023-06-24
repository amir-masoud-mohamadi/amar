package com.geofahm.shahrdari.model.entity.education;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "education17_22")
public class Education1722 implements Serializable {



    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "assistant_professor")
    private String assistantProfessor;

    @Column(name = "associate_professor")
    private String associateProfessor;

    @Column(name = "city")
    private String city;

    @Column(name = "coach")
    private String coach;

    @Column(name = "educator")
    private String educator;

    @Column(name = "non_faculty_university_eachers")
    private String nonFacultyUniversityEachers;

    @Column(name = "professor")
    private String professor;

    @Column(name = "total")
    private String total;

    @Column(name = "year")
    private String year;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setAssistantProfessor(String assistantProfessor) {
        this.assistantProfessor = assistantProfessor;
    }

    public String getAssistantProfessor() {
        return assistantProfessor;
    }

    public void setAssociateProfessor(String associateProfessor) {
        this.associateProfessor = associateProfessor;
    }

    public String getAssociateProfessor() {
        return associateProfessor;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getCoach() {
        return coach;
    }

    public void setEducator(String educator) {
        this.educator = educator;
    }

    public String getEducator() {
        return educator;
    }

    public void setNonFacultyUniversityEachers(String nonFacultyUniversityEachers) {
        this.nonFacultyUniversityEachers = nonFacultyUniversityEachers;
    }

    public String getNonFacultyUniversityEachers() {
        return nonFacultyUniversityEachers;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getProfessor() {
        return professor;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotal() {
        return total;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Education1722{" +
                "id=" + id + '\'' +
                "assistantProfessor=" + assistantProfessor + '\'' +
                "associateProfessor=" + associateProfessor + '\'' +
                "city=" + city + '\'' +
                "coach=" + coach + '\'' +
                "educator=" + educator + '\'' +
                "nonFacultyUniversityEachers=" + nonFacultyUniversityEachers + '\'' +
                "professor=" + professor + '\'' +
                "total=" + total + '\'' +
                "year=" + year + '\'' +
                '}';
    }
}
