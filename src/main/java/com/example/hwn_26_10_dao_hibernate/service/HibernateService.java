package com.example.hwn_26_10_dao_hibernate.service;

import com.example.hwn_26_10_dao_hibernate.entity.Person;
import com.example.hwn_26_10_dao_hibernate.repository.HibernateRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class HibernateService {

    final
    HibernateRepository hibernateRepository;

    public HibernateService(HibernateRepository hibernateRepository) {
        this.hibernateRepository = hibernateRepository;
    }

    public List<Person> getPersonsByCity(String city) {
        return hibernateRepository.getPersonsByCity(city);
    }
}