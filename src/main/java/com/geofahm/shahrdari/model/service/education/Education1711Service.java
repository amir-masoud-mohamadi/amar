package com.geofahm.shahrdari.model.service.education;


import com.geofahm.shahrdari.model.entity.education.Education1711;
import com.geofahm.shahrdari.model.repository.education.Education1711Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Education1711Service {
    private final Education1711Repository repository;

    @Autowired
    public Education1711Service(Education1711Repository repository) {
        this.repository = repository;
    }


    public List<Education1711> getAll(){
        List<Education1711> list=  repository.findAll();
        return list;
    }

    public Education1711 findById(Long id){
        Education1711 list=  repository.findById(id);
        return list;
    }


    public List<Education1711> getByYear(String year){
        List<Education1711> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Education1711> getByCity(String city){
        List<Education1711> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Education1711 save(Education1711 studentUni){

        return repository.add(studentUni);
    }

    public Education1711 edit(Education1711 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}