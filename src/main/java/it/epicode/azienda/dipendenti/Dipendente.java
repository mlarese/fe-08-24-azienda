package it.epicode.azienda.dipendenti;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dipendente {
    private Long id;
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private String email;
}
