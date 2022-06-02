package obiekty;

import java.util.ArrayList;

public enum Strefa {
    StrefaMotor(5, 2), StrefaOsobowka(10, 5), StrefaCiezarowka(20, 1);
    private final int cena;
    private final int pojemnosc;

    private Strefa(int cena, int pojemnosc) {
        this.cena = cena;
        this.pojemnosc = pojemnosc;
    }

    public int getCena() {
        return cena;
    }

    public int getPojemnosc() {
        return pojemnosc;
    }

}
