package com.geofahm.shahrdari.model.service.weather;

import com.geofahm.shahrdari.model.entity.weather.Weather18;
import com.geofahm.shahrdari.model.repository.weather.Weather18Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Weather18Service {
    private final Weather18Repository repository;

    @Autowired
    public Weather18Service(Weather18Repository repository) {
        this.repository = repository;
    }


    public List<Weather18> getAll(){
        List<Weather18> list=  repository.findAll();
        return list;
    }

    public Weather18 findById(Long id){
        Weather18 list=  repository.findById(id);
        return list;
    }


    public List<Weather18> getByYear(String year){
        List<Weather18> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Weather18> getByCity(String city){
        List<Weather18> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Weather18 save(Weather18 studentUni){

        return repository.add(studentUni);
    }

    public Weather18 edit(Weather18 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}