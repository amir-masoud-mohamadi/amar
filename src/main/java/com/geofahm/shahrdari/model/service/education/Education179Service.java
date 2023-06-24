package com.geofahm.shahrdari.model.service.education;


import com.geofahm.shahrdari.model.entity.education.Education179;
import com.geofahm.shahrdari.model.repository.education.Education179Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Education179Service {
    private final Education179Repository repository;

    @Autowired
    public Education179Service(Education179Repository repository) {
        this.repository = repository;
    }


    public List<Education179> getAll(){
        List<Education179> list=  repository.findAll();
        return list;
    }

    public Education179 findById(Long id){
        Education179 list=  repository.findById(id);
        return list;
    }


    public List<Education179> getByYear(String year){
        List<Education179> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Education179> getByCity(String city){
        List<Education179> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Education179 save(Education179 studentUni){

        return repository.add(studentUni);
    }

    public Education179 edit(Education179 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}