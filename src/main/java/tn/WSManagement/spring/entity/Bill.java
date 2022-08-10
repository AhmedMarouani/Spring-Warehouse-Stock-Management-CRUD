package tn.WSManagement.spring.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "T_Facture")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long billId;
    @Temporal(TemporalType.DATE)
    private Date dateFacture;
    private Float montantFacture;
    private Float montantRemise;
    private Boolean active;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bill")
    private Set<BillDetail> billDetail;
    @ManyToOne(cascade = CascadeType.ALL)
    Client client;

}
