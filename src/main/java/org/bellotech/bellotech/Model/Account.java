
package org.bellotech.bellotech.Model;

import java.util.List;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String email;

    private String password;

    private String firstName;

     private String lastName;
     
     private String roles;

    @OneToMany(mappedBy = "account")
    List<Post> posts;

}