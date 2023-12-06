import java.util.Scanner;
import java.time.LocalTime;
import java.util.Objects;


public class FirstUnitTest {

    public static void main(String[] args) {

        String userLanguage = System.getProperty("user.language");
        LocalTime now = LocalTime.now();
        LocalTime midi = LocalTime.of(12, 00, 00);
        LocalTime soir = LocalTime.of(18, 00, 00);

        
        if (Objects.equals(userLanguage, "fr")){ 

            if (now.isBefore(midi)) {
                System.out.print("Bon matin");
            } else if (now.isBefore(soir)) {
                System.out.print("Bonjour");
            }else{
                System.out.print("Bonsoir");
            }

        }else{
            if (now.isBefore(midi)) {
                System.out.print("good morning");
            } else if (now.isBefore(soir)) {
                System.out.print("good afternoon");
            }else{
                System.out.print("Good evening");
            }
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
