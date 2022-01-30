import java.util.Locale;
import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        System.out.println("Enter your username");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        System.out.println("Your username is "+username+".");
        System.out.println("What is your hobby?");
        Scanner scanner1 = new Scanner(System.in);
        String hobby = scanner.next();
        System.out.println("Your hobby is " +hobby + ".");
        System.out.println("Your username is "+ username +" and your hobby is "+hobby +".");
    }
}
