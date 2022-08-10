package tn.WSManagement.spring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.WSManagement.spring.entity.ProductDetail;
import tn.WSManagement.spring.repository.ProductDetailRepository;

import java.util.List;
@Service
@Slf4j
public class ProductDetailServiceImpl implements ProductDetailService {
    @Autowired
    private ProductDetailRepository productDetailRepository;


    @Override
    public List<ProductDetail> retrieveAllDetailP() {
        return productDetailRepository.findAll();
    }

    @Override
    public ProductDetail addDetailP(ProductDetail df) {
        return productDetailRepository.save(df);
    }


    @Override
    public ProductDetail retrieveDetailP(Long id) {
        return productDetailRepository.findById(id).get();
    }
}
