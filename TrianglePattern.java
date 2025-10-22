public class TrianglePattern {
    public static void main(String[] args) {
        int num = 3;

        for (int row = 1; row <= num; row++) {
            for (int spaces = 1; spaces <= num - row; spaces++) {
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
