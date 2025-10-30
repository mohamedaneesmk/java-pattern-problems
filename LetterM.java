public class LetterM {
    public static void main(String[] args) {
        int n = 3; // number of rows

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= 15; col++) {  // more columns for spacing
                if ((row == 1 && (col == 6 || col == 14)) ||
                    (row == 2 && (col == 5 || col == 7 || col == 13 || col == 15)) ||
                    (row == 3 && (col == 4 || col == 8 || col == 12 || col == 16))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
