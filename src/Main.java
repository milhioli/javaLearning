import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* System.out.println("I love lasagnaa");
        System.out.println("And I know you love lasagna too.");
        */

        //Variables

       /* int age = 10;
        int quantity = 29;
        int year = 2025;

        System.out.println("Age: " + age + "\nQuantity: " + quantity + "\nYear: " + year);

        double cash = 25.83;
        double price = 17234.99;
        double pound = 35.2;
        double miles = 4.52;

        System.out.println("\nMy bank just have $" + cash +" now, I'm sorry." );
        System.out.println("My pound is " + pound +" so I'm ok." );
        System.out.println("I've ran " + miles +" miles until now and I will keep running!" );

        char grade = 'A';
        char symbol = '@';
        char currency = '$';

        boolean isStudent = false;
        boolean forSale = true;
        boolean isOnline = true;

        if(isStudent){
            System.out.print("\nYou're a Student!");
        }else{
            System.out.println("\nYou're NOT, no no no, Student!");
        }

        String name = "Enzo Milhioli";
        String favoriteFood = "Beef";
        String carModel = "Mitsubishi";
        String favoriteColor = "Purple";

        System.out.println("Your choice is a " + favoriteColor + " " + year + " "  + carModel);
        System.out.println("The price is: " + price);

        if(forSale){
            System.out.println("There is a " + carModel + "for sale.");
        }else{
            System.out.println("The " + carModel + " sold out!");
        }

        int papersInStock = 450;
        double paperWeight = 0.500;
        char initialNameLetter = 'E';
        boolean paper = true;
        String companyName = "Dunder Mifflin Paper Company";*/

        //Scanner
        // A class to make our program able to have inputs.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + "! How you doing?");
        System.out.println("You are " + age + " years old.");




        scanner.close(); // If we don't close this class, that won't behavior well.
    }
}