import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Math;

public class TripPlanner {
    public static void main(String[] args){
        Greetings();
        TravelTimeAndBudget();
        TimeDifference();
        distance();
    }

    public static void Greetings(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to your vacation planner!");
        System.out.print("What is your name?");

        String name = input.nextLine();

            /* the following code will also accept two input but has to be stored in two unique variable
            String name = input.next();
            String lastname = input.next();*/

            /* alternative option for the same code
             String nextName = input.next();
             nextName += " " + input.next();*/

        System.out.print("Nice to meet you " + name + ", where are you going to travel to?");


        String destination = input.nextLine();
        System.out.println("Great!" + destination +" sounds like a great trip!" );
    }

    public static void TravelTimeAndBudget(){
        Scanner input = new Scanner(System.in);

        System.out.print("How many days are they going to spend in their destination?");
        double time = input.nextDouble();

        System.out.print("What is their total budget for the trip in USD?");
        double budget = input.nextDouble();

        System.out.print("What is the currency type for your destination?");
        String currencyType = input.next();

        System.out.print("How many " + currencyType + " are there in 1 USD? ");
        double conversion = input.nextDouble();

        System.out.println("If you are travelling for " + time + " days that is the same as " + time*24 +" hours or "+ time*60*24+ " minutes." );
        System.out.println("If you spend $" + budget + " USD, that means per day you can spend up to $" + Math.round((budget/time)*100)/100.0 + " USD.");
        System.out.println("Your total budget in "+currencyType+ " is " +budget*conversion+ " " +currencyType+ ", which per day is " +Math.round(((budget/time)*conversion)*100)/100.0+" "+ currencyType);
    }

    public static void TimeDifference(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination?");
        double timeDifference = input.nextDouble();
        System.out.println("This means that when it is midnight at home it will be "+timeDifference+" in your travel destination and when it is noon at home it will be ");

    }

    public static void distance(){
        String myStringVar = "good morning";
        String mySecondVar = "I love CS";
        myStringVar = mySecondVar;
        System.out.println(myStringVar);


    }
}
