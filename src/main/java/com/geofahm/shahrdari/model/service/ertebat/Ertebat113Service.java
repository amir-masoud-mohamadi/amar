package com.geofahm.shahrdari.model.service.ertebat;



import com.geofahm.shahrdari.model.entity.ertebatat.Ertebat113;

import com.geofahm.shahrdari.model.repository.ertebat.Ertebat113Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ertebat113Service {
    private final Ertebat113Repository repository;

    @Autowired
    public Ertebat113Service(Ertebat113Repository repository) {
        this.repository = repository;
    }


    public List<Ertebat113> getAll(){
        List<Ertebat113> list=  repository.findAll();
        return list;
    }

    public Ertebat113 findById(Long id){
        Ertebat113 list=  repository.findById(id);
        return list;
    }


    public List<Ertebat113> getByYear(String year){
        List<Ertebat113> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Ertebat113> getByCity(String city){
        List<Ertebat113> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Ertebat113 save(Ertebat113 studentUni){

        return repository.add(studentUni);
    }

    public Ertebat113 edit(Ertebat113 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}