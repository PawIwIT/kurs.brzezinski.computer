package temp.Party;

import java.util.*;

 /*  1.Dodawanie gosci na impreze/imie,nazwisko,danie,nrtel
     2.wystwieltalnie gosci,potraw
     3.wyszukiwanie gosci po ich numerzetel*/

public class ListyGosci {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
boolean shouldContinue = true;
Party party = new Party();

        while(shouldContinue){
            System.out.println("Wybierz opcje");
            System.out.println("1.Wyswietl gosci");
            System.out.println("2.Dodaj goscia");
            System.out.println("3.Wyswietl potrawy");
            System.out.println("4.znajdz po numerze tel");
            System.out.println("5.Wyjście");

            int userChoice = sc.nextInt();

            switch (userChoice){
                case 1 -> party.displayGuests();
                case 2 -> party.addGuest();
                case 3 -> party.displayMeals();
                case 4 -> party.displayGusestByPhoneNumber();
                case 5 -> shouldContinue=false;
            }

        }


    }
}