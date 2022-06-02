package obiekty;

public class Ciezarowka extends Pojazd {
    private String typ = "Ciezarowka";

    public String getTyp() {
        return typ;
    }

    public Ciezarowka(String marka, String numer) {
        super(marka, numer);
    }

    @Override
    public String toString() {
        return "Ciezarowka{" + super.toString() +
                "typ='" + typ + '\'' +
                '}';
    }
}
