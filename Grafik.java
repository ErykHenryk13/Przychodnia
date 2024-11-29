import java.time.LocalTime;

public class Grafik {
    private Lekarz lekarz;
    private String dzien;
    private LocalTime godzinaRozpoczecia;
    private LocalTime godzinaZakonczenia;

    public Grafik(Lekarz lekarz, String dzien, LocalTime godzinaRozpoczecia, LocalTime godzinaZakonczenia) {
        this.lekarz = lekarz;
        this.dzien = dzien;
        this.godzinaRozpoczecia = godzinaRozpoczecia;
        this.godzinaZakonczenia = godzinaZakonczenia;
    }

    public Lekarz getLekarz() {
        return lekarz;
    }

    public String getDzien() {
        return dzien;
    }

    public LocalTime getGodzinaRozpoczecia() {
        return godzinaRozpoczecia;
    }

    public LocalTime getGodzinaZakonczenia() {
        return godzinaZakonczenia;
    }

    @Override
    public String toString() {
        return "Grafik{" +
                "lekarz=" + lekarz.getId() +
                ", dzien='" + dzien + '\'' +
                ", godzinaRozpoczecia=" + godzinaRozpoczecia +
                ", godzinaZakonczenia=" + godzinaZakonczenia +
                '}';
    }
}
