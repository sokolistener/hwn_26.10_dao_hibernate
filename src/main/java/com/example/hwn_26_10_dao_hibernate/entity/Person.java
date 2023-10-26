package com.example.hwn_26_10_dao_hibernate.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "persons", schema = "public")
@NoArgsConstructor
@Getter
@Setter
public class Person {

    @EmbeddedId
    private PersonId personalData;
    private String phoneNumber;
    private String cityOfLiving;
}