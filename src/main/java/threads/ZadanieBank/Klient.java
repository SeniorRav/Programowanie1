package threads.ZadanieBank;

import java.util.List;

public class Klient extends Rachunek {
    private String imie;
    private String nazwisko;
    private long pesel;
    private long nrKlienta;
    private List<String> listaRachunkow;

    public Klient(String imie, String nazwisko, long pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    public long getNrKlienta() {
        return nrKlienta;
    }

    public void setNrKlienta(long nrKlienta) {
        this.nrKlienta = nrKlienta;
    }

    public String toString() {
        return "Osoba{" +
                "Imie ='" + imie + '\'' +
                ", Nazwisko ='" + nazwisko + '\'' +
                ", Pesel ='" + pesel + '\'' +
                ", Nr Klienta=" + nrKlienta +
                '}';
    }

}
