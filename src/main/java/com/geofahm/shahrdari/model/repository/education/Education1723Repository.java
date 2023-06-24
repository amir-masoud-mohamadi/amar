package com.geofahm.shahrdari.model.repository.education;



import com.geofahm.shahrdari.model.entity.education.Education1723;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class Education1723Repository {
    
    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public Education1723 add(Education1723 customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public Education1723 update(Education1723 customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        Education1723 cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public Education1723 findById(long customerId) {
        String sql = "select customer from Education1723 customer where customer.id="+customerId;
        try{
            return (Education1723) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<Education1723> findAll() {

        return entityManager.createQuery("select c from Education1723 as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from Education1723 as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Education1723> findByYear(String year) {

        return entityManager.createQuery("select s from Education1723 s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from Education1723 as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Education1723> findByCity(String city) {

        return entityManager.createQuery("select s from Education1723 s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
