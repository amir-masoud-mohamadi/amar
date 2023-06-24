package com.geofahm.shahrdari.model.service.tamin;

import com.geofahm.shahrdari.model.entity.tamin.Tamin161;

import com.geofahm.shahrdari.model.repository.tamin.Tamin161Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Tamin161Service {
    private final Tamin161Repository repository;

    @Autowired
    public Tamin161Service(Tamin161Repository repository) {
        this.repository = repository;
    }


    public List<Tamin161> getAll(){
        List<Tamin161> list=  repository.findAll();
        return list;
    }

    public Tamin161 findById(Long id){
        Tamin161 list=  repository.findById(id);
        return list;
    }


    public List<Tamin161> getByYear(String year){
        List<Tamin161> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Tamin161> getByCity(String city){
        List<Tamin161> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Tamin161 save(Tamin161 studentUni){

        return repository.add(studentUni);
    }

    public Tamin161 edit(Tamin161 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}