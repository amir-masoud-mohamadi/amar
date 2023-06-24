package com.geofahm.shahrdari.model.repository.sanat;


import com.geofahm.shahrdari.model.entity.sanat.Sanat81;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class Sanat81Repository {
    
    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public Sanat81 add(Sanat81 customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public Sanat81 update(Sanat81 customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        Sanat81 cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public Sanat81 findById(long customerId) {
        String sql = "select customer from Sanat81 customer where customer.id="+customerId;
        try{
            return (Sanat81) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<Sanat81> findAll() {

        return entityManager.createQuery("select c from Sanat81 as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from Sanat81 as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Sanat81> findByYear(String year) {

        return entityManager.createQuery("select s from Sanat81 s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from Sanat81 as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Sanat81> findByCity(String city) {

        return entityManager.createQuery("select s from Sanat81 s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
