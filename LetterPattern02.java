public class LetterPattern02 {
    public static void main(String[] args) {
        int num = 5;
        char ch = 'a';
        boolean isUpper;

        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                // Even positions uppercase, odd lowercase
                isUpper = (ch - 'a') % 2 != 0;
                if (isUpper)
                    System.out.print(Character.toUpperCase(ch) + " ");
                else
                    System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
