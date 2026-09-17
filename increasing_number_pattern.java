import java.util.*;

public class increasing_number_pattern {
    public static void pattern(int n){
        int start=1;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(start+" ");                                       
                start=start+1;
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
