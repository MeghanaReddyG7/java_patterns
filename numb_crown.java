import java.util.*;

public class numb_crown {
    public static void pattern(int n){        
        for(int i=1;i<=n;i++){
        // number
           for(int j=1;j<=i;j++){
                System.out.print(j);
            }
        
        // space
            for(int j=1;j<=(2*n)-(2*i);j++){
                System.out.print(" ");
            }

        // number

            for(int j=i;j>=1;j--){
                System.out.print(j);
                
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
