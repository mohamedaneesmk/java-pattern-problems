public class NumberMirror {
    public static void main(String[] args) {
        int num = 5;

        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }

            int spaces = 2 * (num - row);
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
