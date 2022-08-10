package tn.WSManagement.spring.service;

import tn.WSManagement.spring.entity.ProductDetail;

import java.util.List;

public interface ProductDetailService {
    List<ProductDetail> retrieveAllDetailP();
    ProductDetail addDetailP(ProductDetail dp);
    ProductDetail retrieveDetailP(Long id);
}
