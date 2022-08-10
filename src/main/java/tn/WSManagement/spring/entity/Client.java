package tn.WSManagement.spring.entity;

import lombok.*;
import tn.WSManagement.spring.enumeration.CategorieClient;
import tn.WSManagement.spring.enumeration.Profession;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "T_Client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;
    private String nom;
    private String prenom;
    private int age;
    private String email;
    private String password;
    @Enumerated
    private Profession profession;
    @Enumerated
    private CategorieClient categorieclient;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "client")
    private List<Bill> bill = new ArrayList<>();//whenever we add fetch, we need to instanciate a list


}
