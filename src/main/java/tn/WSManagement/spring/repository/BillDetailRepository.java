package tn.WSManagement.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.WSManagement.spring.entity.BillDetail;

@Repository
public interface BillDetailRepository extends JpaRepository<BillDetail, Long> {

}
