package com.geofahm.shahrdari.model.entity.madan;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "madan1_6")
public class Madan16 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "t_madan")
    private String tMadan;

    @Column(name = "t_madan_khos")
    private String tMadanKhos;

    @Column(name = "t_shaghel")
    private String tShaghel;

    @Column(name = "j_khadamat")
    private String jKhadamat;

    @Column(name = "year")
    private String year;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String gettMadan() {
        return tMadan;
    }

    public void settMadan(String tMadan) {
        this.tMadan = tMadan;
    }

    public String gettMadanKhos() {
        return tMadanKhos;
    }

    public void settMadanKhos(String tMadanKhos) {
        this.tMadanKhos = tMadanKhos;
    }

    public String gettShaghel() {
        return tShaghel;
    }

    public void settShaghel(String tShaghel) {
        this.tShaghel = tShaghel;
    }

    public String getjKhadamat() {
        return jKhadamat;
    }

    public void setjKhadamat(String jKhadamat) {
        this.jKhadamat = jKhadamat;
    }

    public void setTMadan(String tMadan) {
        this.tMadan = tMadan;
    }

    public String getTMadan() {
        return tMadan;
    }

    public void setTMadanKhos(String tMadanKhos) {
        this.tMadanKhos = tMadanKhos;
    }

    public String getTMadanKhos() {
        return tMadanKhos;
    }

    public void setTShaghel(String tShaghel) {
        this.tShaghel = tShaghel;
    }

    public String getTShaghel() {
        return tShaghel;
    }

    public void setJKhadamat(String jKhadamat) {
        this.jKhadamat = jKhadamat;
    }

    public String getJKhadamat() {
        return jKhadamat;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Madan16{" +
                "id=" + id + '\'' +

                "tMadan=" + tMadan + '\'' +
                "tMadanKhos=" + tMadanKhos + '\'' +
                "tShaghel=" + tShaghel + '\'' +
                "jKhadamat=" + jKhadamat + '\'' +
                "year=" + year + '\'' +
                '}';
    }
}
