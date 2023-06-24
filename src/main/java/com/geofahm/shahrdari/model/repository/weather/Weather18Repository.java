package com.geofahm.shahrdari.model.repository.weather;




import com.geofahm.shahrdari.model.entity.weather.Weather18;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class Weather18Repository {
    
    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public Weather18 add(Weather18 customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public Weather18 update(Weather18 customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        Weather18 cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public Weather18 findById(long customerId) {
        String sql = "select customer from Weather18 customer where customer.id="+customerId;
        try{
            return (Weather18) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<Weather18> findAll() {

        return entityManager.createQuery("select c from Weather18 as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from Weather18 as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Weather18> findByYear(String year) {

        return entityManager.createQuery("select s from Weather18 s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from Weather18 as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Weather18> findByCity(String city) {

        return entityManager.createQuery("select s from Weather18 s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
