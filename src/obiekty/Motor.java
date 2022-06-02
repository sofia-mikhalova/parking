package obiekty;

public class Motor extends Pojazd {
    private String typ = "Motor";

    public String getTyp() {
        return typ;
    }

    public Motor(String marka, String numer) {
        super(marka, numer);
    }

    @Override
    public String toString() {
        return "Motor{" + super.toString() +
                "typ='" + typ + '\'' +
                '}';
    }
}
