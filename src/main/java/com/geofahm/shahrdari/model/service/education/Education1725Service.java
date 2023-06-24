package com.geofahm.shahrdari.model.service.education;


import com.geofahm.shahrdari.model.entity.education.Education1725;
import com.geofahm.shahrdari.model.repository.education.Education1725Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Education1725Service {
    private final Education1725Repository repository;

    @Autowired
    public Education1725Service(Education1725Repository repository) {
        this.repository = repository;
    }


    public List<Education1725> getAll(){
        List<Education1725> list=  repository.findAll();
        return list;
    }

    public Education1725 findById(Long id){
        Education1725 list=  repository.findById(id);
        return list;
    }


    public List<Education1725> getByYear(String year){
        List<Education1725> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Education1725> getByCity(String city){
        List<Education1725> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Education1725 save(Education1725 studentUni){

        return repository.add(studentUni);
    }

    public Education1725 edit(Education1725 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}