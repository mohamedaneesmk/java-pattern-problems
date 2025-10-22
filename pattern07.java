public class pattern07 {
    public static void main(String[] args) {
        int num = 5; // Since pattern starts with 4 stars

        for (int row = num; row > 0; row--) {
            for (int spaces = num - row; spaces > 0; spaces--) {
                System.out.print(" ");
            }

            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
