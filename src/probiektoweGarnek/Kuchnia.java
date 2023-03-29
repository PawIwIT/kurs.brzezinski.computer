package probiektoweGarnek;

public class Kuchnia {
    public static void main(String[] args) {

        Garnek garnek = new Garnek(5, 10);

        String wiadomosc = garnek.gotuj();
        System.out.println(wiadomosc);


        String wiadomosc2 = garnek.gotuj(true);
        System.out.println(wiadomosc2);

        int temp = garnek.zwrocTemperatureWrzeniaWody();
        System.out.println(temp);


        garnek.gotujBezInformacji();


    }

}