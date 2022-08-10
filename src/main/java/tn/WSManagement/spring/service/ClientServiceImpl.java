package tn.WSManagement.spring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.WSManagement.spring.entity.Client;
import tn.WSManagement.spring.repository.ClientRepository;

import java.util.List;

@Slf4j
@Service
public class ClientServiceImpl implements ClientSerivce {
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> retrieveAllClients() {
        List<Client> clients = clientRepository.findAll();

        return clients;
    }

    @Override
    public Client addClient(Client c) {
        log.info("saving client", c);
        return clientRepository.save(c);
    }

    @Override
    public void deleteClient(Long id) {
        log.info("Deleting client by id: {}", id);

        clientRepository.deleteById(id);
    }

    @Override
    public Client updateClient(Client c, Long id) {
        log.info("Client updated", c);

        Client updatedclient = clientRepository.findById(id).get();

        updatedclient.setNom(c.getNom());
        updatedclient.setAge(c.getAge());
        updatedclient.setEmail(c.getEmail());
        updatedclient.setPassword(c.getPassword());
        updatedclient.setProfession(c.getProfession());
        updatedclient.setCategorieclient(c.getCategorieclient());

        return clientRepository.save(updatedclient);
    }

    @Override
    public Client retreiveClient(Long id) {
        log.info("fetching client by id: {}", id);
        return clientRepository.findById(id).get();

    }

}
