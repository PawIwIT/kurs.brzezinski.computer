package pierwszeprogramy;

import com.sun.source.tree.IfTree;

import java.util.Random;
import java.util.Scanner;

public class PierwszaGra {

    public static void main(String[] args) {

     Random liczba = new Random();

     Scanner scanner = new Scanner(System.in);

     int numberToGuess = liczba.nextInt(100)+1;
     boolean wasNumberGuessed = false;

     while (!wasNumberGuessed) {
         System.out.println("Podaj liczbe z przedzialu 0,100");
         int userNumber = scanner.nextInt();

         if(userNumber<numberToGuess){
             System.out.println("Liczba jest za mala");

         }else if (userNumber>numberToGuess){
             System.out.println("Liczba jest za duza");

         } else{
             System.out.println("Braow! Zgadles!");
             wasNumberGuessed=true;
         }
     }
    }
}