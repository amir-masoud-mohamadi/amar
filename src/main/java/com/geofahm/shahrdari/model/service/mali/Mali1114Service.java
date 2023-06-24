package com.geofahm.shahrdari.model.service.mali;


import com.geofahm.shahrdari.model.entity.bazarmali.Mali1114;

import com.geofahm.shahrdari.model.repository.bazarmali.Mali1114Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Mali1114Service {
    private final Mali1114Repository repository;

    @Autowired
    public Mali1114Service(Mali1114Repository repository) {
        this.repository = repository;
    }


    public List<Mali1114> getAll(){
        List<Mali1114> list=  repository.findAll();
        return list;
    }

    public Mali1114 findById(Long id){
        Mali1114 list=  repository.findById(id);
        return list;
    }


    public List<Mali1114> getByYear(String year){
        List<Mali1114> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Mali1114> getByCity(String city){
        List<Mali1114> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Mali1114 save(Mali1114 studentUni){

        return repository.add(studentUni);
    }

    public Mali1114 edit(Mali1114 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}