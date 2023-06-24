package com.geofahm.shahrdari.model.repository.madan;




import com.geofahm.shahrdari.model.entity.madan.Madan16;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class Madan16Repository {
    
    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public Madan16 add(Madan16 customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public Madan16 update(Madan16 customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        Madan16 cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public Madan16 findById(long customerId) {
        String sql = "select customer from Madan16 customer where customer.id="+customerId;
        try{
            return (Madan16) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<Madan16> findAll() {

        return entityManager.createQuery("select c from Madan16 as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from Madan16 as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Madan16> findByYear(String year) {

        return entityManager.createQuery("select s from Madan16 s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from Madan16 as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Madan16> findByCity(String city) {

        return entityManager.createQuery("select s from Madan16 s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
