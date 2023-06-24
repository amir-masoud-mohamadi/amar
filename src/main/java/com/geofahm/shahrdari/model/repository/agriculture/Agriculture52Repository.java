package com.geofahm.shahrdari.model.repository.agriculture;



import com.geofahm.shahrdari.model.entity.farm.Agriculture52;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class Agriculture52Repository {
    
    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public Agriculture52 add(Agriculture52 customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public Agriculture52 update(Agriculture52 customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        Agriculture52 cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public Agriculture52 findById(long customerId) {
        String sql = "select customer from Agriculture52 customer where customer.id="+customerId;
        try{
            return (Agriculture52) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<Agriculture52> findAll() {

        return entityManager.createQuery("select c from Agriculture52 as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from Agriculture52 as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Agriculture52> findByYear(String year) {

        return entityManager.createQuery("select s from Agriculture52 s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from Agriculture52 as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Agriculture52> findByCity(String city) {

        return entityManager.createQuery("select s from Agriculture52 s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
