import java.util.Scanner;

public class halfDiamond_star_pyramid {
     public static void pattern(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<=n;i++){
            for(int j=n-1;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        pattern(sc.nextInt());
        sc.close();
    }
}
