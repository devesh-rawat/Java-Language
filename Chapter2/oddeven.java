import java.util.*;
public class oddeven {
    public static void main(String[] args) {
        System.out.println("This is an Odd Even Program");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Number");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("The Number Entered is Even");
        }
        else{
            System.out.println("The Number Entered is Odd");
        }
        sc.close();


    }
    
}
