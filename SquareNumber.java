public class SquareNumber {
    public static void main(String[] args) {
        int num = 8;
        int size = 2 * num - 1; // 5

        for (int row = 0; row < size; row++) { 
            for (int col = 0; col < size; col++) {
                int top = row; 
                int left = col;
                int bottom = size - 1 - row; 
                int right = size - 1 - col; 
 
                int min = Math.min(Math.min(top, bottom), Math.min(left, right));
            
                System.out.print((num - min) + " ");
            }
            System.out.println();
        }
    }
}
