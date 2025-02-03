package it.epicode.azienda.aziende;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AziendaRunner implements CommandLineRunner {
    @Autowired
    Azienda azienda;

    @Override
    public void run(String... args) throws Exception {
        azienda.printAzienda();
    }
}
