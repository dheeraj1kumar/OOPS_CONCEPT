//  READ THE PRICE OF AN ITEM IN DECIMAL FORM(75.95) AND PRINT OUTPUT IN PAISA (LIKE 7595)
import java.util.Scanner;
public class a7_DecimalToPaisa{
    public static void main(String[] args) {
        System.out.println("Enter the price in decimal");
        Scanner sc=new Scanner(System.in);
        double d=sc.nextDouble();
        // double e=323.23;
        String str=String.valueOf(d).replace(".","");
        int i=Integer.valueOf(str);
        System.out.println("price in paisa is"+i);
    }
}

