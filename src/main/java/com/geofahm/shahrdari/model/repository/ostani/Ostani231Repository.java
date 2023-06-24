package com.geofahm.shahrdari.model.repository.ostani;


import com.geofahm.shahrdari.model.entity.ostani.Ostani231;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class Ostani231Repository {
    
    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public Ostani231 add(Ostani231 customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public Ostani231 update(Ostani231 customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        Ostani231 cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public Ostani231 findById(long customerId) {
        String sql = "select customer from Ostani231 customer where customer.id="+customerId;
        try{
            return (Ostani231) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<Ostani231> findAll() {

        return entityManager.createQuery("select c from Ostani231 as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from Ostani231 as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Ostani231> findByYear(String year) {

        return entityManager.createQuery("select s from Ostani231 s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from Ostani231 as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Ostani231> findByCity(String city) {

        return entityManager.createQuery("select s from Ostani231 s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
