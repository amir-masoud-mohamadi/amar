package com.geofahm.shahrdari.model.repository.ertebat;


import com.geofahm.shahrdari.model.entity.ertebatat.Ertebat113;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class Ertebat113Repository {

    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public Ertebat113 add(Ertebat113 customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public Ertebat113 update(Ertebat113 customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        Ertebat113 cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public Ertebat113 findById(long customerId) {
        String sql = "select customer from Ertebat113 customer where customer.id="+customerId;
        try{
            return (Ertebat113) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<Ertebat113> findAll() {

        return entityManager.createQuery("select c from Ertebat113 as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from Ertebat113 as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Ertebat113> findByYear(String year) {

        return entityManager.createQuery("select s from Ertebat113 s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from Ertebat113 as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Ertebat113> findByCity(String city) {

        return entityManager.createQuery("select s from Ertebat113 s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
