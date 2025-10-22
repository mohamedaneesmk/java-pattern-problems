public class ReverseHollowTriangle {
    public static void main(String[] args) {
        int num = 5;

        for (int row = num; row > 0; row--) {
            for (int spaces = num - row; spaces > 0; spaces--) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                if (col == 1 || col == row || row == num)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
