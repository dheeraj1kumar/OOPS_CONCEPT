//factorial using for loop
import java.util.*;
public class a16_factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find factorial: ");
        int n=sc.nextInt();
        int fact=1;
        for(int i=n;i>0;i--){
            fact*=i;
            }
            System.out.println(fact);
        }
    }

