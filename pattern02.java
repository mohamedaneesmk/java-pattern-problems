import java.util.Scanner;

public class pattern02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for(int row=0;row<number;row++,System.out.println()){
            for(int col=0;col<=row;col++){
                System.out.print("*");
            }
        }
        
        scanner.close();
    }
}
