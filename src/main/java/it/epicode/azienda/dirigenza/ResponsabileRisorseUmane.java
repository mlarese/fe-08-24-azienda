package it.epicode.azienda.dirigenza;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponsabileRisorseUmane {
    private Long id;
    private String nome;
    private String cognome;
    private String ruolo = "Responsabile Risorse Umane";
}
