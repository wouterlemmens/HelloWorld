import java.util.*;

public class OddsAndEvens {
    public static void main(String[] args){
        Scanner input=new Scanner (System.in);

        //  PART 1 - PICK ODDS OR EVENS

        //intro
        System.out.println("Let's play a game called \"Odds and Evens\"");

        //take in the users name, odds or evens
        System.out.print("What is your name?");
        String name = input.next();
        System.out.println("Hello " + name + " ,which do you choose? (O)dds or (E)vens? ");
        String answer = input.next();

        if ( answer.equals("O")) {
            System.out.println(name + " has picked odds The computer will be evens.");
        } else {
            System.out.println(name + " has picked evens The computer will be odds.");
        }

        System.out.println("-----------------------------------------------------------------");

        //  PART 2 - PLAY THE GAME

        //randomizer
        //takes in the number of "fingers" the user would like to play, and uses
        // the random generator to decide what the computer will play

        System.out.print("How many \"fingers\" do you put out?");
        int fingers = input.nextInt();
        System.out.println("you picked " + fingers + " fingers!");

        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer);


        System.out.println("-----------------------------------------------------------------");

        int sum = fingers + computer;
        System.out.println(sum);

        boolean oddOrEven = sum % 2 == 0;

        if (oddOrEven = sum % 2 == 0) {
            System.out.println("Sum is even");
        } else {
            System.out.println("Sum is odd");
        }

        System.out.println("-----------------------------------------------------------------");

        if (sum%2==0){
            System.out.println(sum+" is... even!");
            if(answer.equals("E")){
                System.out.println("That means "+name+ " wins! :)");
            }else {
                System.out.println("the computer wins");
            }
        }
        if(sum%2==1){
            if(answer.equals("O")){
                System.out.println("That means "+name+ " wins! :)");
            }else {
                System.out.println("the computer wins");
            }
    }
}
}

