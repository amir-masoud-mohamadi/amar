package com.geofahm.shahrdari.model.service.agriculture;




import com.geofahm.shahrdari.model.entity.farm.Agriculture52;
import com.geofahm.shahrdari.model.repository.agriculture.Agriculture52Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Agriculture52Service {
    private final Agriculture52Repository repository;

    @Autowired
    public Agriculture52Service(Agriculture52Repository repository) {
        this.repository = repository;
    }


    public List<Agriculture52> getAll(){
        List<Agriculture52> list=  repository.findAll();
        return list;
    }

    public Agriculture52 findById(Long id){
        Agriculture52 list=  repository.findById(id);
        return list;
    }


    public List<Agriculture52> getByYear(String year){
        List<Agriculture52> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Agriculture52> getByCity(String city){
        List<Agriculture52> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Agriculture52 save(Agriculture52 studentUni){

        return repository.add(studentUni);
    }

    public Agriculture52 edit(Agriculture52 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}