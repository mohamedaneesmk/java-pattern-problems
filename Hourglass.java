public class Hourglass {
    public static void main(String[] args) {
        int num = 10;

        for (int row = num; row > 0; row--) {
            for (int spaces = num - row; spaces > 0; spaces--) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

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
