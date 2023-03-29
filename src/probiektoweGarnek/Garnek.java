package probiektoweGarnek;

public class Garnek {

     final int srednica;
     final int wysokosc;
    String kolor;

    public Garnek(int srednica, int wysokosc){
        this.wysokosc=wysokosc;
        this.srednica=srednica;
    }

    public Garnek(int srednica,int wyskosc,String kolor){
        this.srednica=srednica;
        this.wysokosc=wyskosc;
        this.kolor=kolor;


    }
    public String gotuj(){
        return "Gotowanie w trakcie";
    }

    public String gotuj(boolean czyDodalismysol){
        if(czyDodalismysol){
            return "Gotowanie z sola";

        } else {
            return "Gotowanie z sola";

        }
    }

    public int zwrocTemperatureWrzeniaWody(){
        return 100;
    }
public void gotujBezInformacji(){
wlaczGarnek();
gotujPrzezPolGodziny();
wylaczGarnek();
}

public void wlaczGarnek(){
    System.out.println("wlaczanie garnka");
}
public void gotujPrzezPolGodziny(){
    System.out.println("Gotowanie przez 30min");
}
public void wylaczGarnek(){
    System.out.println("wylaczanie garnka");
}

}



