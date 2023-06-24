package com.geofahm.shahrdari.model.service.education;


import com.geofahm.shahrdari.model.entity.education.TrainedTechnicalAndProfessional;
import com.geofahm.shahrdari.model.repository.education.TrainedTechnicalAndProfessionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainedTechnicalAndProfessionalService {
    private final TrainedTechnicalAndProfessionalRepository repository;

    @Autowired
    public TrainedTechnicalAndProfessionalService(TrainedTechnicalAndProfessionalRepository repository) {
        this.repository = repository;
    }


    public List<TrainedTechnicalAndProfessional> getAll(){
        List<TrainedTechnicalAndProfessional> list=  repository.findAll();
        return list;
    }

    public TrainedTechnicalAndProfessional findById(Long id){
        TrainedTechnicalAndProfessional list=  repository.findById(id);
        return list;
    }


    public List<TrainedTechnicalAndProfessional> getByYear(String year){
        List<TrainedTechnicalAndProfessional> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<TrainedTechnicalAndProfessional> getByCity(String city){
        List<TrainedTechnicalAndProfessional> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public TrainedTechnicalAndProfessional save(TrainedTechnicalAndProfessional studentUni){

        return repository.add(studentUni);
    }

    public TrainedTechnicalAndProfessional edit(TrainedTechnicalAndProfessional studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}