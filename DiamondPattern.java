public class DiamondPattern {
    public static void main(String[] args) {
        int num = 10;

        for (int row = 1; row <= num; row++) {
            for (int spaces = num - row; spaces > 0; spaces--) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                if (col == 1 || col == row)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        for (int row = num-1; row > 0; row--) {
            for (int spaces = num - row; spaces > 0; spaces--) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                if (col == 1 || col == row)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
