package obiekty;

public class Osobowka extends Pojazd {
    private String typ = "Osobowka";

    public String getTyp() {
        return typ;
    }

    public Osobowka(String marka, String numer) {
        super(marka, numer);
    }

    @Override
    public String toString() {
        return "Osobowka{" + super.toString() +
                "typ='" + typ + '\'' +
                '}';
    }
}
