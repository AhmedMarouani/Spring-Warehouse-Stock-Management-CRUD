package tn.WSManagement.spring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.WSManagement.spring.entity.BillDetail;
import tn.WSManagement.spring.repository.BillDetailRepository;

import java.util.List;
@Service
@Slf4j
public class BillDetailServiceImpl implements BillDetailService {
    @Autowired
    private BillDetailRepository billDetailRepository;


    @Override
    public List<BillDetail> retrieveAllDetailFactures() {
        return billDetailRepository.findAll();
    }

    @Override
    public BillDetail addDetailFacture(BillDetail df) {
        return billDetailRepository.save(df);
    }


    @Override
    public BillDetail retreiveDetailFacture(Long id) {
        return billDetailRepository.findById(id).get();
    }
}
