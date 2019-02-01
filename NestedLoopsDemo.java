public class NestedLoopsDemo {
    public static void main(String[] args){
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 10; j++){
            System.out.println("*");
        }
        System.out.println();
    }

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.println("0 ");
            }
            System.out.println();
        }

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                if (row == col) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
