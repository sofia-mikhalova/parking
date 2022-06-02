package obiekty;

public class Pojazd {
    private String marka;
    private String numer;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNumer() {
        return numer;
    }

    public void setNumer(String numer) {
        this.numer = numer;
    }

    public Pojazd(String marka, String numer) {
        this.marka = marka;
        this.numer = numer;
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "marka='" + marka + '\'' +
                ", numer='" + numer + '\'' +
                '}';
    }
}
