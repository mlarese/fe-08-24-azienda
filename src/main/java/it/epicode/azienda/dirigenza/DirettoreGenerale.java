package it.epicode.azienda.dirigenza;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DirettoreGenerale {
    private Long id;
    private String nome;
    private String cognome;
    private String ruolo = "Direttore Generale";
}
