public class NumberDiamond {
    public static void main(String[] args) {
        int num = 4;

        // Print top half
        printDiamond(num, 1, num);

        // Print bottom half
        printDiamond(num - 1, 1, num);
    }

    // Method to print one half of the diamond
    private static void printDiamond(int rows, int start, int total) {
        for (int row = rows; row >= start; row--) {
            // Print leading spaces
            for (int s = 0; s < total - row; s++) {
                System.out.print(" ");
            }

            // Print descending numbers
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }

            // Print ascending numbers starting from 2
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }

            System.out.println();
        }
    }
}
