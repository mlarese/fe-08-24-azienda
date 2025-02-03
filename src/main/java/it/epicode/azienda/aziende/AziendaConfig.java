package it.epicode.azienda.aziende;

import com.github.javafaker.Faker;
import it.epicode.azienda.dipendenti.Dipendente;
import it.epicode.azienda.dirigenza.DirettoreGenerale;
import it.epicode.azienda.dirigenza.ResponsabileRisorseUmane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AziendaConfig {
    @Autowired
    private Faker faker;

    @Autowired
    DirettoreGenerale direttoreGenerale;
    @Autowired
    DirettoreGenerale direttoreGeneraleSostitutivo;
    @Autowired
    ResponsabileRisorseUmane responsabileRisorseUmane;

    @Bean
    public Azienda azienda() {
        Azienda azienda = new Azienda();
        azienda.setNome("Luxottica SPA");
        azienda.setPartitaIva(faker.number().digits(11));
        azienda.setIndirizzo(faker.address().fullAddress());
        azienda.setTelefono(faker.phoneNumber().phoneNumber());
        azienda.setEmail(faker.internet().emailAddress());

        List<Dipendente> dipendenti = new ArrayList<>();

        azienda.setDirettoreGenerale(direttoreGenerale);
        azienda.setDirettoreGeneraleSostitutivo(direttoreGeneraleSostitutivo);
        azienda.setResponsabileRisorseUmane(responsabileRisorseUmane);

        for (int i = 0; i < 10; i++) {
            Dipendente dipendente = new Dipendente();
            dipendente.setNome(faker.name().firstName());
            dipendente.setCognome(faker.name().lastName());
            dipendente.setCodiceFiscale(faker.number().digits(16));

            dipendenti.add(dipendente);
        }

        azienda.setDipendenti(dipendenti);
        return azienda;

    }
}
