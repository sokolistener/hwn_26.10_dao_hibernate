package com.example.hwn_26_10_dao_hibernate.repository;

import com.example.hwn_26_10_dao_hibernate.entity.Person;
import org.springframework.stereotype.Repository;
import jakarta.persistence.*;


import java.util.List;

@Repository
public class HibernateRepository {

    @PersistenceContext
    private EntityManager entityManager;



    public List<Person> getPersonsByCity(String city) {
        return entityManager
                .createQuery("select p from Person p where p.cityOfLiving = :city", Person.class)
                .setParameter("city", city)
                .getResultList();
    }
}