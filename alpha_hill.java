import java.util.Scanner;

public class alpha_hill {
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            // space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // alphabet 
            char ch='A';

            for(int j=1;j<=2*i-1;j++){
                System.out.print(ch);
                if(j<=(2*i-1)/2)ch++;
                else ch--;
            }
            // space
            for(int j=1;j<=n-i;j++){
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
