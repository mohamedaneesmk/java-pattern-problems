public class LetterPattern03 {
    public static void main(String[] args) {
        int num = 5;
        for (int row = 0; row < num; row++) {
            char start = (char) ('E' - row);
            for (char ch = start; ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
