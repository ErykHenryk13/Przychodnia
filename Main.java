import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tworzymy instancję placówki medycznej
        PlacowkaMedyczna placowkaMedyczna = new PlacowkaMedyczna();
        Scanner scanner = new Scanner(System.in);

        // Menu główne
        while (true) {
            System.out.println("Wybierz opcję:");
            System.out.println("1. Dodaj pacjenta");
            System.out.println("2. Znajdź pacjenta po PESEL");
            System.out.println("3. Zakończ");

            int wybor = scanner.nextInt();
            scanner.nextLine(); // Dopełnienie po wczytaniu liczby

            switch (wybor) {
                case 1:
                    // Dodawanie pacjenta
                    System.out.println("Podaj imię:");
                    String imie = scanner.nextLine();

                    System.out.println("Podaj nazwisko:");
                    String nazwisko = scanner.nextLine();

                    System.out.println("Podaj numer PESEL:");
                    String pesel = scanner.nextLine();

                    System.out.println("Podaj datę urodzenia (yyyy-mm-dd):");
                    String dataUrodzenia = scanner.nextLine();

                    System.out.println("Podaj wiek:");
                    int wiek = scanner.nextInt();
                    scanner.nextLine(); // Dopełnienie po wczytaniu liczby

                    System.out.println("Podaj numer telefonu:");
                    String telefon = scanner.nextLine();

                    System.out.println("Podaj adres e-mail:");
                    String email = scanner.nextLine();

                    // Tworzymy obiekt pacjenta i dodajemy do systemu
                    Pacjent pacjent = new Pacjent(imie, nazwisko, pesel, dataUrodzenia, wiek, telefon, email);
                    placowkaMedyczna.dodajPacjenta(pacjent);

                    System.out.println("Pacjent został dodany do systemu.");
                    break;

                case 2:
                    // Wyszukiwanie pacjenta po PESEL
                    System.out.println("Podaj numer PESEL pacjenta do wyszukania:");
                    String peselDoWyszukania = scanner.nextLine();
                    Pacjent znalezionyPacjent = placowkaMedyczna.znajdzPacjentaPoPeselu(peselDoWyszukania);

                    if (znalezionyPacjent != null) {
                        System.out.println("Znaleziony pacjent: " + znalezionyPacjent);
                    } else {
                        System.out.println("Pacjent o podanym PESEL-u nie został znaleziony.");
                    }
                    break;

                case 3:
                    // Zakończenie programu
                    System.out.println("Zamykanie programu...");
                    scanner.close();
                    return; // Zakończenie działania programu

                default:
                    System.out.println("Niepoprawna opcja, spróbuj ponownie.");
                    break;
            }
        }
    }
}
