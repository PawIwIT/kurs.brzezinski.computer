package temp.Party;

import java.util.*;

public class Party {
    private List<Guest> guests = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    private Map<Integer,Guest> phoneToGuests = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    public void addGuest(){
        System.out.println("Podaj imie goscia");
        String name = scanner.nextLine();

        System.out.println("Podaj preferowany posilek");
        String meal = scanner.nextLine();

        System.out.println("Podaj numer telefonu");
        int phoneNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("czy veganin y/n");
        String isVeganString = scanner.nextLine();

        boolean isVegan;
        if (isVeganString.equals("y")) {
            isVegan = true;
        } else {
            isVegan = false;

        }
 //tworzymy obiekt naszej klasy Guest // wywolujemy konstruktor

        Guest guest = new Guest(name, meal, phoneNumber, isVegan);
        meals.add(meal);
        phoneToGuests.put(phoneNumber,guest);
        guests.add(guest);


    }

    public void displayGuests(){
        for (Guest guest : guests){
            guest.displayGuestInformation();
            System.out.println();
        }


    }

    public void displayMeals(){
        for (String meal : meals){
            System.out.println(meal);
        }

    }

    public void displayGusestByPhoneNumber(){
        System.out.println("podaj numer tel");
        Integer phoneNumber = Integer.valueOf(scanner.nextLine());
        Guest guest = phoneToGuests.get(phoneNumber);
        guest.displayGuestInformation();
    }
}
