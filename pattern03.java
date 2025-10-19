public class pattern03 {
    public static void main(String[] args) {
        int num = 5;
        for(int row=0;row<num;row++){ 
            for(int col=num-row-1;col>0;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
