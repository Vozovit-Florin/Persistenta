package com.example.Assignment.Persistenta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AngajatDao {
    @PersistenceContext
    EntityManager entityManager;

    public List<Angajat>findAll(){
        Query query = entityManager.createNativeQuery("Select * from angajat", Angajat.class);
        return query.getResultList();
    }
    @Transactional
    public void  save(Angajat angajat){
        entityManager.persist(angajat);
    }
}
