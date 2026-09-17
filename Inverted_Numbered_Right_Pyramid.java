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
        System.out.println("Enter number of test cases: ");
        int testcases=sc.nextInt();
        for(int i=0;i<testcases;i++){     
        int n=sc.nextInt();                         
        System.out.println("for " + (i+1) + " test case pattern is below!"); 
        System.out.println();
        pattern(n);
        }
        sc.close();
    }
}
