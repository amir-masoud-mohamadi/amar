package com.geofahm.shahrdari.model.service.shakhes;

import com.geofahm.shahrdari.model.entity.shakhes.Geymat1712;


import com.geofahm.shahrdari.model.repository.shakhes.Geymat1712Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Geymat1712Service {
    private final Geymat1712Repository repository;

    @Autowired
    public Geymat1712Service(Geymat1712Repository repository) {
        this.repository = repository;
    }


    public List<Geymat1712> getAll(){
        List<Geymat1712> list=  repository.findAll();
        return list;
    }

    public Geymat1712 findById(Long id){
        Geymat1712 list=  repository.findById(id);
        return list;
    }


    public List<Geymat1712> getByYear(String year){
        List<Geymat1712> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Geymat1712> getByCity(String city){
        List<Geymat1712> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Geymat1712 save(Geymat1712 studentUni){

        return repository.add(studentUni);
    }

    public Geymat1712 edit(Geymat1712 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}