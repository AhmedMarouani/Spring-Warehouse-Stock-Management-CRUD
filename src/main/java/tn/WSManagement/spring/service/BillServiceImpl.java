package tn.WSManagement.spring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.WSManagement.spring.repository.FactureRepository;
import tn.WSManagement.spring.entity.Bill;

import java.util.List;

@Service
@Slf4j
public class BillServiceImpl implements BillService {
    @Autowired
    private FactureRepository factureRepository;

    @Override
    public List<Bill> retrieveAllFactures() {
        return factureRepository.findAll();
    }

    @Override
    public void cancelFacture(Long id ) {
        Bill factureactiveF = new Bill();
        factureactiveF.setActive(Boolean.FALSE);
        factureRepository.deleteById(id);
    }

    @Override
    public Bill retrieveFacture(Long id) {
        return factureRepository.findById(id).get();
    }
}
