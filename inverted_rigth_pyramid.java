import java.util.Scanner;

public class inverted_rigth_pyramid {
    public static void pattern(int n){
        for(int i=0;i<=n;i++){
            for(int j=n;j>i;j--){
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
