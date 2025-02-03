package it.epicode.azienda.aziende;

import it.epicode.azienda.dipendenti.Dipendente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Azienda {
    private Long id;
    private String nome;
    private String partitaIva;
    private String codiceFiscale;
    private String email;
    private String telefono;
    private String indirizzo;
    private String citta;
    private String provincia;
    private String cap;
    List<Dipendente> dipendenti = new ArrayList<>();

    public void printAzienda() {
        System.out.println("------------------------------------");
        System.out.print("Azienda: " + nome);
        System.out.println(" Partita IVA: " + partitaIva);
        System.out.println("------------------------------------");
        System.out.println("Dipendenti: ");
        System.out.println("------------------------------------");
        for (Dipendente dipendente : dipendenti) {
            System.out.print("   " + dipendente.getNome());
            System.out.print("   " + dipendente.getCognome());
            System.out.println(" Codice Fiscale: " + dipendente.getCodiceFiscale());
            System.out.println("------------------------------------");
        }
    }
}
