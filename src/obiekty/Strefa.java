package obiekty;

import java.util.ArrayList;

public class Strefa {


    private ArrayList<Motor> strefaMotor = new ArrayList<Motor>();
    private ArrayList<Osobowka> strefaOsobowka = new ArrayList<Osobowka>();
    private ArrayList<Ciezarowka> strefaCiezarowka = new ArrayList<Ciezarowka>();


    public ArrayList<Motor> getStrefaMotor() {
        return strefaMotor;
    }

    public void addStrefaMotor(Motor motor) {
        strefaMotor.add(motor);
    }

    public ArrayList<Osobowka> getStrefaOsobowka() {
        return strefaOsobowka;
    }

    public void addStrefaOsobowka(Osobowka osobowka) {
        strefaOsobowka.add(osobowka);
    }

    public ArrayList<Ciezarowka> getStrefaCiezarowka() {
        return strefaCiezarowka;
    }

    public void addStrefaCiezarowka(Ciezarowka ciezarowka) {
        strefaCiezarowka.add(ciezarowka);
    }

    @Override
    public String toString() {
        return "Strefa{" +
                "strefaMotor=" + strefaMotor +
                ", strefaOsobowka=" + strefaOsobowka +
                ", strefaCiezarowka=" + strefaCiezarowka +
                '}';
    }

}
