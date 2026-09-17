import java.util.Scanner;

public class alpha_ramp_pattern {
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                char letter=(char)(i-1+'A');
                System.out.print(letter);
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
