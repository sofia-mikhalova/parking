package testy;

import obiekty.Ciezarowka;
import obiekty.Motor;
import obiekty.Osobowka;
import obiekty.Parking;

public class Symulacja {
    public static void main(String[] args) {

        Parking parking = new Parking();

        Osobowka samochod1 = new Osobowka("Ferrari", "WPR12323");

        Motor samochod2 = new Motor("Yamaha", "WWU12323");

        Ciezarowka samochod3 = new Ciezarowka("Petersbuilt", "WWA12332");


        parking.doKolejki(samochod1);
        parking.doKolejki(samochod2);
        parking.doKolejki(samochod3);


        parking.wjazd(0);
        parking.wjazd(1);
        parking.wjazd(2);


        parking.wyjazd(0);
        parking.wyjazd(1);
        parking.wyjazd(2);

        System.out.println("Calkowity utarg: " + parking.getUtarg());
        System.out.println("Lista Pozostalych Motorow:" + parking.getStrefaMotor().size());
        System.out.println("Lista Pozostalych Osobowek:" + parking.getStrefaOsobowka().size());
        System.out.println("Lista Pozostalych Ciezarowek:" + parking.getStrefaCiezarowka().size());

    }
}
