package com.geofahm.shahrdari.model.service.education;


import com.geofahm.shahrdari.model.entity.education.Education1712;
import com.geofahm.shahrdari.model.repository.education.Education1712Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Education1712Service {
    private final Education1712Repository repository;

    @Autowired
    public Education1712Service(Education1712Repository repository) {
        this.repository = repository;
    }


    public List<Education1712> getAll(){
        List<Education1712> list=  repository.findAll();
        return list;
    }

    public Education1712 findById(Long id){
        Education1712 list=  repository.findById(id);
        return list;
    }


    public List<Education1712> getByYear(String year){
        List<Education1712> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Education1712> getByCity(String city){
        List<Education1712> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Education1712 save(Education1712 studentUni){

        return repository.add(studentUni);
    }

    public Education1712 edit(Education1712 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}