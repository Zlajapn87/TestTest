import java.util.Scanner;

public class mainClass {

    public static void main(String[] args) {

        String sCharacters;
        String sJointMessages;
        Scanner sInput = new Scanner(System.in);
        sCharacters = sInput.nextLine();

        //Inicijalna poruka i brojenje karaktera;
        System.out.println("Iniciajlna poruka je: " + sCharacters + ", i ima " + CharacterCount.counter(sCharacters) + " karaktera :)");


        //Nastavak druge na prvu poruku i brojenje karaktera;

        sJointMessages = CharacterCount.addingString(sCharacters);
        System.out.println("Zbirna poruka je: " + sJointMessages + ", a ukupan broj karaktera u zbirnoj poruci je: " + CharacterCount.counter(sJointMessages) + "\n Hvala lepo i dovidjenja");

        // Ispisivanje random mail-a
        System.out.println("Random generisan email: " + CharacterCount.mailGenerator());

        // Adding a line to show the git add/commit

    }
}
