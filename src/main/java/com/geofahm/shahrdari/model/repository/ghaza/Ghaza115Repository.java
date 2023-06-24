package com.geofahm.shahrdari.model.repository.ghaza;


import com.geofahm.shahrdari.model.entity.ghazaei.Ghaza115;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class Ghaza115Repository {

    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public Ghaza115 add(Ghaza115 customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public Ghaza115 update(Ghaza115 customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        Ghaza115 cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public Ghaza115 findById(long customerId) {
        String sql = "select customer from Ghaza115 customer where customer.id="+customerId;
        try{
            return (Ghaza115) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<Ghaza115> findAll() {

        return entityManager.createQuery("select c from Ghaza115 as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from Ghaza115 as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Ghaza115> findByYear(String year) {

        return entityManager.createQuery("select s from Ghaza115 s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from Ghaza115 as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Ghaza115> findByCity(String city) {

        return entityManager.createQuery("select s from Ghaza115 s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
