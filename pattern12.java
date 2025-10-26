public class pattern12 {
    public static void main(String[] args) {
        int num = 5;

        // Upper half
        for (int row = 1; row <= num; row++) {
            // Left side
            for (int col = row; col <= num; col++) {
                System.out.print("*");
            }

            // Middle space (skip for first row)
            for (int spaces = 1; spaces < row * 2 - 1; spaces++) {
                if (row != 1)
                    System.out.print(" ");
            }

            // Right side
            for (int col = row; col <= num; col++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int row = num - 1; row >= 1; row--) {
            // Left side
            for (int col = row; col <= num; col++) {
                System.out.print("*");
            }

            // Middle space (skip for last row)
            for (int spaces = 1; spaces < row * 2 - 1; spaces++) {
                if (row != 1)
                    System.out.print(" ");
            }

            // Right side
            for (int col = row; col <= num; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
