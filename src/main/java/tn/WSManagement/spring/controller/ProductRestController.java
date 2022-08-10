package tn.WSManagement.spring.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.WSManagement.spring.entity.Product;
import tn.WSManagement.spring.service.ProductServiceImpl;

import java.util.List;


@RestController
@RequestMapping("/produit")
public class ProductRestController {
    @Autowired
    ProductServiceImpl produitService;

    @GetMapping(value = "/retrieveAllProduits")
    @ResponseBody
    public List<Product> retrieveAllProduits(){
        List<Product> listproduit = produitService.retrieveAllProduits();
        return listproduit;
    }

    @PostMapping(value = "/saveproduit")
    @ResponseBody
    public Product addProduit(@RequestBody Product p, Long IdRayon, Long IdStock){
        Product product = produitService.addProduit(p,IdRayon, IdStock );
        return product;
    }

    @GetMapping(value = "/retrieveProduit/{produit-id}")
    @ResponseBody
    public Product retrieveProduit(@PathVariable("produit-id") Long idProduit){
        Product product = produitService.retrieveProduit(idProduit);
        return product;
    }


    @PutMapping(value = "assignFournisseurToProduit/{idProduit}/{idFournisseur}")
    public void affecterFournisseurToProduit(@PathVariable("idProduit")Long idProduit, @PathVariable("idFournisseur")Long idFournisseur) {
        produitService.assignFournisseurToProduit(idProduit, idFournisseur);
    }
}
