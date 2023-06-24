package com.geofahm.shahrdari.model.entity.bazarmali;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "mali11_14")
@Entity
public class Mali1114 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SeqGen-MiRNA")
    @TableGenerator(name = "SeqGen-MiRNA", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "mirnaId", initialValue = 100)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "number")
    private String number;

    @Column(name = "price")
    private String price;

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

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Mali1114{" +
                "id=" + id + '\'' +
                "city=" + city + '\'' +
                "number=" + number + '\'' +
                "price=" + price + '\'' +
                "year=" + year + '\'' +
                '}';
    }
}
