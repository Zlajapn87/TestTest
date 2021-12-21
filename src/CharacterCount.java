import java.util.Random;
import java.util.Scanner;

public class CharacterCount {

   // Brojanje karaktera
   public static int counter(String sKeyboardInput){
       String mesasge = sKeyboardInput;
       int n = sKeyboardInput.length();
       return n;
   }

   //Spajanje Stringova
   public static String addingString(String message) {
       String initialMessage = message;
       System.out.println("Unesite drugu poruku: ");
       Scanner am = new Scanner(System.in);
       String additionalMessage;
       additionalMessage = am.nextLine();
       return initialMessage + additionalMessage;
   }

   // Generisanje random maila

    public static String mailGenerator() {
       String email = "";
       Random rnd = new Random();
       System.out.print(rnd);
       email = rnd + "@gmail.com";
       return email;
    }


    //Create a method to calculate the geolocation;



}
