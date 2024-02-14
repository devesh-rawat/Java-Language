import java.util.*;
public class relational {
    public static void main(String[] args) {
        System.out.println("This is relational operator based program");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1");
        int a=sc.nextInt();
        System.out.println("Enter Number 2");
        int b=sc.nextInt();
        if(a==b){
            System.out.println("A==B");
        }
        else{
            if(a>b){
                System.out.println("a>b");
            } 
            else{
                System.out.println("a<b");
            }       }
            sc.close();


    }
    
}
