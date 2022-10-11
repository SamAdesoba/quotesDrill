package com.grouptwo.quotesdrill.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User {
    @Id
    private long id;

    private String firstName;
    private String lastName;
    private String email;

}
