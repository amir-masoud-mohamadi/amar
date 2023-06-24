package com.geofahm.shahrdari.model.repository.weather;




import com.geofahm.shahrdari.model.entity.weather.Weather13;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class Weather13Repository {
    
    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public Weather13 add(Weather13 customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public Weather13 update(Weather13 customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        Weather13 cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public Weather13 findById(long customerId) {
        String sql = "select customer from Weather13 customer where customer.id="+customerId;
        try{
            return (Weather13) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<Weather13> findAll() {

        return entityManager.createQuery("select c from Weather13 as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from Weather13 as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Weather13> findByYear(String year) {

        return entityManager.createQuery("select s from Weather13 s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from Weather13 as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Weather13> findByCity(String city) {

        return entityManager.createQuery("select s from Weather13 s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
