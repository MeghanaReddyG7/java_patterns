import java.util.*;

public class increasing_letter_triangle {
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){  //for(char ch='A';ch<='A'+i;ch++){ sout(ch)}
                char letter=(char)(j-1+'A');
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
