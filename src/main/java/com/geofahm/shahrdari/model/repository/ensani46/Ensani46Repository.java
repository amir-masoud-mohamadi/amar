package com.geofahm.shahrdari.model.repository.ensani46;




import com.geofahm.shahrdari.model.entity.ensani.Ensani46;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class Ensani46Repository {
    
    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public Ensani46 add(Ensani46 customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public Ensani46 update(Ensani46 customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        Ensani46 cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public Ensani46 findById(long customerId) {
        String sql = "select customer from Ensani46 customer where customer.id="+customerId;
        try{
            return (Ensani46) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<Ensani46> findAll() {

        return entityManager.createQuery("select c from Ensani46 as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from Ensani46 as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Ensani46> findByYear(String year) {

        return entityManager.createQuery("select s from Ensani46 s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from Ensani46 as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Ensani46> findByCity(String city) {

        return entityManager.createQuery("select s from Ensani46 s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
