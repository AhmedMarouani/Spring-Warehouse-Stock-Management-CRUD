package tn.WSManagement.spring.service;

import tn.WSManagement.spring.entity.Supplier;

import java.util.List;

public interface SupplierService {

    List<Supplier> retrieveAllFournisseur();
    Supplier addFournisseur(Supplier f);
    Supplier retrieveFournisseur(Long id);
}
