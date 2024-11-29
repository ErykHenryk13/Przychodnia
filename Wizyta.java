import java.time.LocalDateTime;

public class Wizyta {
    private Pacjent pacjent;
    Lekarz lekarz;
    final LocalDateTime czasWizyty;

    public Wizyta(Pacjent pacjent, Lekarz lekarz, LocalDateTime czasWizyty) {
        this.pacjent = pacjent;
        this.lekarz = lekarz;
        this.czasWizyty = czasWizyty;
    }

    @Override
    public String toString() {
        return "Wizyta{" +
                "pacjent=" + pacjent +
                ", lekarz=" + lekarz +
                ", czasWizyty=" + czasWizyty +
                '}';
    }
}
