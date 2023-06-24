package com.geofahm.shahrdari.model.repository.education;



import com.geofahm.shahrdari.model.entity.education.Education1730;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class Education1730Repository {
    
    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public Education1730 add(Education1730 customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public Education1730 update(Education1730 customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        Education1730 cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public Education1730 findById(long customerId) {
        String sql = "select customer from Education1730 customer where customer.id="+customerId;
        try{
            return (Education1730) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<Education1730> findAll() {

        return entityManager.createQuery("select c from Education1730 as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from Education1730 as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Education1730> findByYear(String year) {

        return entityManager.createQuery("select s from Education1730 s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from Education1730 as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Education1730> findByCity(String city) {

        return entityManager.createQuery("select s from Education1730 s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
