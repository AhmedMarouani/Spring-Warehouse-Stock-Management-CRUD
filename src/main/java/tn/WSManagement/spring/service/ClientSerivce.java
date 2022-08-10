package tn.WSManagement.spring.service;

import tn.WSManagement.spring.entity.Client;

import java.util.List;


public interface ClientSerivce {

    List<Client> retrieveAllClients();

    Client addClient(Client c);

    void deleteClient(Long id);

    Client updateClient(Client c, Long id);

    Client retreiveClient(Long id);
}
