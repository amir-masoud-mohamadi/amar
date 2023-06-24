package com.geofahm.shahrdari.model.entity.mohit;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mohit2_11")
public class Mohit211 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "ehdas")
    private String ehdas;

    @Column(name = "tolid")
    private String tolid;

    @Column(name = "nahal")
    private String nahal;

    @Column(name = "bazr")
    private String bazr;

    @Column(name = "jam")
    private String jam;

    @Column(name = "malch")
    private String malch;

    @Column(name = "hefaz")
    private String hefaz;

    @Column(name = "year")
    private String year;

    @Column(name = "ehdas1")
    private String ehdas1;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setEhdas(String ehdas) {
        this.ehdas = ehdas;
    }

    public String getEhdas() {
        return ehdas;
    }

    public void setTolid(String tolid) {
        this.tolid = tolid;
    }

    public String getTolid() {
        return tolid;
    }

    public void setNahal(String nahal) {
        this.nahal = nahal;
    }

    public String getNahal() {
        return nahal;
    }

    public void setBazr(String bazr) {
        this.bazr = bazr;
    }

    public String getBazr() {
        return bazr;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getJam() {
        return jam;
    }

    public void setMalch(String malch) {
        this.malch = malch;
    }

    public String getMalch() {
        return malch;
    }

    public void setHefaz(String hefaz) {
        this.hefaz = hefaz;
    }

    public String getHefaz() {
        return hefaz;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setEhdas1(String ehdas1) {
        this.ehdas1 = ehdas1;
    }

    public String getEhdas1() {
        return ehdas1;
    }

    @Override
    public String toString() {
        return "Mohit211{" +
                "id=" + id + '\'' +
                "ehdas=" + ehdas + '\'' +
                "tolid=" + tolid + '\'' +
                "nahal=" + nahal + '\'' +
                "bazr=" + bazr + '\'' +
                "jam=" + jam + '\'' +
                "malch=" + malch + '\'' +
                "hefaz=" + hefaz + '\'' +
                "year=" + year + '\'' +
                "ehdas1=" + ehdas1 + '\'' +
                '}';
    }
}
