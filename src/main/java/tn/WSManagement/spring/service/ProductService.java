package tn.WSManagement.spring.service;

import tn.WSManagement.spring.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> retrieveAllProduits();
    Product addProduit(Product p, Long idRayon, Long idStock);
    Product retrieveProduit(Long id);
}
