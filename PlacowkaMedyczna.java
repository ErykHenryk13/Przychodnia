import java.time.LocalDateTime;
import java.util.*;

public class PlacowkaMedyczna {
    private List<Pacjent> pacjenci = new ArrayList<>();
    private List<Lekarz> lekarze = new ArrayList<>();
    private List<Grafik> grafiki = new ArrayList<>();
    private List<Wizyta> wizyty = new ArrayList<>();

    // Dodanie pacjenta
    public void dodajPacjenta(Pacjent pacjent) {
        pacjenci.add(pacjent);
    }

    // Wyszukiwanie pacjenta po PESEL
    public Pacjent znajdzPacjentaPoPeselu(String pesel) {
        return pacjenci.stream()
                .filter(p -> p.getPesel().equals(pesel))
                .findFirst()
                .orElse(null);
    }

    // Dodanie lekarza
    public void dodajLekarza(Lekarz lekarz) {
        lekarze.add(lekarz);
    }

    // Dodanie specjalizacji lekarzowi
    public void dodajSpecjalizacjeDoLekarza(String id, String specjalizacja) {
        lekarze.stream()
                .filter(l -> l.getId().equals(id))
                .findFirst()
                .ifPresent(l -> l.dodajSpecjalizacje(specjalizacja));
    }

    // Dodanie grafiku pracy lekarza
    public void dodajGrafik(Grafik grafik) {
        grafiki.add(grafik);
    }

    // Wyszukiwanie lekarza po ID
    public Lekarz znajdzLekarzaPoId(String id) {
        return lekarze.stream()
                .filter(l -> l.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Umawianie wizyty
    public boolean umowWizyte(Pacjent pacjent, Lekarz lekarz, LocalDateTime czasWizyty) {
        Optional<Grafik> grafik = grafiki.stream()
                .filter(g -> g.getLekarz().equals(lekarz) &&
                        g.getDzien().equals(czasWizyty.toLocalDate().toString()) &&
                        czasWizyty.toLocalTime().isAfter(g.getGodzinaRozpoczecia()) &&
                        czasWizyty.toLocalTime().isBefore(g.getGodzinaZakonczenia()))
                .findFirst();

        if (grafik.isPresent()) {
            for (Wizyta w : wizyty) {
                if (w.czasWizyty.equals(czasWizyty) && w.lekarz.equals(lekarz)) {
                    return false; // Lekarz ma już wizytę w tym czasie
                }
            }
            wizyty.add(new Wizyta(pacjent, lekarz, czasWizyty));
            return true;
        }
        return false; // Lekarz nie pracuje w tym czasie
    }
}
