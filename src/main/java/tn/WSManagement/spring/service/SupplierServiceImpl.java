package tn.WSManagement.spring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.WSManagement.spring.entity.Supplier;
import tn.WSManagement.spring.repository.SupplierRepository;
import java.util.List;

@Service
@Slf4j
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;


    @Override
    public List<Supplier> retrieveAllFournisseur() {
        return supplierRepository.findAll();
    }

    @Override
    public Supplier addFournisseur(Supplier f) {
        return supplierRepository.save(f);
    }

    @Override
    public Supplier retrieveFournisseur(Long id) {
        return supplierRepository.findById(id).get();
    }

}
