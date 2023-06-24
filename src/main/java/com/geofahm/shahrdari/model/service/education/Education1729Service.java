package com.geofahm.shahrdari.model.service.education;


import com.geofahm.shahrdari.model.entity.education.Education1729;
import com.geofahm.shahrdari.model.repository.education.Education1729Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Education1729Service {
    private final Education1729Repository repository;

    @Autowired
    public Education1729Service(Education1729Repository repository) {
        this.repository = repository;
    }


    public List<Education1729> getAll(){
        List<Education1729> list=  repository.findAll();
        return list;
    }

    public Education1729 findById(Long id){
        Education1729 list=  repository.findById(id);
        return list;
    }


    public List<Education1729> getByYear(String year){
        List<Education1729> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Education1729> getByCity(String city){
        List<Education1729> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Education1729 save(Education1729 studentUni){

        return repository.add(studentUni);
    }

    public Education1729 edit(Education1729 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}