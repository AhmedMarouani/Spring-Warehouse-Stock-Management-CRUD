package tn.WSManagement.spring.service;

import tn.WSManagement.spring.entity.BillDetail;

import java.util.List;

public interface BillDetailService {

    List<BillDetail> retrieveAllDetailFactures();
    BillDetail addDetailFacture(BillDetail dp);
    BillDetail retreiveDetailFacture(Long id);
}
