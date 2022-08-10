package tn.WSManagement.spring.service;

import tn.WSManagement.spring.entity.Stock;

import java.util.List;

public interface StockService  {

    List<Stock> retrieveAllStocks();
    Stock addStock(Stock s);
    Stock updateStock(Long id, Stock s);
    Stock retrieveStock(Long id);

}
