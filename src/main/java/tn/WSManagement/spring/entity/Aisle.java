package tn.WSManagement.spring.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Set;
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "T_Rayon")
public class Aisle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aisleId;
    private String libelle;
    private String code;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aisle")//bidirectionnelle
    private Set<Product> product;

}
