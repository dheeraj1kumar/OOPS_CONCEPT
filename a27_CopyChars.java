import java.util.Arrays;
import java.util.Scanner;
public class a27_CopyChars {
    public static void main(String[] args) {
        String str="hello how are you?";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the start pos: ");
        int a=sc.nextInt();
        System.out.println("Enter the end pos: ");
        int b=sc.nextInt();
        char []sss=new char[b+1-a];
        //method 1
        // this code will give char array from start index to end index 
       int ind=0;
        for(int i=0;i<str.length();i++){
            if(i<=b&&i>=a){
           sss[ind++]=str.charAt(i);
            }
        }
     System.out.println(Arrays.toString(sss));



    //method 2


        String str1 = "abcdefghijklmnopqrstuvwxyz";
    
       char chArray[] = new char[b-a];
       System.out.println("String: "+str1);
       // copy characters from string into chArray

    //  function-->  str.getChars( 0, str.length(), chArray, 0 );
       str1.getChars( a, b, chArray,0);
       

       System.out.print("Resultant character array...\n");
       System.out.println(Arrays.toString(chArray));

    }
}
