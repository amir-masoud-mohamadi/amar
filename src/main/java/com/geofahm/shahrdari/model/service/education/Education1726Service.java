package com.geofahm.shahrdari.model.service.education;


import com.geofahm.shahrdari.model.entity.education.Education1726;
import com.geofahm.shahrdari.model.repository.education.Education1726Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Education1726Service {
    private final Education1726Repository repository;

    @Autowired
    public Education1726Service(Education1726Repository repository) {
        this.repository = repository;
    }


    public List<Education1726> getAll(){
        List<Education1726> list=  repository.findAll();
        return list;
    }

    public Education1726 findById(Long id){
        Education1726 list=  repository.findById(id);
        return list;
    }


    public List<Education1726> getByYear(String year){
        List<Education1726> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Education1726> getByCity(String city){
        List<Education1726> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Education1726 save(Education1726 studentUni){

        return repository.add(studentUni);
    }

    public Education1726 edit(Education1726 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}