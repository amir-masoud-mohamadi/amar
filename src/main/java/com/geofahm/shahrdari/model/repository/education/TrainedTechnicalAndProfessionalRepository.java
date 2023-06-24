package com.geofahm.shahrdari.model.repository.education;



import com.geofahm.shahrdari.model.entity.education.TrainedTechnicalAndProfessional;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class TrainedTechnicalAndProfessionalRepository {
    
    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public TrainedTechnicalAndProfessional add(TrainedTechnicalAndProfessional customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public TrainedTechnicalAndProfessional update(TrainedTechnicalAndProfessional customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        TrainedTechnicalAndProfessional cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public TrainedTechnicalAndProfessional findById(long customerId) {
        String sql = "select customer from TrainedTechnicalAndProfessional customer where customer.id="+customerId;
        try{
            return (TrainedTechnicalAndProfessional) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<TrainedTechnicalAndProfessional> findAll() {

        return entityManager.createQuery("select c from TrainedTechnicalAndProfessional as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from TrainedTechnicalAndProfessional as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<TrainedTechnicalAndProfessional> findByYear(String year) {

        return entityManager.createQuery("select s from TrainedTechnicalAndProfessional s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from TrainedTechnicalAndProfessional as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<TrainedTechnicalAndProfessional> findByCity(String city) {

        return entityManager.createQuery("select s from TrainedTechnicalAndProfessional s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
