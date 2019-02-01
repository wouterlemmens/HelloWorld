import java.util.Scanner; // import scanner

public class RockPaperScissors { // initiate input
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Does player one choose rock, paper, or scissors? ");
        String playerOne = input.next();
        System.out.println("Does player two choose rock, paper or scissors? ");
        String playerTwo = input.next();

        // Condensed version of logic for the rock paper scissors game
        if ( (playerOne.equals("rock") && playerTwo.equals("scissors")) ||(playerOne.equals("scissors") && playerTwo.equals("paper")) || (playerOne.equals("paper") && playerTwo.equals("rock"))) {
            System.out.println("Player 1 wins");
        }  else if ( (playerOne.equals("rock") && playerTwo.equals("rock")) ||(playerOne.equals("scissors") && playerTwo.equals("scissors")) || (playerOne.equals("paper") && playerTwo.equals("paper"))){
            System.out.println("Tie! ");
        } else{
            System.out.println("Player 2 wins");
        }

        // Long version of logic for the rock paper scissors game
      /*  if (playerOne.equals("rock")) {
            if (playerTwo.equals("scissors")){
                System.out.println("player 1 wins");
            } else if(playerTwo.equals("paper")){
                System.out.println("player 2 wins");
            } else {
                System.out.println("Tie!");
            }
        } else if (playerOne.equals("paper")){
            if (playerTwo.equals("scissors")){
                System.out.println("player 2 wins");
            } else if (playerTwo.equals("paper")) {
                System.out.println("tie!");
            } else { // playerTwo.equals("rock")
                System.out.println("player 1 wins");
            }
        } else { // playerOne.equals("scissors")
            if (playerTwo.equals("scissors")) {
                System.out.println("Tie!");
            } else if (playerTwo.equals("paper")) {
                System.out.println("player 1 wins");
            } else {
                System.out.println("player 2 wins!");
            }
        } */

    }

}
