class Cns{
    int roll;
    int age;
    String name;
Cns(){
        System.out.println("default constructor");
    }
    Cns(int a,String n){
        roll=a;
        name=n;
        System.out.println("Student roll no : "+roll+"  And Student name is :"+name);
    }
    Cns(int a,int b,String n){
        roll=a;
        age=b;
        name=n;
        System.out.println("Student roll no is :"+roll+" Student name is : "+name+" Student age is: "+age);
    }
}
public class a39_constructorOverloading {
    public static void main(String[] args) {
        Cns s1=new Cns();
        Cns s2=new Cns(5, "kanishk");
        Cns s3=new Cns(124,15,"kanishk patel");
    }
}
