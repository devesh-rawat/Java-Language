import java.util.*;
public class Switchdemo {
    public static void main(String[] args) {
        System.out.println("Switch used Program");
        System.out.println("Options:");
        System.out.println("1:Namastey");
        System.out.println("2:Bonjour");
        System.out.println("3:Hello");
        System.out.println("Enter Your Choice");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        switch(ch){
            case 1:System.out.println("Namastey");
                    break;
            case 2:{System.out.println("Bonjour");}
                    break;
            case 3:{System.out.println("Hello");
                    break; }      
            default:System.out.println("Invalid Choice"); }
        sc.close();
        
    }
    

    
}
