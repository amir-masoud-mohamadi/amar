package com.geofahm.shahrdari.model.repository.education;


import com.geofahm.shahrdari.model.entity.education.Education;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class EducationRepository {
    
    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public Education add(Education customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public Education update(Education customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        Education cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public Education findById(long customerId) {
        String sql = "select customer from Education customer where customer.id="+customerId;
        try{
            return (Education) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<Education> findAll() {

        return entityManager.createQuery("select c from Education as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from Education as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Education> findByYear(String year) {

        return entityManager.createQuery("select s from Education s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from Education as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Education> findByCity(String city) {

        return entityManager.createQuery("select s from Education s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
