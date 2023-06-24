package com.geofahm.shahrdari.model.service.weather;

import com.geofahm.shahrdari.model.entity.weather.Weather13;
import com.geofahm.shahrdari.model.repository.weather.Weather13Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Weather13Service {
    private final Weather13Repository repository;

    @Autowired
    public Weather13Service(Weather13Repository repository) {
        this.repository = repository;
    }


    public List<Weather13> getAll(){
        List<Weather13> list=  repository.findAll();
        return list;
    }

    public Weather13 findById(Long id){
        Weather13 list=  repository.findById(id);
        return list;
    }


    public List<Weather13> getByYear(String year){
        List<Weather13> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Weather13> getByCity(String city){
        List<Weather13> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Weather13 save(Weather13 studentUni){

        return repository.add(studentUni);
    }

    public Weather13 edit(Weather13 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}