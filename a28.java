public class a28 {
    private String name;
    a28(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public static void main(String[] args) {
        a28 ex=new a28("Kanishk Patel");
        System.out.println(ex.getName());
// Here, we can update the name using the setName method. 
        ex.setName("Ritik Chauhan");
        System.out.println(ex.getName());
    }
}



    