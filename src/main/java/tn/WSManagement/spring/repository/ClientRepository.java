package tn.WSManagement.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.WSManagement.spring.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
