package tn.WSManagement.spring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.WSManagement.spring.entity.Stock;
import tn.WSManagement.spring.repository.StockRepository;

import java.util.List;

@Service
@Slf4j
public class StockServiceImpl implements StockService {
    @Autowired
    private StockRepository stockRepository;

    @Override
    public List<Stock> retrieveAllStocks() {
        return stockRepository.findAll();
    }

    @Override
    public Stock addStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock updateStock(Long id, Stock s) {
        Stock updatedStock = stockRepository.findById(id).get();
        updatedStock.setQte(s.getQte());
        updatedStock.setQteMin(s.getQteMin());
        updatedStock.setLibelleStock(s.getLibelleStock());
        updatedStock.setProduct(s.getProduct());

        return stockRepository.save(updatedStock);
    }


    @Override
    public Stock retrieveStock(Long id) {
        return null;
    }
}
