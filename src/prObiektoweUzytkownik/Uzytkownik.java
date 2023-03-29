package prObiektoweUzytkownik;

public class Uzytkownik {
    private int wiek;
    private String imie;


    public Uzytkownik(int wiek, String name) {
        this.wiek = wiek;
        this.imie = name;
    }

    public boolean czyMozeLegalnieKupicAlkohol(){
        if (wiek>=18){
            return true;
        } else {
            return false;
        }
    }

    public int  getWiek() {
        return wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setWiek(int wiek) {
        if(wiek>0){
            this.wiek = wiek;
        } else {
           throw new RuntimeException("Wiek musi być wiekszy od 0");
        }

    }

    public void setImie(String imie) {
        this.imie = imie;
    }
}
