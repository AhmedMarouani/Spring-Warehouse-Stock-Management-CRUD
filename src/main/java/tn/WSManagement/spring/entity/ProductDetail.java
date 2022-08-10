package tn.WSManagement.spring.entity;

import lombok.*;
import tn.WSManagement.spring.enumeration.CategorieProduit;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "T_DetailProduit")
public class ProductDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productDetailId;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    private String dateDerniereModification;
    @Enumerated
    private CategorieProduit categorieProduit;
    @OneToOne(mappedBy = "productDetail")
    private Product product;

}
