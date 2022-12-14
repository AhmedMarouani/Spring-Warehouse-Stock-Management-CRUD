package tn.WSManagement.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.WSManagement.spring.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
