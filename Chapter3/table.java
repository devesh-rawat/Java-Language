import java.util.*;
public class table {
    public static void main(String[] args) {
        System.out.println("Program to print the Table of a Number");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number");
        int n=sc.nextInt();
        for(int i=1;i<11;i++){ 
            System.out.println(n +" X "+i+" = "+n*i);
        }
        // for(; ;) {
        //     System.out.println("Apna College");
        // }
        sc.close();

        }
    
}
