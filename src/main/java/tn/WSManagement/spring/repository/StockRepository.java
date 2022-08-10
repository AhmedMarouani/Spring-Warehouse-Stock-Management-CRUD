package tn.WSManagement.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.WSManagement.spring.entity.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
}
