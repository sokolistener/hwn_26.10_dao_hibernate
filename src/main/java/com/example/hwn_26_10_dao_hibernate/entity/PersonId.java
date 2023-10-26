package com.example.hwn_26_10_dao_hibernate.entity;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class PersonId implements Serializable {

    private String name;
    private String surname;
    private Integer age;
}
