public class a5_swap {
    public static void main(String[] args) {
        int a=5;
        int b=4;
        System.out.println("value of a before swap "+a);
        System.out.println("value of b before swap "+b);

        //method --1
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("value of a after swap "+a);
        System.out.println("value of b after swap "+b)

System.out.println("swap using mehtod 2---------------------->");
        //method--2
        int a1=10;
        int b1=112;
        System.out.println("value of a1 before swap "+a1);
        System.out.println("value of b1 before swap "+b1);
        a1=a1*b1;
        b1=a1/b1;
        a1=a1/b1;
        System.out.println("value of a1 after swap "+a1);
        System.out.println("value of b1 after swap "+b1);

        
    }
    }

