package com.geofahm.shahrdari.model.service.biulding;



import com.geofahm.shahrdari.model.entity.building.Building101;
import com.geofahm.shahrdari.model.repository.building.Building101Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Biulding101Service {
    private final Building101Repository repository;

    @Autowired
    public Biulding101Service(Building101Repository repository) {
        this.repository = repository;
    }


    public List<Building101> getAll(){
        List<Building101> list=  repository.findAll();
        return list;
    }

    public Building101 findById(Long id){
        Building101 list=  repository.findById(id);
        return list;
    }


    public List<Building101> getByYear(String year){
        List<Building101> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Building101> getByCity(String city){
        List<Building101> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Building101 save(Building101 studentUni){

        return repository.add(studentUni);
    }

    public Building101 edit(Building101 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}