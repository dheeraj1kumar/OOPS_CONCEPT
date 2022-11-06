class student{
    int roll_no;
    int phoneno;
    String name;
    String address;

    public  void printdet(int roll_no,int phoneno,String name,String address){
        System.out.println(roll_no+phoneno+name+address);
    }
}


public class a32 {
   public static void main(String[] args) {
    student s1=new student();
    student s2=new student();
  
    s1.printdet(21000505, 91401756, "Kanishk","kannauj");
    s2.printdet(21000404, 91414545, "Tanishk","Kanpur");   

} 
}
