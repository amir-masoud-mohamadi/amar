package com.geofahm.shahrdari.model.service.ensani;



import com.geofahm.shahrdari.model.entity.ensani.Ensani46;
import com.geofahm.shahrdari.model.repository.ensani46.Ensani46Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ensani46Service {
    private final Ensani46Repository repository;

    @Autowired
    public Ensani46Service(Ensani46Repository repository) {
        this.repository = repository;
    }


    public List<Ensani46> getAll(){
        List<Ensani46> list=  repository.findAll();
        return list;
    }

    public Ensani46 findById(Long id){
        Ensani46 list=  repository.findById(id);
        return list;
    }


    public List<Ensani46> getByYear(String year){
        List<Ensani46> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Ensani46> getByCity(String city){
        List<Ensani46> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Ensani46 save(Ensani46 studentUni){

        return repository.add(studentUni);
    }

    public Ensani46 edit(Ensani46 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}