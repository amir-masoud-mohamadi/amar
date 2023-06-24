package com.geofahm.shahrdari.model.service.population;

import com.geofahm.shahrdari.model.entity.population.AveragePopulation;

import com.geofahm.shahrdari.model.repository.population.AveragePopulationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AveragePopulationService {
    private final AveragePopulationRepository repository;

    @Autowired
    public AveragePopulationService(AveragePopulationRepository repository) {
        this.repository = repository;
    }


    public List<AveragePopulation> getAll(){
        List<AveragePopulation> list=  repository.findAll();
        return list;
    }

    public AveragePopulation findById(Long id){
        AveragePopulation list=  repository.findById(id);
        return list;
    }


    public List<AveragePopulation> getByYear(String year){
        List<AveragePopulation> list=  repository.findByYear(year);
        return list;
    }

    public List<Object> getYear(){
        List<Object> list=  repository.findYear();
        return list;
    }


    public List<AveragePopulation> getByCity(String city){
        List<AveragePopulation> list=  repository.findByCity(city);
        return list;
    }

    public List<Object> getCity(){
        List<Object> list=  repository.findCity();
        return list;
    }
    public AveragePopulation save(AveragePopulation studentUni){

        return repository.add(studentUni);
    }

    public AveragePopulation edit(AveragePopulation studentUni){

        return repository.update(studentUni);
    }

    public void delete(Long id){

        repository.delete(id);
    }





}