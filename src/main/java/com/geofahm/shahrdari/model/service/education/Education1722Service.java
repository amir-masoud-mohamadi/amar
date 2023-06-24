package com.geofahm.shahrdari.model.service.education;


import com.geofahm.shahrdari.model.entity.education.Education1722;
import com.geofahm.shahrdari.model.repository.education.Education1722Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Education1722Service {
    private final Education1722Repository repository;

    @Autowired
    public Education1722Service(Education1722Repository repository) {
        this.repository = repository;
    }


    public List<Education1722> getAll(){
        List<Education1722> list=  repository.findAll();
        return list;
    }

    public Education1722 findById(Long id){
        Education1722 list=  repository.findById(id);
        return list;
    }


    public List<Education1722> getByYear(String year){
        List<Education1722> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Education1722> getByCity(String city){
        List<Education1722> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Education1722 save(Education1722 studentUni){

        return repository.add(studentUni);
    }

    public Education1722 edit(Education1722 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}