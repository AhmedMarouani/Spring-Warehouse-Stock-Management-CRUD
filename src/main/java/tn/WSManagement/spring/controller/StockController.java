package tn.WSManagement.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.WSManagement.spring.entity.Stock;
import tn.WSManagement.spring.service.StockServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/Stock")
public class StockController {
    @Autowired
    StockServiceImpl stockService;

    @GetMapping("/retrieveAllStocks")
    @ResponseBody
    public List<Stock> retrieveAllStocks() {
        List<Stock> stockList = stockService.retrieveAllStocks();
        return stockList;
    }

    @GetMapping("retrieveStock/{id-Stock}")
    @ResponseBody
    public Stock retrieveStock(@PathVariable("id-Stock")Long idStock) {
        Stock stock = stockService.retrieveStock(idStock);
        return stock;
    }

    @PostMapping("/addStock")
    @ResponseBody
    public Stock addStock(@RequestBody Stock s)
    {
        Stock stock = stockService.addStock(s);
        return stock;
    }

    @PutMapping("/modify-client/{stock-id}")
    @ResponseBody
    public Stock updateStock(@PathVariable("stock-id") Long idStock, @RequestBody Stock s) {
        Stock stock = stockService.updateStock(idStock, s);
        return stock;
    }

}
