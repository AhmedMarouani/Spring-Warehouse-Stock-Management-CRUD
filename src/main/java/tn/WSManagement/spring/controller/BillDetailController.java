package tn.WSManagement.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.WSManagement.spring.entity.BillDetail;
import tn.WSManagement.spring.service.BillDetailServiceImpl;

import java.util.List;

@RestController
@RequestMapping(value = "/Facture")
public class BillDetailController {
    @Autowired
    BillDetailServiceImpl detailFactureService;

    @GetMapping("/retrieveAllDetailFacture")
    @ResponseBody
    public List<BillDetail> retrieveAllDetailFactures() {
        List<BillDetail> billDetails = detailFactureService.retrieveAllDetailFactures();
        return billDetails;
    }

    @PostMapping("/addDetailFacture")
    @ResponseBody
    public BillDetail addDetailFacture(BillDetail billDetail) {
        BillDetail df = detailFactureService.addDetailFacture(billDetail);
        return df;
    }

    @GetMapping("/retreiveDetailP/{id-detailFacture}")
    @ResponseBody
    public BillDetail retrieveDetailP(@PathVariable("id-detailFacture") Long idDetailFacture) {
        BillDetail detailfacture = detailFactureService.retreiveDetailFacture(idDetailFacture);
        return detailfacture;
    }
}
