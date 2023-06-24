package com.geofahm.shahrdari.model.service.ghaza;



import com.geofahm.shahrdari.model.entity.ghazaei.Ghaza115;

import com.geofahm.shahrdari.model.repository.ghaza.Ghaza115Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ghaza115Service {
    private final Ghaza115Repository repository;

    @Autowired
    public Ghaza115Service(Ghaza115Repository repository) {
        this.repository = repository;
    }


    public List<Ghaza115> getAll(){
        List<Ghaza115> list=  repository.findAll();
        return list;
    }

    public Ghaza115 findById(Long id){
        Ghaza115 list=  repository.findById(id);
        return list;
    }


    public List<Ghaza115> getByYear(String year){
        List<Ghaza115> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Ghaza115> getByCity(String city){
        List<Ghaza115> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Ghaza115 save(Ghaza115 studentUni){

        return repository.add(studentUni);
    }

    public Ghaza115 edit(Ghaza115 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }



    /*public List<Ghaza115> getByYear(Sort sort, String year){
        List<Ghaza115> list=  repository.findByYear(sort,year);
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