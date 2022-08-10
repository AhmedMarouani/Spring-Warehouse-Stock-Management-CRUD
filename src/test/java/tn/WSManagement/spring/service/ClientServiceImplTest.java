package tn.WSManagement.spring.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import tn.WSManagement.spring.entity.Client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static tn.WSManagement.spring.enumeration.CategorieClient.Fidele;
import static tn.WSManagement.spring.enumeration.Profession.Ingenieur;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientServiceImplTest {
    @Autowired
    ClientSerivce cs;
    private static final Logger l = LogManager.getLogger(ClientServiceImplTest.class);


    @Test
    public void testretreiveClient() {
        Client c = new Client(1L, "testName", "testLastName", 1 ,
                "test@gmail.com", "ahmedd", Ingenieur, Fidele);
        Client c = cs.retreiveClient(Long.valueOf("1"));
        assertNotNull(c.getAge());
        l.info("retrieveClient age: "+ c);

    }

    @Test
    public void testaddClient() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse("2015-03-23");
        Client client = new Client();
        client.setNom("ahmed");
        client.setPrenom("ahmed");
        client.setDateNaissance(date);
        client.setCategorieclient(Fidele);
        client.setEmail("aaaaa@gmail.com");
        client.setPassword("aaaaa");
        client.setProfession(Ingenieur);
        cs.addClient(client);
    }
    @Test
    public void testretrieveAllClients() {

    }
    @Test
    public void testdeleteClient() {

    }
    @Test
    public void testupdateClient() {

    }
}
