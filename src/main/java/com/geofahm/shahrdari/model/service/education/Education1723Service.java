package com.geofahm.shahrdari.model.service.education;


import com.geofahm.shahrdari.model.entity.education.Education1723;
import com.geofahm.shahrdari.model.repository.education.Education1723Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Education1723Service {
    private final Education1723Repository repository;

    @Autowired
    public Education1723Service(Education1723Repository repository) {
        this.repository = repository;
    }


    public List<Education1723> getAll(){
        List<Education1723> list=  repository.findAll();
        return list;
    }

    public Education1723 findById(Long id){
        Education1723 list=  repository.findById(id);
        return list;
    }


    public List<Education1723> getByYear(String year){
        List<Education1723> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Education1723> getByCity(String city){
        List<Education1723> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Education1723 save(Education1723 studentUni){

        return repository.add(studentUni);
    }

    public Education1723 edit(Education1723 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}