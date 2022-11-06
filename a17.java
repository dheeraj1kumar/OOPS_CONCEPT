//palindrome
public class a17 {

    public static void main(String[] args) {
        int n=1001;
        int c=n;
        int sum=0,rev=0,rem=0;

        do{
            rem=rev*10+n%10;
            rev=rem;
            n/=10;
        }while(n!=0);
if(rev==c){
    System.out.println("Palindrome");
}
else{
    System.out.println("Not palindrome");
}
    }
}
