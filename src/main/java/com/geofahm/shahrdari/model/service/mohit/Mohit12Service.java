package com.geofahm.shahrdari.model.service.mohit;


import com.geofahm.shahrdari.model.entity.mohit.Mohit12;
import com.geofahm.shahrdari.model.repository.Mohit.MohitRepository12;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Mohit12Service {
    private final MohitRepository12 repository;

    @Autowired
    public Mohit12Service(MohitRepository12 repository) {
        this.repository = repository;
    }


    public List<Mohit12> getAll(){
        List<Mohit12> list=  repository.findAll();
        return list;
    }

    public Mohit12 findById(Long id){
        Mohit12 list=  repository.findById(id);
        return list;
    }


    public List<Mohit12> getByYear(String year){
        List<Mohit12> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Mohit12> getByCity(String city){
        List<Mohit12> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Mohit12 save(Mohit12 studentUni){

        return repository.add(studentUni);
    }

    public Mohit12 edit(Mohit12 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }



    /*public List<Mohit12> getByYear(Sort sort, String year){
        List<Mohit12> list=  repository.findByYear(sort,year);
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