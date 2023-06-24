package com.geofahm.shahrdari.model.service.beh;



import com.geofahm.shahrdari.model.entity.behdasht.Beh218;

import com.geofahm.shahrdari.model.repository.bhdasht.Beh218Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Beh218Service {
    private final Beh218Repository repository;

    @Autowired
    public Beh218Service(Beh218Repository repository) {
        this.repository = repository;
    }


    public List<Beh218> getAll(){
        List<Beh218> list=  repository.findAll();
        return list;
    }

    public Beh218 findById(Long id){
        Beh218 list=  repository.findById(id);
        return list;
    }


    public List<Beh218> getByYear(String year){
        List<Beh218> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Beh218> getByCity(String city){
        List<Beh218> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Beh218 save(Beh218 studentUni){

        return repository.add(studentUni);
    }

    public Beh218 edit(Beh218 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}