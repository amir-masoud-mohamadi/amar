package com.geofahm.shahrdari.model.repository.Mohit;


import com.geofahm.shahrdari.model.entity.mohit.Mohit12;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class MohitRepository12  {

    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public Mohit12 add(Mohit12 customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public Mohit12 update(Mohit12 customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        Mohit12 cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public Mohit12 findById(long customerId) {
        String sql = "select customer from Mohit12 customer where customer.id="+customerId;
        try{
            return (Mohit12) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<Mohit12> findAll() {

        return entityManager.createQuery("select c from Mohit12 as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from Mohit12 as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Mohit12> findByYear(String year) {

        return entityManager.createQuery("select s from Mohit12 s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from Mohit12 as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Mohit12> findByCity(String city) {

        return entityManager.createQuery("select s from Mohit12 s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
