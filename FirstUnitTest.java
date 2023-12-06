import java.util.Scanner;
import java.lang.*; 


public class FirstUnitTest {

    public static void main(String[] args) {

        System.out.print("Boujour");

        System.out.print("\n Entrer un mot a inverser: ");

        Scanner input = new Scanner(System.in);

        String mot = input.nextLine();

        StringBuilder palindrome = new StringBuilder(mot); 
  

        mot = palindrome.reverse().toString();

        System.out.println(palindrome);
        
        System.out.print("aurevoir");

    }
}
