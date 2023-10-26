package com.example.hwn_26_10_dao_hibernate.controller;

import com.example.hwn_26_10_dao_hibernate.entity.Person;
import com.example.hwn_26_10_dao_hibernate.service.HibernateService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class HibernateController {

    final
    HibernateService hibernateService;

    public HibernateController(HibernateService hibernateService) {
        this.hibernateService = hibernateService;
    }

    @RequestMapping("/persons/by-city")
    public List<Person> getPersonsByCity(String city) {
        return hibernateService.getPersonsByCity(city);
    }
}