package com.geofahm.shahrdari.model.entity.ghazaei;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ghaza1_15")
public class Ghaza115 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "dad")
    private String dad;

    @Column(name = "enghe")
    private String enghe;

    @Column(name = "tajdid")
    private String tajdid;

    @Column(name = "keyfar")
    private String keyfar;

    @Column(name = "dadasa")
    private String dadasa;

    @Column(name = "shora")
    private String shora;

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

    public void setDad(String dad) {
        this.dad = dad;
    }

    public String getDad() {
        return dad;
    }

    public void setEnghe(String enghe) {
        this.enghe = enghe;
    }

    public String getEnghe() {
        return enghe;
    }

    public void setTajdid(String tajdid) {
        this.tajdid = tajdid;
    }

    public String getTajdid() {
        return tajdid;
    }

    public void setKeyfar(String keyfar) {
        this.keyfar = keyfar;
    }

    public String getKeyfar() {
        return keyfar;
    }

    public void setDadasa(String dadasa) {
        this.dadasa = dadasa;
    }

    public String getDadasa() {
        return dadasa;
    }

    public void setShora(String shora) {
        this.shora = shora;
    }

    public String getShora() {
        return shora;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Ghaza115{" +
                "id=" + id + '\'' +
                "city=" + city + '\'' +
                "dad=" + dad + '\'' +
                "enghe=" + enghe + '\'' +
                "tajdid=" + tajdid + '\'' +
                "keyfar=" + keyfar + '\'' +
                "dadasa=" + dadasa + '\'' +
                "shora=" + shora + '\'' +
                "year=" + year + '\'' +
                '}';
    }
}
