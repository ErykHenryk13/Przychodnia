import java.util.Objects;

public class Pacjent {
    private String imie;
    private String nazwisko;
    private String pesel;
    private String dataUrodzenia;
    private int wiek;
    private String telefon;
    private String email;

    // Konstruktor
    public Pacjent(String imie, String nazwisko, String pesel, String dataUrodzenia, int wiek, String telefon, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.dataUrodzenia = dataUrodzenia;
        this.wiek = wiek;
        this.telefon = telefon;
        this.email = email;
    }

    // Gettery
    public String getPesel() {
        return pesel;
    }

    @Override
    public String toString() {
        return "Pacjent{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                ", dataUrodzenia='" + dataUrodzenia + '\'' +
                ", wiek=" + wiek +
                ", telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
