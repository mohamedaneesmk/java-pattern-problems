public class NumberDiamond {
    public static void main(String[] args) {
        int num = 8; 

        // Top half including the center
        for (int i = 1; i <= num; i++) {
            // Print leading spaces
            for (int spaces = 0; spaces < (num - i); spaces++) {
                System.out.print("  ");
            }
            // Print descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // Print ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Bottom half (excluding center)
        for (int i = num - 1; i >= 1; i--) {
            // Print leading spaces
            for (int spaces = 0; spaces < (num - i); spaces++) {
                System.out.print("  ");
            }
            // Print descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // Print ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
