public class a31 {
    int instvar=9;
    static int rs=100;
    public static void main(String[] args) {
        int loc=111;
        a31 ob=new a31();
        

        System.out.println("local variable is "+loc);
        System.out.println("instance variable is "+ob.instvar);
        System.out.println("static variable is "+a31.rs);
    }
}
