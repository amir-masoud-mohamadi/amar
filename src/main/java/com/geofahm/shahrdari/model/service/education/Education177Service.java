package com.geofahm.shahrdari.model.service.education;


import com.geofahm.shahrdari.model.entity.education.Education177;
import com.geofahm.shahrdari.model.repository.education.Education177Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Education177Service {
    private final Education177Repository repository;

    @Autowired
    public Education177Service(Education177Repository repository) {
        this.repository = repository;
    }


    public List<Education177> getAll(){
        List<Education177> list=  repository.findAll();
        return list;
    }

    public Education177 findById(Long id){
        Education177 list=  repository.findById(id);
        return list;
    }


    public List<Education177> getByYear(String year){
        List<Education177> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Education177> getByCity(String city){
        List<Education177> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Education177 save(Education177 studentUni){

        return repository.add(studentUni);
    }

    public Education177 edit(Education177 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}