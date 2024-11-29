import java.util.HashSet;
import java.util.Set;

public class Lekarz {
    private String imie;
    private String nazwisko;
    private String pesel;
    private String telefon;
    private String email;
    private String id;
    private Set<String> specjalizacje;

    // Konstruktor
    public Lekarz(String imie, String nazwisko, String pesel, String telefon, String email, String id) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.telefon = telefon;
        this.email = email;
        this.id = id;
        this.specjalizacje = new HashSet<>();
    }

    // Dodanie specjalizacji
    public void dodajSpecjalizacje(String specjalizacja) {
        this.specjalizacje.add(specjalizacja);
    }

    public String getId() {
        return id;
    }

    public Set<String> getSpecjalizacje() {
        return specjalizacje;
    }

    @Override
    public String toString() {
        return "Lekarz{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                ", telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
                ", id='" + id + '\'' +
                ", specjalizacje=" + specjalizacje +
                '}';
    }
}
