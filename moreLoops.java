import java.util.Scanner;

public class moreLoops {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number = 1;
        while (number != 0) {
            System.out.println("Enter a number or enter 0 to get the sum: ");
            number = input.nextInt();
            sum += number;
        }
        System.out.println("The sum is " + sum);
    }
}
