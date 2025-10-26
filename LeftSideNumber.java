public class LeftSideNumber {
    public static void main(String[] args) {
        int num = 6;

        for (int row = 1; row <= num; row++) {
            for (int col = num; col >= row; col--) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
