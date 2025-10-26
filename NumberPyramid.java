public class NumberPyramid {
    public static void main(String[] args) {
        int num = 5;

        for (int row = 1; row <= num; row++) {
            for (int spaces = num - row; spaces > 0; spaces--) {
                System.out.print("  ");
            }

            for (int col = row; col > 0; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
