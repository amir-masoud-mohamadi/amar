package com.geofahm.shahrdari.model.repository.population;


import com.geofahm.shahrdari.model.entity.population.AveragePopulation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class AveragePopulationRepository {
    
    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public AveragePopulation add(AveragePopulation customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public AveragePopulation update(AveragePopulation customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        AveragePopulation cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public AveragePopulation findById(long customerId) {
        String sql = "select customer from AveragePopulation customer where customer.id="+customerId;
        try{
            return (AveragePopulation) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<AveragePopulation> findAll() {

        return entityManager.createQuery("select c from AveragePopulation as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from AveragePopulation as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<AveragePopulation> findByYear(String year) {

        return entityManager.createQuery("select s from AveragePopulation s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from AveragePopulation as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<AveragePopulation> findByCity(String city) {

        return entityManager.createQuery("select s from AveragePopulation s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
