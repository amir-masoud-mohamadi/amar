package com.geofahm.shahrdari.model.entity.mohit;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mohit2_10")
public class Mohit210 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "bote")
    private String bote;

    @Column(name = "kope")
    private String kope;

    @Column(name = "kod")
    private String kod;

    @Column(name = "zakhire")
    private String zakhire;

    @Column(name = "ehdas")
    private String ehdas;

    @Column(name = "hofre")
    private String hofre;

    @Column(name = "nasb")
    private String nasb;

    @Column(name = "tabdil")
    private String tabdil;

    @Column(name = "momayezi")
    private String momayezi;

    @Column(name = "year")
    private String year;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setBote(String bote) {
        this.bote = bote;
    }

    public String getBote() {
        return bote;
    }

    public void setKope(String kope) {
        this.kope = kope;
    }

    public String getKope() {
        return kope;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getKod() {
        return kod;
    }

    public void setZakhire(String zakhire) {
        this.zakhire = zakhire;
    }

    public String getZakhire() {
        return zakhire;
    }

    public void setEhdas(String ehdas) {
        this.ehdas = ehdas;
    }

    public String getEhdas() {
        return ehdas;
    }

    public void setHofre(String hofre) {
        this.hofre = hofre;
    }

    public String getHofre() {
        return hofre;
    }

    public void setNasb(String nasb) {
        this.nasb = nasb;
    }

    public String getNasb() {
        return nasb;
    }

    public void setTabdil(String tabdil) {
        this.tabdil = tabdil;
    }

    public String getTabdil() {
        return tabdil;
    }

    public void setMomayezi(String momayezi) {
        this.momayezi = momayezi;
    }

    public String getMomayezi() {
        return momayezi;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Mohit210{" +
                "id=" + id + '\'' +
                "bote=" + bote + '\'' +
                "kope=" + kope + '\'' +
                "kod=" + kod + '\'' +
                "zakhire=" + zakhire + '\'' +
                "ehdas=" + ehdas + '\'' +
                "hofre=" + hofre + '\'' +
                "nasb=" + nasb + '\'' +
                "tabdil=" + tabdil + '\'' +
                "momayezi=" + momayezi + '\'' +
                "year=" + year + '\'' +
                '}';
    }
}
