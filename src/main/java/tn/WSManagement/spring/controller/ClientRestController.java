package tn.WSManagement.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.WSManagement.spring.entity.Client;
import tn.WSManagement.spring.service.ClientServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientRestController {
    @Autowired
    ClientServiceImpl clientSerivce;

    @GetMapping("/retrieveAllClients")
    @ResponseBody
    public List<Client> getClients() {
        List<Client> listClients = clientSerivce.retrieveAllClients();
        return listClients;
    }

    @GetMapping("retrieveClient/{id-Client}")
    @ResponseBody
    public Client retrieveClient(@PathVariable("id-Client")Long idClient) {
        Client client = clientSerivce.retreiveClient(idClient);
        return client;
    }

    @PostMapping("/add-client")
    @ResponseBody
    public Client addClient(@RequestBody Client c)
    {
        Client client = clientSerivce.addClient(c);
        return client;
    }

    @DeleteMapping("/remove-client/{client-id}")
    @ResponseBody
    public void removeClient(@PathVariable("client-id") Long clientId) {
        clientSerivce.deleteClient(clientId);
    }

    @PutMapping("/modify-client/{client-id}")
    @ResponseBody
    public Client modifyClient(@PathVariable("client-id") Long clientId, @RequestBody Client c) {
        Client client = clientSerivce.updateClient(c, clientId);
        return client ;
    }

}
