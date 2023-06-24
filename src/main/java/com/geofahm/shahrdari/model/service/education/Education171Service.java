package com.geofahm.shahrdari.model.service.education;


import com.geofahm.shahrdari.model.entity.education.Education171;
import com.geofahm.shahrdari.model.repository.education.Education171Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Education171Service {
    private final Education171Repository repository;

    @Autowired
    public Education171Service(Education171Repository repository) {
        this.repository = repository;
    }


    public List<Education171> getAll(){
        List<Education171> list=  repository.findAll();
        return list;
    }

    public Education171 findById(Long id){
        Education171 list=  repository.findById(id);
        return list;
    }


    public List<Education171> getByYear(String year){
        List<Education171> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Education171> getByCity(String city){
        List<Education171> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Education171 save(Education171 studentUni){

        return repository.add(studentUni);
    }

    public Education171 edit(Education171 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}