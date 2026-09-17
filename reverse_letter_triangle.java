import java.util.Scanner;

public class reverse_letter_triangle {
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            int start=1;
            for(int j=n;j>=i;j--){
                char letter=(char)(start-1+'A');
                System.out.print(letter);
                start++;
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
