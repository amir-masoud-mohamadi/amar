package com.geofahm.shahrdari.model.repository.tamin;




import com.geofahm.shahrdari.model.entity.tamin.Tamin161;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class Tamin161Repository {
    
    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public Tamin161 add(Tamin161 customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public Tamin161 update(Tamin161 customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        Tamin161 cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public Tamin161 findById(long customerId) {
        String sql = "select customer from Tamin161 customer where customer.id="+customerId;
        try{
            return (Tamin161) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<Tamin161> findAll() {

        return entityManager.createQuery("select c from Tamin161 as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from Tamin161 as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Tamin161> findByYear(String year) {

        return entityManager.createQuery("select s from Tamin161 s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from Tamin161 as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Tamin161> findByCity(String city) {

        return entityManager.createQuery("select s from Tamin161 s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
