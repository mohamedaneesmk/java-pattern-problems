public class ZeroTriangle {
    public static void main(String[] args) {
        int num = 5;

        for(int row=1;row<=num;row++){
            for(int col=1;col<=row;col++){
                if(col%2==0)
                    System.out.print(0+" ");
                else 
                    System.out.print(1+" ");
            }
            System.out.println();
        }
    }
}
