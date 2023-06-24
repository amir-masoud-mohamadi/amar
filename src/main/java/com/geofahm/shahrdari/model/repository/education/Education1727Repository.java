package com.geofahm.shahrdari.model.repository.education;



import com.geofahm.shahrdari.model.entity.education.Education1727;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class Education1727Repository {
    
    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public Education1727 add(Education1727 customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public Education1727 update(Education1727 customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        Education1727 cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public Education1727 findById(long customerId) {
        String sql = "select customer from Education1727 customer where customer.id="+customerId;
        try{
            return (Education1727) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<Education1727> findAll() {

        return entityManager.createQuery("select c from Education1727 as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from Education1727 as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Education1727> findByYear(String year) {

        return entityManager.createQuery("select s from Education1727 s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from Education1727 as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Education1727> findByCity(String city) {

        return entityManager.createQuery("select s from Education1727 s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
