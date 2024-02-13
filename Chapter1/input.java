import java.util.*;
public class input {
    public static void main(String[] args) {
        
        System.out.println("This is a program for input in java");
        System.out.print("Enter a Name:");
        Scanner Sc=new Scanner(System.in);
        String a=Sc.nextLine();
        System.out.println("This value "+a+" is inputted by the user" );
        Sc.close();
    }
    
}
