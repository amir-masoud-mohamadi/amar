package com.geofahm.shahrdari.model.service.education;


import com.geofahm.shahrdari.model.entity.education.Education1730;
import com.geofahm.shahrdari.model.repository.education.Education1730Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Education1730Service {
    private final Education1730Repository repository;

    @Autowired
    public Education1730Service(Education1730Repository repository) {
        this.repository = repository;
    }


    public List<Education1730> getAll(){
        List<Education1730> list=  repository.findAll();
        return list;
    }

    public Education1730 findById(Long id){
        Education1730 list=  repository.findById(id);
        return list;
    }


    public List<Education1730> getByYear(String year){
        List<Education1730> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Education1730> getByCity(String city){
        List<Education1730> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Education1730 save(Education1730 studentUni){

        return repository.add(studentUni);
    }

    public Education1730 edit(Education1730 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}