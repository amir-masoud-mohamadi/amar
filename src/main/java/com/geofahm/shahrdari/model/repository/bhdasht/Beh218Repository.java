package com.geofahm.shahrdari.model.repository.bhdasht;



import com.geofahm.shahrdari.model.entity.behdasht.Beh218;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class Beh218Repository {
    
    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public Beh218 add(Beh218 customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public Beh218 update(Beh218 customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        Beh218 cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public Beh218 findById(long customerId) {
        String sql = "select customer from Beh218 customer where customer.id="+customerId;
        try{
            return (Beh218) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<Beh218> findAll() {

        return entityManager.createQuery("select c from Beh218 as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from Beh218 as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Beh218> findByYear(String year) {

        return entityManager.createQuery("select s from Beh218 s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from Beh218 as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Beh218> findByCity(String city) {

        return entityManager.createQuery("select s from Beh218 s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
