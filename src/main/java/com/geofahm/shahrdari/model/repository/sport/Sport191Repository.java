package com.geofahm.shahrdari.model.repository.sport;


import com.geofahm.shahrdari.model.entity.sport.Sport191;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class Sport191Repository {
    
    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public Sport191 add(Sport191 customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public Sport191 update(Sport191 customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        Sport191 cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public Sport191 findById(long customerId) {
        String sql = "select customer from Sport191 customer where customer.id="+customerId;
        try{
            return (Sport191) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<Sport191> findAll() {

        return entityManager.createQuery("select c from Sport191 as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from Sport191 as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Sport191> findByYear(String year) {

        return entityManager.createQuery("select s from Sport191 s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from Sport191 as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Sport191> findByCity(String city) {

        return entityManager.createQuery("select s from Sport191 s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
