package com.geofahm.shahrdari.model.service.education;


import com.geofahm.shahrdari.model.entity.education.Education1724;
import com.geofahm.shahrdari.model.repository.education.Education1724Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Education1724Service {
    private final Education1724Repository repository;

    @Autowired
    public Education1724Service(Education1724Repository repository) {
        this.repository = repository;
    }


    public List<Education1724> getAll(){
        List<Education1724> list=  repository.findAll();
        return list;
    }

    public Education1724 findById(Long id){
        Education1724 list=  repository.findById(id);
        return list;
    }


    public List<Education1724> getByYear(String year){
        List<Education1724> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Education1724> getByCity(String city){
        List<Education1724> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Education1724 save(Education1724 studentUni){

        return repository.add(studentUni);
    }

    public Education1724 edit(Education1724 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}