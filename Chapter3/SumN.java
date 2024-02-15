import java.util.*;
public class SumN {
    public static void main(String[] args) {
        System.out.println("This is a program for Sum of N natural Number");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;

        }
        System.out.println("The Sum of "+n+" Natural Numbers is "+sum);
        sc.close();

    }
    
}
