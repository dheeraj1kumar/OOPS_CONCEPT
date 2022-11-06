public class a29_StringBuffer {
    

    public static void main(String args[])
    {
        StringBuffer sb0 = new StringBuffer("Hello ");
        sb0.append("Java"); // now original string is changed
        System.out.println(sb0);

        // insert() method
        StringBuffer sb1 = new StringBuffer("Hello ");
        sb1.insert(1, "Java");
        // Now original string is changed
        System.out.println(sb1);

        //replace() method
        
            StringBuffer sb2=new StringBuffer("Hello"); 
            sb2.replace(1,3,"Java"); 
            System.out.println(sb2);

        //4) delete() method
       
            StringBuffer sb3=new StringBuffer("Hello"); 
            sb3.delete(1,3); 
            System.out.println(sb3);

            // 5) reverse() method
            StringBuffer sb5 = new StringBuffer("Hello");
        sb5.reverse();
        System.out.println(sb5);

        //6) capacity() method
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // default 16
        sb.append("Hello");
        System.out.println(sb.capacity()); // now 16
        sb.append("java is my favourite language");
        System.out.println(sb.capacity());
        // Now (16*2)+2=34     i.e (oldcapacity*2)+2
    }
}

