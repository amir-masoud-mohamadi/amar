package com.geofahm.shahrdari.model.repository.education;



import com.geofahm.shahrdari.model.entity.education.Education179;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class Education179Repository {
    
    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public Education179 add(Education179 customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public Education179 update(Education179 customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        Education179 cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public Education179 findById(long customerId) {
        String sql = "select customer from Education179 customer where customer.id="+customerId;
        try{
            return (Education179) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<Education179> findAll() {

        return entityManager.createQuery("select c from Education179 as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from Education179 as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Education179> findByYear(String year) {

        return entityManager.createQuery("select s from Education179 s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from Education179 as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Education179> findByCity(String city) {

        return entityManager.createQuery("select s from Education179 s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
