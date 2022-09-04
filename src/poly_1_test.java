//method over riding

public class poly_1_test {
    void Show(int a){
        System.out.println("1");

}        }                                           //same argument
                                                    //1-no. of arg
                                                     //2-type of arg
class xyz extends poly_test {                       //3-seq of arg
    void show(int a) {
        System.out.println("2");
    }  

    public static void main(String[] args) {
        poly_test t = new poly_test();
        t.show(1);
        xyz t1=new xyz();
        t1.show(1);
    }}

