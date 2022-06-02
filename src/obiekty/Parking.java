package obiekty;

import java.util.Random;

import java.util.ArrayList;

public class Parking {

    private ArrayList<Pojazd> strefaMotor = new ArrayList<Pojazd>();
    private ArrayList<Pojazd> strefaOsobowka = new ArrayList<Pojazd>();
    private ArrayList<Pojazd> strefaCiezarowka = new ArrayList<Pojazd>();
    private ArrayList<Pojazd> kolejkaWjazdowa = new ArrayList<Pojazd>();

    private int utarg = 0;

    public int getUtarg() {
        return utarg;
    }

    public void doKolejki(Pojazd pojazd) {
        kolejkaWjazdowa.add(pojazd);
    }

    public void kolejkaWyjscie(int n) {
        if (!kolejkaWjazdowa.isEmpty()) {
            kolejkaWjazdowa.remove(n);
        }
    }

    public void wjazd(int n) {
        Pojazd pojazd = kolejkaWjazdowa.get(n);

        if (pojazd instanceof Motor) {
            if (strefaMotor.size() < Strefa.StrefaMotor.getPojemnosc()) {
                strefaMotor.add(pojazd);
            }
        } else if (pojazd instanceof Osobowka) {
            if (strefaOsobowka.size() < Strefa.StrefaOsobowka.getPojemnosc()) {
                strefaOsobowka.add(pojazd);
            }
        } else if (pojazd instanceof Ciezarowka) {
            if (strefaCiezarowka.size() < Strefa.StrefaCiezarowka.getPojemnosc()) {
                strefaCiezarowka.add(pojazd);
            }
        }

    }


    public Pojazd wyjazd(int n) {
        Random r = new Random();
        int randomNum = r.nextInt((2 - 0)) + 0;


        if (randomNum == 0) {
            if (!strefaMotor.isEmpty()) {
                int randomPojazd = r.nextInt((strefaMotor.size()));
                System.out.println(strefaMotor.get(randomPojazd));
                System.out.println("cena: " + Strefa.StrefaMotor.getCena());
                utarg = utarg + Strefa.StrefaMotor.getCena();
                return strefaMotor.remove(randomPojazd);
            }
        } else if (randomNum == 1) {
            if (!strefaOsobowka.isEmpty()) {
                int randomPojazd = r.nextInt((strefaOsobowka.size()));
                System.out.println(strefaOsobowka.get(randomPojazd));
                System.out.println("cena: " + Strefa.StrefaOsobowka.getCena());
                utarg = utarg + Strefa.StrefaOsobowka.getCena();
                return strefaOsobowka.remove(randomPojazd);
            }
        } else if (randomNum == 2) {
            if (!strefaCiezarowka.isEmpty()) {
                int randomPojazd = r.nextInt((strefaCiezarowka.size()));
                System.out.println(strefaCiezarowka.get(randomPojazd));
                System.out.println("cena: " + Strefa.StrefaCiezarowka.getCena());
                utarg = utarg + Strefa.StrefaCiezarowka.getCena();
                return strefaCiezarowka.remove(randomPojazd);
            }
        }

        return null;
    }


//    public ArrayList<Pojazd> getLiczbaPozostalychPojazdow() {
//
//        ArrayList<Pojazd> pozostalePojazdy = new ArrayList<Pojazd>();
//
//
//        for (Pojazd pojazd : strefaMotor) {
//            pozostalePojazdy.add(pojazd);
//        }
//
//        for (Pojazd pojazd : strefaOsobowka) {
//            pozostalePojazdy.add(pojazd);
//        }
//
//        for (Pojazd pojazd : strefaCiezarowka) {
//            pozostalePojazdy.add(pojazd);
//        }
//        return pozostalePojazdy;
//    }

    ;

    public ArrayList<Pojazd> getStrefaMotor() {
        return strefaMotor;
    }

    public ArrayList<Pojazd> getStrefaOsobowka() {
        return strefaOsobowka;
    }

    public ArrayList<Pojazd> getStrefaCiezarowka() {
        return strefaCiezarowka;
    }

    public Pojazd removeFromStrefa(int n, ArrayList<Pojazd> strefa) {
        return strefa.remove(n);

    }

    @Override
    public String toString() {
        return "Parking{" +
                "strefaMotor=" + strefaMotor +
                ", strefaOsobowka=" + strefaOsobowka +
                ", strefaCiezarowka=" + strefaCiezarowka +
                ", kolejkaWjazdowa=" + kolejkaWjazdowa +
                '}';
    }
}
