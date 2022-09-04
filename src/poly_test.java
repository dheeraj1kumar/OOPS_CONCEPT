//polymorphism

//Method overloading(compile time overriding)



//1====
//public class poly_test {
//    void show(){
//        System.out.println("1");// not any  show() method call because compiler confuse get error
//    }
//    void show(){
//        System.out.println("2");
//    }
//    public static void main(String[] args) {
//        poly_test t=new poly_test();
//        t.show();//no any argument
//
//    }
//}





//2====
//public class poly_test {
//    void show(){
//        System.out.println("1");//this show() method call because no any argument print 1
//    }
//    void show(int a){
//        System.out.println("2");
//    }
//    public static void main(String[] args) {
//        poly_test t=new poly_test();
//        t.show();//no any argument
//
//    }
//}


//3====
//public class poly_test {
//    void show(){
//        System.out.println("1");
//
//    }
//    void show(int a){
//        System.out.println("2");//this show() method call because no any argument print 2 and if pass two parameter
//    }                             //then call one argument then print 1
//    public static void main(String[] args) {
//        poly_test t=new poly_test();
//        t.show(5);//has argument
//
//    }
//}

//
////3=seq. of argu. change
//public class poly_test {
//    void show(int a,String b){
//        System.out.println("1");// this  show() method call because
//    }
//    void show(String b,int a){
//        System.out.println("2");
//    }
//    public static void main(String[] args) {
//        poly_test t=new poly_test();
//        t.show(5,"abc");//any argument
//
//    }
//}

//type of argument


public class poly_test {
    void show(int a){
        System.out.println("1");// not any  show() method call because compiler confuse get error
    }
    void show(String a){
        System.out.println("2");
    }
    public static void main(String[] args) {
        poly_test t=new poly_test();
        t.show(10);//no any argument

   }
}