package com.geofahm.shahrdari.model.service.naft;

import com.geofahm.shahrdari.model.entity.naft.Naft71;

import com.geofahm.shahrdari.model.repository.naft.Naft71Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Naft71Service {
    private final Naft71Repository repository;

    @Autowired
    public Naft71Service(Naft71Repository repository) {
        this.repository = repository;
    }


    public List<Naft71> getAll(){
        List<Naft71> list=  repository.findAll();
        return list;
    }

    public Naft71 findById(Long id){
        Naft71 list=  repository.findById(id);
        return list;
    }


    public List<Naft71> getByYear(String year){
        List<Naft71> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Naft71> getByCity(String city){
        List<Naft71> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Naft71 save(Naft71 studentUni){

        return repository.add(studentUni);
    }

    public Naft71 edit(Naft71 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}