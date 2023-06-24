package com.geofahm.shahrdari.model.repository.building;



import com.geofahm.shahrdari.model.entity.building.Building101;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class Building101Repository {
    
    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public Building101 add(Building101 customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public Building101 update(Building101 customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        Building101 cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public Building101 findById(long customerId) {
        String sql = "select customer from Building101 customer where customer.id="+customerId;
        try{
            return (Building101) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<Building101> findAll() {

        return entityManager.createQuery("select c from Building101 as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from Building101 as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Building101> findByYear(String year) {

        return entityManager.createQuery("select s from Building101 s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from Building101 as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Building101> findByCity(String city) {

        return entityManager.createQuery("select s from Building101 s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
