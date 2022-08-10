package tn.WSManagement.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.WSManagement.spring.entity.Bill;
import tn.WSManagement.spring.service.BillServiceImpl;

import java.util.List;

@RestController
@RequestMapping(value = "/Facture")
public class FactureController {
    @Autowired
    BillServiceImpl factureService;

    @GetMapping("/retrieveAllDetailP")
    @ResponseBody
    public List<Bill> retrieveAllFactures(){
        List<Bill> bills = factureService.retrieveAllFactures();
        return bills;
    }

    @DeleteMapping("/cancelFacture/{idFacture}")
    @ResponseBody
    public void cancelFacture(@PathVariable("idFacture") Long idFacture) {

        factureService.cancelFacture(idFacture);
    }

    @GetMapping("/retrieveFacture")
    @ResponseBody
    public Bill retrieveFacture(Long id){
        Bill bill = factureService.retrieveFacture(id);
        return bill;
    }


}
