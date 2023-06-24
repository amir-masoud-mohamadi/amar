package com.geofahm.shahrdari.model.service.education;


import com.geofahm.shahrdari.model.entity.education.Education1728;
import com.geofahm.shahrdari.model.repository.education.Education1728Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Education1728Service {
    private final Education1728Repository repository;

    @Autowired
    public Education1728Service(Education1728Repository repository) {
        this.repository = repository;
    }


    public List<Education1728> getAll(){
        List<Education1728> list=  repository.findAll();
        return list;
    }

    public Education1728 findById(Long id){
        Education1728 list=  repository.findById(id);
        return list;
    }


    public List<Education1728> getByYear(String year){
        List<Education1728> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Education1728> getByCity(String city){
        List<Education1728> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Education1728 save(Education1728 studentUni){

        return repository.add(studentUni);
    }

    public Education1728 edit(Education1728 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}