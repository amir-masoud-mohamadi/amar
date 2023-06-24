package com.geofahm.shahrdari.model.repository.education;



import com.geofahm.shahrdari.model.entity.education.Education177;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class Education177Repository {
    
    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public Education177 add(Education177 customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public Education177 update(Education177 customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        Education177 cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public Education177 findById(long customerId) {
        String sql = "select customer from Education177 customer where customer.id="+customerId;
        try{
            return (Education177) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<Education177> findAll() {

        return entityManager.createQuery("select c from Education177 as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from Education177 as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Education177> findByYear(String year) {

        return entityManager.createQuery("select s from Education177 s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.academicPeriod from Education177 as s order by s.academicPeriod desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Education177> findByCity(String city) {

        return entityManager.createQuery("select s from Education177 s where s.academicPeriod= '"+city+"' order by s.id").getResultList();
    }
}
