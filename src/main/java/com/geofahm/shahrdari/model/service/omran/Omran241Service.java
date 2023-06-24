package com.geofahm.shahrdari.model.service.omran;

import com.geofahm.shahrdari.model.entity.omran.Omran241;
import com.geofahm.shahrdari.model.repository.omran.Omran241Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Omran241Service {
    private final Omran241Repository repository;

    @Autowired
    public Omran241Service(Omran241Repository repository) {
        this.repository = repository;
    }


    public List<Omran241> getAll(){
        List<Omran241> list=  repository.findAll();
        return list;
    }

    public Omran241 findById(Long id){
        Omran241 list=  repository.findById(id);
        return list;
    }


    public List<Omran241> getByYear(String year){
        List<Omran241> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Omran241> getByCity(String city){
        List<Omran241> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Omran241 save(Omran241 studentUni){

        return repository.add(studentUni);
    }

    public Omran241 edit(Omran241 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}