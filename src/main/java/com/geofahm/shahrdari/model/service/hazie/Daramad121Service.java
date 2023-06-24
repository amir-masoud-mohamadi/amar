package com.geofahm.shahrdari.model.service.hazie;



import com.geofahm.shahrdari.model.entity.hazineh.Daramad121;

import com.geofahm.shahrdari.model.repository.hazine.Daramad121Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Daramad121Service {
    private final Daramad121Repository repository;

    @Autowired
    public Daramad121Service(Daramad121Repository repository) {
        this.repository = repository;
    }


    public List<Daramad121> getAll(){
        List<Daramad121> list=  repository.findAll();
        return list;
    }

    public Daramad121 findById(Long id){
        Daramad121 list=  repository.findById(id);
        return list;
    }


    public List<Daramad121> getByYear(String year){
        List<Daramad121> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Daramad121> getByCity(String city){
        List<Daramad121> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Daramad121 save(Daramad121 studentUni){

        return repository.add(studentUni);
    }

    public Daramad121 edit(Daramad121 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}