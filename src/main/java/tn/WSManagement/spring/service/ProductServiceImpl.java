package tn.WSManagement.spring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.WSManagement.spring.entity.Supplier;
import tn.WSManagement.spring.entity.Product;
import tn.WSManagement.spring.repository.SupplierRepository;
import tn.WSManagement.spring.repository.ProductRepository;

import java.util.List;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private SupplierRepository supplierRepository;


    @Override
    public List<Product> retrieveAllProduits() {
        return productRepository.findAll();
    }

    @Override
    public Product addProduit(Product p, Long idRayon, Long idStock) {
        return productRepository.save(p);
    }

    @Override
    public Product retrieveProduit(Long id) {
        return productRepository.findById(id).get();
    }

    //Liaison des deux tables fournisseur et produit
    //avec manytomany on a ajouter une ligne dans produit qui contien fournisseur mais on n'a pas fais la liaison

    public void assignFournisseurToProduit(Long idProduit, Long idFournisseur){
        Product productEntity = productRepository.findById(idProduit).get();
        Supplier supplierEntity = supplierRepository.findById(idFournisseur).get();
        productEntity.getSupplier().add(supplierEntity);
        supplierRepository.save(supplierEntity);

    }
}
