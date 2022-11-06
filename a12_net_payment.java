import java.util.Scanner;


public class a12_net_payment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount: ");
        double am=sc.nextDouble();
        if(am>=20000.0){
            am=am-am*0.20;
        }
        else if(am>=10000 && am<20000){
            am=am-am*0.10;
        }
        else if(am>=5000 && am<10000){
            am=am-am*0.05;
        }

        System.out.println(am);
    }
}
