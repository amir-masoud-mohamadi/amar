package com.geofahm.shahrdari.model.service.sanat;

import com.geofahm.shahrdari.model.entity.sanat.Sanat81;

import com.geofahm.shahrdari.model.repository.sanat.Sanat81Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Sanat81Service {
    private final Sanat81Repository repository;

    @Autowired
    public Sanat81Service(Sanat81Repository repository) {
        this.repository = repository;
    }


    public List<Sanat81> getAll(){
        List<Sanat81> list=  repository.findAll();
        return list;
    }

    public Sanat81 findById(Long id){
        Sanat81 list=  repository.findById(id);
        return list;
    }


    public List<Sanat81> getByYear(String year){
        List<Sanat81> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Sanat81> getByCity(String city){
        List<Sanat81> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Sanat81 save(Sanat81 studentUni){

        return repository.add(studentUni);
    }

    public Sanat81 edit(Sanat81 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}