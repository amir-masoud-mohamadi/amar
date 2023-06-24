package com.geofahm.shahrdari.model.service.madan;


import com.geofahm.shahrdari.model.entity.madan.Madan16;

import com.geofahm.shahrdari.model.repository.madan.Madan16Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Madan16Service {
    private final Madan16Repository repository;

    @Autowired
    public Madan16Service(Madan16Repository repository) {
        this.repository = repository;
    }


    public List<Madan16> getAll(){
        List<Madan16> list=  repository.findAll();
        return list;
    }

    public Madan16 findById(Long id){
        Madan16 list=  repository.findById(id);
        return list;
    }


    public List<Madan16> getByYear(String year){
        List<Madan16> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Madan16> getByCity(String city){
        List<Madan16> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Madan16 save(Madan16 studentUni){

        return repository.add(studentUni);
    }

    public Madan16 edit(Madan16 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}