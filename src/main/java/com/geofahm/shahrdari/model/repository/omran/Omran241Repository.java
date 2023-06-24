package com.geofahm.shahrdari.model.repository.omran;


import com.geofahm.shahrdari.model.entity.omran.Omran241;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class Omran241Repository {
    
    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public Omran241 add(Omran241 customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public Omran241 update(Omran241 customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        Omran241 cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public Omran241 findById(long customerId) {
        String sql = "select customer from Omran241 customer where customer.id="+customerId;
        try{
            return (Omran241) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<Omran241> findAll() {

        return entityManager.createQuery("select c from Omran241 as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from Omran241 as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Omran241> findByYear(String year) {

        return entityManager.createQuery("select s from Omran241 s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from Omran241 as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Omran241> findByCity(String city) {

        return entityManager.createQuery("select s from Omran241 s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
