public class ReverseTriangle {
    public static void main(String[] args) {
        int num = 15;

        for (int row = num; row > 0; row--) {
            for (int spaces = num - row; spaces > 0; spaces--) {
                System.out.print(" ");
            }

            int totalStars = 2 * row - 1;
            for (int col = 1; col <= totalStars; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
