// import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void math(String[] args) {
        System.out.println();
    }

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

/*
     Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("You are a Student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("\nHello " + name + "! How you doing?");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your gpa is " + gpa);
        if(isStudent){
            System.out.println("You are enrolled as a Student.");
        }else{
            System.out.println("You're NOT enrolled!");
        }

        // Scanner common issues

       System.out.print("Your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // fix the nextLine error

        System.out.print("Your name: ");
        String name = scanner.nextLine();

        System.out.println("Your age is: " + age);
        System.out.println("Your name is " + name);


        scanner.close(); // If we don't close this class, that won't behavior well.
    }*/
        // Calculate area of a rectangle

/*        double width;
        double height;
        double area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's calculate the rectangle area!");
        System.out.print("Enter the width: ");
        width = scanner.nextDouble();
        System.out.print("Enter the rectangle height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("\nThe area of this rectangle is: " + area + "cm²");
*/
        // Arithmetic operators

        // +   -   /   *   %   **

        //+=   -=    /=    %=    **=

        //++    --

        // P.E.M.D.A.S

        // Conditionals

 /*       String name;
        int age;
        boolean isBritish;

        Scanner conditionals = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = conditionals.nextLine();
        System.out.print("Enter your age: ");
        age = conditionals.nextInt();
        System.out.print("Are you British? (true/false): ");
        isBritish = conditionals.nextBoolean();

        //Group 1
        if (name.isEmpty()){
            System.out.println("You've forgotten to enter your name!");
        } else{
            System.out.println("Hello " + name + "!");
        }
        // Group 2
        if (age >= 65){
            System.out.println("You're a Senior!");
        } else if (age >= 18){
            System.out.println("You are an Adult!");
        } else if (age == 0){
            System.out.println("You are a baby!");
        } else if (age < 0) {
            System.out.println("You've not been born yet!");
        } else{
            System.out.println("You're a Child!");
        }
        // Group 3
        if (isBritish){
            System.out.println("I really appreciate your accent!");
        } else{
            System.out.println("Try to born again.");
        }

        conditionals.close(); */


/*        //Random
        Random dice = new Random();
        Random headsTails = new Random();

        int numb = dice.nextInt(1, 7);
        boolean isHeads = headsTails.nextBoolean();

        if (isHeads){
            System.out.println("HEADS");
        } else{
            System.out.println("TAILS");
        }

        System.out.println("The dice number is: " + numb);

 */
        //Math Class

 /*       System.out.println(Math.pow(4, 3));
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.sqrt(5));
        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(35, 2));
        System.out.println(Math.floor(4.30));
        System.out.println(Math.ceil(4.30));
*/
        //printf
        //%[specifier-character][flags][width][.precision]

        String name = "Sonic"; //%s
        char firstLetter = 'S'; //%c
        int age = 120; //%d
        double weight = 2.5; //%f
        boolean isLegendary = true; //%b

        System.out.printf("Hello %s!\n", name);
        System.out.printf("Your first letter name is %c!\n", firstLetter);
        System.out.printf("You're %d years old.\n", age);
        System.out.printf("You're %f pounds! Do you need some help %s?", weight, name);



    }
}