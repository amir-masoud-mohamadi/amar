package com.geofahm.shahrdari.model.repository.naft;


import com.geofahm.shahrdari.model.entity.naft.Naft71;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class Naft71Repository {
    
    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public Naft71 add(Naft71 customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public Naft71 update(Naft71 customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        Naft71 cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public Naft71 findById(long customerId) {
        String sql = "select customer from Naft71 customer where customer.id="+customerId;
        try{
            return (Naft71) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<Naft71> findAll() {

        return entityManager.createQuery("select c from Naft71 as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from Naft71 as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Naft71> findByYear(String year) {

        return entityManager.createQuery("select s from Naft71 s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from Naft71 as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Naft71> findByCity(String city) {

        return entityManager.createQuery("select s from Naft71 s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
