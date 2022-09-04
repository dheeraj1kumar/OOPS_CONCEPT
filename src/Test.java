////constructor;=>initialize an object,no any value return type
////public class Test
////{                  //without used constructor
////    String name;
////    int emp_id;
////
////    public static void main(String[] args) {
////        Test e1=new Test();
////        Test e2=new Test();
////        System.out.println("Employee 1 :"+e1.name+" "+e1.emp_id);//print same value
////        System.out.println("Employee 2 :"+e2.name+" "+e2.emp_id);
////
////    }}
//
////used constructor
//public class Test
//{
//    String name;
//    int emp_id;
//    Test(String name,int emp_id){
//        this.name=name;
//        this.emp_id=emp_id;
//    }
//    public static void main(String[] args) {
//        Test e1=new Test("deepak",101);
//        Test e2=new Test("abc",102);
//        System.out.println("Employee 1 :"+e1.name+" "+e1.emp_id);
//        System.out.println("Employee 2 :"+e2.name+" "+e2.emp_id);
//    }}






//Type of constructor:

//1= DEFAULT CONSTRUCTOR
//
//public class Test {
//
//    int i;
//    String s;
//
//    //create compiler  default constructor himself
//    public static void main(String[] args) {
//
//        Test t=new Test();
//        System.out.println(t.i);
//        System.out.println(t.s);
//    }
//}




//2=  NO ARGUMENT CONSTRUCTOR(USER DEFINE CONSTRUCTOR)
//public class Test{
//    Test(){
//        System.out.println("No arg. constructor");
//    }
//    public static void main(String[] args) {
//         Test t=new Test();
//
//     }}




//3=PARAMETRIC CONSTRUCTOR
public class Test{
    int id;
    Test(int a){
        id=a;
        //System.out.println("No arg. constructor "+a);
    }
    public static void main(String[] args) {
        Test t=new Test(10);//passing value
        System.out.println(t.id);

    }}