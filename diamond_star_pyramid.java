import java.util.Scanner;

public class diamond_star_pyramid {
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            // space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // star
            for(int j=1;j<2*i;j++){
                System.out.print("*");
            }
            // space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++){
            // space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            // star
            
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
                
            }
            // space
            for(int j=0;j<i;j++){
                System.out.print(" ");
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
