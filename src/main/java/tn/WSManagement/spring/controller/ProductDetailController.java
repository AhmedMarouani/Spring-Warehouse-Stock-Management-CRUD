package tn.WSManagement.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.WSManagement.spring.entity.ProductDetail;
import tn.WSManagement.spring.service.ProductDetailServiceImpl;

import java.util.List;

@RestController
@RequestMapping(value = "/DetailProduit")
public class ProductDetailController {
    @Autowired
    ProductDetailServiceImpl detailProduitService;

    @GetMapping("/retrieveAllDetailP")
    @ResponseBody
    public List<ProductDetail> retrieveAllDetailP(){
        List<ProductDetail> productDetails = detailProduitService.retrieveAllDetailP();
        return productDetails;
    }

    @PostMapping("/addDetailP")
    @ResponseBody
    public ProductDetail addDetailP(ProductDetail productDetail){
        ProductDetail productDetailProduits = detailProduitService.addDetailP(productDetail);
        return productDetailProduits;
    }

    @GetMapping("/retreiveDetailP/{id-detailProduit}")
    @ResponseBody
    public ProductDetail retrieveDetailP(@PathVariable("id-detailProduit")Long idDetailProduit){
        ProductDetail productDetailProduits = detailProduitService.retrieveDetailP(idDetailProduit);
        return productDetailProduits;
    }


}
