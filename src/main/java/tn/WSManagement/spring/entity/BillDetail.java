package tn.WSManagement.spring.entity;

import lombok.*;

import javax.persistence.*;
import java.util.*;
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "T_DetailFacture")
public class BillDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long billDetailId;
    private int qte;
    private Float prixTotal;
    private Float montantRemise;
    private int pourcentageRemise;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "billDetail")
    private Set<Product> product;
    @ManyToOne
    Bill bill;
}
