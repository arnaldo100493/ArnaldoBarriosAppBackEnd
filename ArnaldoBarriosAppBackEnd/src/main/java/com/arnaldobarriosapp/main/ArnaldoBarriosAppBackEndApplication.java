package com.arnaldobarriosapp.main;

import com.arnaldobarriosapp.entity.Persona;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArnaldoBarriosAppBackEndApplication {

    public ArnaldoBarriosAppBackEndApplication() {

    }

    public static void main(String[] args) {
        SpringApplication.run(ArnaldoBarriosAppBackEndApplication.class, args); 
     
    }

}
