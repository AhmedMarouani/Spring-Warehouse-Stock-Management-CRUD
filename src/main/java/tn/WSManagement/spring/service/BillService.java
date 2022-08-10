package tn.WSManagement.spring.service;

import tn.WSManagement.spring.entity.Bill;

import java.util.List;

public interface BillService {

    List<Bill> retrieveAllFactures();
    void cancelFacture(Long id);
    Bill retrieveFacture(Long id);
}
