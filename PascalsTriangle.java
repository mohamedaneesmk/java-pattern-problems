public class PascalsTriangle {
    public static void main(String[] args) {
        int num = 5; // number of rows

        for (int row = 0; row < num; row++) {
            for (int spaces = num - row; spaces > 0; spaces--) {
                System.out.print(" ");
            }

            int val = 1; // first value in each row is always 1

            for (int col = 0; col <= row; col++) {
                System.out.print(val + " ");
                // Compute next value using nCr relation
                val = val * (row - col) / (col + 1);
            }

            System.out.println(); // move to next line
        }
    }
}
