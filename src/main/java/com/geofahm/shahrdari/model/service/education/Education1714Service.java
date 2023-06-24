package com.geofahm.shahrdari.model.service.education;


import com.geofahm.shahrdari.model.entity.education.Education1714;
import com.geofahm.shahrdari.model.repository.education.Education1714Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Education1714Service {
    private final Education1714Repository repository;

    @Autowired
    public Education1714Service(Education1714Repository repository) {
        this.repository = repository;
    }


    public List<Education1714> getAll(){
        List<Education1714> list=  repository.findAll();
        return list;
    }

    public Education1714 findById(Long id){
        Education1714 list=  repository.findById(id);
        return list;
    }


    public List<Education1714> getByYear(String year){
        List<Education1714> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Education1714> getByCity(String city){
        List<Education1714> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Education1714 save(Education1714 studentUni){

        return repository.add(studentUni);
    }

    public Education1714 edit(Education1714 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}