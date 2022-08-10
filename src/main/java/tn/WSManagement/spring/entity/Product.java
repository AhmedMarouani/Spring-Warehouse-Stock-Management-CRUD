package tn.WSManagement.spring.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "T_Produit")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String code;
    private String libelle;
    private Float prixUnitaire;
    @OneToOne//bidirectionelle
    private ProductDetail productDetail;
    @ManyToOne//bidirectionelle
    Stock stock;//plusieur produit peut acceder a 1 stocks ou 1 stock peut avoir plusieur produits
    @ManyToMany(cascade = CascadeType.ALL)//unidirectionnelle
    private Set<Supplier> supplier;//plusieur produit peut voir plusieur fournisseur mais
    // les fournisseur ne peut pas voir a quel produit ils sont associers
    @ManyToOne//bidirectionnelle
            Aisle aisle;
    @ManyToOne//bidirectionnelle
    BillDetail billDetail;

}
