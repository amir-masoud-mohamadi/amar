package com.geofahm.shahrdari.model.service.hotel;



import com.geofahm.shahrdari.model.entity.hotel.Hotel1010;

import com.geofahm.shahrdari.model.repository.hotel.Hotel1010Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Hotel1010Service {
    private final Hotel1010Repository repository;

    @Autowired
    public Hotel1010Service(Hotel1010Repository repository) {
        this.repository = repository;
    }


    public List<Hotel1010> getAll(){
        List<Hotel1010> list=  repository.findAll();
        return list;
    }

    public Hotel1010 findById(Long id){
        Hotel1010 list=  repository.findById(id);
        return list;
    }


    public List<Hotel1010> getByYear(String year){
        List<Hotel1010> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Hotel1010> getByCity(String city){
        List<Hotel1010> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Hotel1010 save(Hotel1010 studentUni){

        return repository.add(studentUni);
    }

    public Hotel1010 edit(Hotel1010 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}