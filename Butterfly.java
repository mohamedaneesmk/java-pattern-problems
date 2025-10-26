public class Butterfly {
    public static void main(String[] args) {
        int num = 10;

        // Upper half (excluding the center repetition)
        for (int row = 1; row < num; row++) {
            // Left stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int spaces = 1; spaces <= 2 * (num - row); spaces++) {
                System.out.print(" ");
            }

            // Right stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Center line (only once)
        for (int i = 1; i <= num * 2; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Lower half
        for (int row = num - 1; row >= 1; row--) {
            // Left stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int spaces = 1; spaces <= 2 * (num - row); spaces++) {
                System.out.print(" ");
            }

            // Right stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
