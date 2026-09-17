import java.util.Scanner;

public class Inverted_Numbered_Right_Pyramid {
    public static void pattern(int n){
        
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(j-i+1);
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
