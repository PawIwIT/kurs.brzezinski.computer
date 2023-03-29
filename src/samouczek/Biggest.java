package samouczek;

public class Biggest {
    public int biggest(int[] liczba) {
        int biggest = liczba[0];
        if (liczba[1] > biggest) {
            biggest = liczba[1];
            if (liczba[2] > liczba[1]) {
                biggest = liczba[2];
            }
        }
        return biggest;
    }
    public int bezif(int[] liczba){
        return Math.max(liczba[0],Math.max(liczba[1],liczba[2]));
    }
}