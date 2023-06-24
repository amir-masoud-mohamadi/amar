package com.geofahm.shahrdari.model.repository.hazine;




import com.geofahm.shahrdari.model.entity.hazineh.Daramad121;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class Daramad121Repository {
    
    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public Daramad121 add(Daramad121 customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public Daramad121 update(Daramad121 customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        Daramad121 cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public Daramad121 findById(long customerId) {
        String sql = "select customer from Daramad121 customer where customer.id="+customerId;
        try{
            return (Daramad121) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<Daramad121> findAll() {

        return entityManager.createQuery("select c from Daramad121 as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from Daramad121 as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Daramad121> findByYear(String year) {

        return entityManager.createQuery("select s from Daramad121 s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from Daramad121 as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Daramad121> findByCity(String city) {

        return entityManager.createQuery("select s from Daramad121 s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
