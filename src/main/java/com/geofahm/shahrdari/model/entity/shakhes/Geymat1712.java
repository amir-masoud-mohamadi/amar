package com.geofahm.shahrdari.model.entity.shakhes;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "geymat17_12")
public class Geymat1712 implements Serializable {

    private static final long serialVersionUID=1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "zarib")
    private String zarib;

    @Column(name = "darsad")
    private String darsad;

    @Column(name = "year")
    private String year;

    public  void setId(Long id){
        this.id=id;
    }

    public Long getId(){
        return id;
    }

    public  void setCity(String city){
        this.city=city;
    }

    public String getCity(){
        return city;
    }

    public  void setZarib(String zarib){
        this.zarib=zarib;
    }

    public String getZarib(){
        return zarib;
    }

    public  void setDarsad(String darsad){
        this.darsad=darsad;
    }

    public String getDarsad(){
        return darsad;
    }

    public  void setYear(String year){
        this.year=year;
    }

    public String getYear(){
        return year;
    }

    @Override
    public String toString(){
        return"Geymat17-12{"+
                "id="+id+'\''+
                "city="+city+'\''+
                "zarib="+zarib+'\''+
                "darsad="+darsad+'\''+
                "year="+year+'\''+
                '}';
    }
}
