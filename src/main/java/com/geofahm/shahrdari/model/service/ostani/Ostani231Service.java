package com.geofahm.shahrdari.model.service.ostani;

import com.geofahm.shahrdari.model.entity.ostani.Ostani231;

import com.geofahm.shahrdari.model.repository.ostani.Ostani231Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ostani231Service {
    private final Ostani231Repository repository;

    @Autowired
    public Ostani231Service(Ostani231Repository repository) {
        this.repository = repository;
    }


    public List<Ostani231> getAll(){
        List<Ostani231> list=  repository.findAll();
        return list;
    }

    public Ostani231 findById(Long id){
        Ostani231 list=  repository.findById(id);
        return list;
    }


    public List<Ostani231> getByYear(String year){
        List<Ostani231> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Ostani231> getByCity(String city){
        List<Ostani231> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Ostani231 save(Ostani231 studentUni){

        return repository.add(studentUni);
    }

    public Ostani231 edit(Ostani231 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}