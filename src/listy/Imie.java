package listy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Imie {
    public static void main(String[] args) {

        List<String> imiona = new ArrayList<>();
        imiona.add("pablo");
        imiona.add("adas");
        imiona.add("jan");
        imiona.add("eustachy");
        imiona.add("blackadam");
        imiona.add("edd");
        imiona.add("eddi");
        imiona.add("adam");
        imiona.add("tomek");
        imiona.add("lukasz");

        // metodaDoKopiowaniaElementowListyZWielkimiLiterami(imiona);

//        metodyodwracaniakolejnosciimion(imiona);

        fastReverseArrayList(imiona);
    }

    private static void fastReverseArrayList(List<String> list) {
        Collections.reverse(list);
        for (String reverseEl : list) {
            System.out.println(reverseEl);
        }
    }

    private static void metodyodwracaniakolejnosciimion(List<String> imiona) {
        List<String> imionaodwrocone = new ArrayList<>();
        for (int i = imiona.size() - 1; i >= 0; i--) {
            System.out.println(i);
            imionaodwrocone.add(imiona.get(i));

        }
        for (String odwroconeImie : imionaodwrocone) {
            System.out.println(odwroconeImie);
        }


    }


    private static void metodaDoKopiowaniaElementowListyZWielkimiLiterami(List<String> imiona) {
        List<String> imiona1 = new ArrayList<>();
        System.out.println("################");
        for (String imie : imiona) {
            if (imie.length() > 4) {
                imie = imie.toUpperCase();
                imiona1.add(imie);
            }
        }
        for (String imieWielkimiLiterami : imiona1) {
            System.out.println(imieWielkimiLiterami);
        }
    }


}
//