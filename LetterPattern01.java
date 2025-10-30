class LetterPattern01{
    public static void main(String[] args) {
        int num = 5;
        for (int row = 0; row < num; row++) {
            char start = (char) ('E' - row); // Starting letter
            for (char ch = start; ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}