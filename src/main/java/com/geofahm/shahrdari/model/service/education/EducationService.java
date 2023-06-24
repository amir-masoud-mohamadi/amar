package com.geofahm.shahrdari.model.service.education;


import com.geofahm.shahrdari.model.entity.education.Education;

import com.geofahm.shahrdari.model.repository.education.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService {
    private final EducationRepository repository;

    @Autowired
    public EducationService(EducationRepository repository) {
        this.repository = repository;
    }


    public List<Education> getAll(){
        List<Education> list=  repository.findAll();
        return list;
    }

    public Education findById(Long id){
        Education list=  repository.findById(id);
        return list;
    }


    public List<Education> getByYear(String year){
        List<Education> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Education> getByCity(String city){
        List<Education> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Education save(Education studentUni){

        return repository.add(studentUni);
    }

    public Education edit(Education studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }



    /*public List<Education> getByYear(Sort sort, String year){
        List<Education> list=  repository.findByYear(sort,year);
        return list;
    }

    public List<Object> getYear(Sort sort){
        List<Object> list=  repository.findYear(sort);
        return list;
    }


    public List<Education17_7> getByCity(Sort sort,String city){
        List<Education17_7> list=  repository.findByCity(sort,city);
        return list;
    }

    public List<Object> getCity(Sort sort){
        List<Object> list=  repository.findCity(sort);
        return list;
    }*/

}