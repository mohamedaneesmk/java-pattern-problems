public class pattern09 {
    public static void main(String[] args) {
        int num = 6;

        for(int row=num;row>0;row--){
            for(int spaces=num-row;spaces>0;spaces--){
                System.out.print(" ");
            }

            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
