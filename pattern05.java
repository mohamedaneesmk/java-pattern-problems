public class pattern05 {
    public static void main(String[] args) {
        int num = 5;

        for (int row = 1; row < 2 * num; row++) {
            int totalColumnsInRow = row > num ? 2 * num - row : row;
            for (int col = 0; col < totalColumnsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}