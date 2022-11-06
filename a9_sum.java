//sum of two numbers using command line

public class a9_sum {
    public static void main(String[] args) {  
        int x=Integer.parseInt(args[0]);   //convert it in int because it's default value in String 
        int y=Integer.parseInt(args[1]);
        System.out.println("sum of x+y is"+x+y);


        //run -->
        //javac a9_sum.java
        //java a9_sum  2 3
        //output --> we will get sum of 2 and 3
    }
}
