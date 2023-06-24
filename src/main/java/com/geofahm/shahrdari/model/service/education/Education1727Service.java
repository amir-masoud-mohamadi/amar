package com.geofahm.shahrdari.model.service.education;


import com.geofahm.shahrdari.model.entity.education.Education1727;
import com.geofahm.shahrdari.model.repository.education.Education1727Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Education1727Service {
    private final Education1727Repository repository;

    @Autowired
    public Education1727Service(Education1727Repository repository) {
        this.repository = repository;
    }


    public List<Education1727> getAll(){
        List<Education1727> list=  repository.findAll();
        return list;
    }

    public Education1727 findById(Long id){
        Education1727 list=  repository.findById(id);
        return list;
    }


    public List<Education1727> getByYear(String year){
        List<Education1727> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Education1727> getByCity(String city){
        List<Education1727> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Education1727 save(Education1727 studentUni){

        return repository.add(studentUni);
    }

    public Education1727 edit(Education1727 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}