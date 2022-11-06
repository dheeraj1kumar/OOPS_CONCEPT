 //print prime number from 1 to 100 using while loop
public class a15 {
    public static void main(String[] args) {
       int b=1;
       while(b<100){
        int i=1;
        int c=0;
        while(i<=b){
            if(b%i==0){
                c++;
                
            }
            i++;

        }
        if(c==2){
            System.out.println(b);
        }
        b++;
       }

    }
}
