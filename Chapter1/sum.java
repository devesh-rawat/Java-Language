import java.util.Scanner;
public class sum{
    public static void main(String[] args) {
        System.out.println("This is a program for Adding of Two Number inputed by the user");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number :");
        int a=sc.nextInt();
        System.out.print("Enter Second Number");
        int b=sc.nextInt();
        System.out.println("The Sum of the Two Numbers is "+(a+b));
        sc.close();
    }
}