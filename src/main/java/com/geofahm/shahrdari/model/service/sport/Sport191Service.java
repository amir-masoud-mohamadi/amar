package com.geofahm.shahrdari.model.service.sport;

import com.geofahm.shahrdari.model.entity.sport.Sport191;

import com.geofahm.shahrdari.model.repository.sport.Sport191Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Sport191Service {
    private final Sport191Repository repository;

    @Autowired
    public Sport191Service(Sport191Repository repository) {
        this.repository = repository;
    }


    public List<Sport191> getAll(){
        List<Sport191> list=  repository.findAll();
        return list;
    }

    public Sport191 findById(Long id){
        Sport191 list=  repository.findById(id);
        return list;
    }


    public List<Sport191> getByYear(String year){
        List<Sport191> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Sport191> getByCity(String city){
        List<Sport191> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Sport191 save(Sport191 studentUni){

        return repository.add(studentUni);
    }

    public Sport191 edit(Sport191 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}