package tn.WSManagement.spring.entity;



import lombok.*;

import javax.persistence.*;
import java.util.Set;
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "T_Stock")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stockId;
    @Column
    private int qte;
    @Column
    private int qteMin;
    @Column
    private String libelleStock;
    @OneToMany( cascade = CascadeType.ALL, mappedBy = "stock")
    private Set<Product> product;


}
