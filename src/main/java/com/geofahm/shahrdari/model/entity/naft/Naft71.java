package com.geofahm.shahrdari.model.entity.naft;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "naft7_1")
public class Naft71 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "year")
    private String year;

    @Column(name = "gaz")
    private String gaz;

    @Column(name = "benzin")
    private String benzin;

    @Column(name = "naft_sefid")
    private String naftSefid;

    @Column(name = "naft_gaz")
    private String naftGaz;

    @Column(name = "naft_kore")
    private String naftKore;

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

    public void setGaz(String gaz) {
        this.gaz = gaz;
    }

    public String getGaz() {
        return gaz;
    }

    public void setBenzin(String benzin) {
        this.benzin = benzin;
    }

    public String getBenzin() {
        return benzin;
    }

    public void setNaftSefid(String naftSefid) {
        this.naftSefid = naftSefid;
    }

    public String getNaftSefid() {
        return naftSefid;
    }

    public void setNaftGaz(String naftGaz) {
        this.naftGaz = naftGaz;
    }

    public String getNaftGaz() {
        return naftGaz;
    }

    public void setNaftKore(String naftKore) {
        this.naftKore = naftKore;
    }

    public String getNaftKore() {
        return naftKore;
    }

    @Override
    public String toString() {
        return "Naft71{" +
                "id=" + id + '\'' +
                "year=" + year + '\'' +
                "gaz=" + gaz + '\'' +
                "benzin=" + benzin + '\'' +
                "naftSefid=" + naftSefid + '\'' +
                "naftGaz=" + naftGaz + '\'' +
                "naftKore=" + naftKore + '\'' +
                '}';
    }
}
