package com.geofahm.shahrdari.model.service.weather;

import com.geofahm.shahrdari.model.entity.weather.Weather17;
import com.geofahm.shahrdari.model.repository.weather.Weather17Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Weather17Service {
    private final Weather17Repository repository;

    @Autowired
    public Weather17Service(Weather17Repository repository) {
        this.repository = repository;
    }


    public List<Weather17> getAll(){
        List<Weather17> list=  repository.findAll();
        return list;
    }

    public Weather17 findById(Long id){
        Weather17 list=  repository.findById(id);
        return list;
    }


    public List<Weather17> getByYear(String year){
        List<Weather17> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Weather17> getByCity(String city){
        List<Weather17> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Weather17 save(Weather17 studentUni){

        return repository.add(studentUni);
    }

    public Weather17 edit(Weather17 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}