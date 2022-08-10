package tn.WSManagement.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.WSManagement.spring.entity.Supplier;
import tn.WSManagement.spring.service.SupplierServiceImpl;

import java.util.List;

@RestController
@RequestMapping(value = "/Fournisseur")
public class SupplierController {
    @Autowired
    SupplierServiceImpl fournisseurService;

    @GetMapping("/retrieveAllFournisseur")
    @ResponseBody
    public List<Supplier> retrieveAllDetailP(){
        List<Supplier> suppliers = fournisseurService.retrieveAllFournisseur();
        return suppliers;
    }

    @PostMapping("/addFournisseur")
    @ResponseBody
    public Supplier addDetailP(Supplier detailProduit){
        Supplier supplier = fournisseurService.addFournisseur(detailProduit);
        return supplier;
    }

    @GetMapping("/retreiveFournisseur")
    @ResponseBody
    public Supplier retrieveDetailP(Long id){
        Supplier supplier = fournisseurService.retrieveFournisseur(id);
        return supplier;
    }


}
