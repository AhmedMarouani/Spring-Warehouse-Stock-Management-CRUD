package tn.WSManagement.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.WSManagement.spring.entity.ProductDetail;

public interface ProductDetailRepository extends JpaRepository<ProductDetail, Long> {
}
