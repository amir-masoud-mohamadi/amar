package com.geofahm.shahrdari.model.service.education;


import com.geofahm.shahrdari.model.entity.education.Education;
import com.geofahm.shahrdari.model.entity.education.Education1710;
import com.geofahm.shahrdari.model.repository.education.Education1710Repository;
import com.geofahm.shahrdari.model.repository.education.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Education1710Service {
    private final Education1710Repository repository;

    @Autowired
    public Education1710Service(Education1710Repository repository) {
        this.repository = repository;
    }


    public List<Education1710> getAll(){
        List<Education1710> list=  repository.findAll();
        return list;
    }

    public Education1710 findById(Long id){
        Education1710 list=  repository.findById(id);
        return list;
    }


    public List<Education1710> getByYear(String year){
        List<Education1710> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<Education1710> getByCity(String city){
        List<Education1710> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public Education1710 save(Education1710 studentUni){

        return repository.add(studentUni);
    }

    public Education1710 edit(Education1710 studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}