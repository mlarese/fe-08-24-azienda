package it.epicode.azienda.dirigenza;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DirigenzaConfig {
    @Autowired
    private Faker faker;

    @Bean(name="direttoreGenerale")
    public DirettoreGenerale direttoreGenerale() {
        DirettoreGenerale direttoreGenerale = new DirettoreGenerale();
        direttoreGenerale.setNome(faker.name().firstName());
        direttoreGenerale.setCognome(faker.name().lastName());

        return direttoreGenerale;
    }

    @Bean(name="direttoreGeneraleSostitutivo")
    public DirettoreGenerale direttoreGeneraleSostitutivo() {
        DirettoreGenerale direttoreGenerale = new DirettoreGenerale();
        direttoreGenerale.setNome(faker.name().firstName());
        direttoreGenerale.setCognome(faker.name().lastName());

        return direttoreGenerale;
    }
    @Bean
    public ResponsabileRisorseUmane responsabileRisorseUmane() {
        ResponsabileRisorseUmane responsabileRisorseUmane = new ResponsabileRisorseUmane();
        responsabileRisorseUmane.setNome(faker.name().firstName());
        responsabileRisorseUmane.setCognome(faker.name().lastName());

        return responsabileRisorseUmane;
    }

}
