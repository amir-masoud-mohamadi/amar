package com.geofahm.shahrdari.model.service.education;


import com.geofahm.shahrdari.model.entity.education.Education178;
import com.geofahm.shahrdari.model.repository.education.Education178Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Education178Service {
    private final Education178Repository repository;

    @Autowired
    public Education178Service(Education178Repository repository) {
        this.repository = repository;
    }


    public List<Education178> getAll(){
        List<Education178> list=  repository.findAll();
        return list;
    }

    public Education178 findById(Long id){
        Education178 list=  repository.findById(id);
        return list;
    }


    public List<Education178> getByYear(String year){
        List<Education178> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Education178> getByCity(String city){
        List<Education178> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Education178 save(Education178 studentUni){

        return repository.add(studentUni);
    }

    public Education178 edit(Education178 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}