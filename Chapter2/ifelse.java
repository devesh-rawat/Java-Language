import java.util.*;
public class Chapter2{
    public static void main(String[] args) {
        System.out.println("This is a ifelse program in java");
        System.out.println("Enter Your Age:");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("You are an Adult");
        }
        else{
            System.out.println("You are not an Adult");
        }
       }


}