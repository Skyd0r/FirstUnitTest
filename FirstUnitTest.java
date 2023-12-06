import java.util.Scanner;
import java.lang.*; 
import java.util.Date;
import java.time.LocalTime;


public class FirstUnitTest {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        LocalTime midi = LocalTime.of(12, 00, 00);
        LocalTime soir = LocalTime.of(18, 00, 00);


        if (now.isBefore(midi)) {
            System.out.print("Bon matin");
        } else if (now.isBefore(soir)) {
            System.out.print("Bonjour");
        }else{
            System.out.print("Bonsoir");
        }
        

        System.out.print("\nEntrer un mot a inverser: ");

        Scanner input = new Scanner(System.in);

        String mot = input.nextLine();

        StringBuilder palindrome = new StringBuilder(mot); 

        mot = palindrome.reverse().toString();

        System.out.println(palindrome);
        
        if (now.isBefore(midi)) {
            System.out.print("Bonne matinée");
        } else if (now.isBefore(soir)) {
            System.out.print("Bonne journée");
        }else{
            System.out.print("Bonne soirée");
        }

    }
}
