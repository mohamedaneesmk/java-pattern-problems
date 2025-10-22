public class pattern08 {
    public static void main(String[] args) {
        int num = 10;

        for (int row = 1; row <= num; row++) {
            for (int spaces = num - row; spaces > 0; spaces--) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
