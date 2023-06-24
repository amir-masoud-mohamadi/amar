package com.geofahm.shahrdari.model.service.education;


import com.geofahm.shahrdari.model.entity.education.Education1715;
import com.geofahm.shahrdari.model.repository.education.Education1715Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Education1715Service {
    private final Education1715Repository repository;

    @Autowired
    public Education1715Service(Education1715Repository repository) {
        this.repository = repository;
    }


    public List<Education1715> getAll(){
        List<Education1715> list=  repository.findAll();
        return list;
    }

    public Education1715 findById(Long id){
        Education1715 list=  repository.findById(id);
        return list;
    }


    public List<Education1715> getByYear(String year){
        List<Education1715> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Education1715> getByCity(String city){
        List<Education1715> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Education1715 save(Education1715 studentUni){

        return repository.add(studentUni);
    }

    public Education1715 edit(Education1715 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}