//StringBuffer class methods

import java.io.*;
class stringbuffered
{
public static void main(String args[]) throws IOException
{
StringBuffer sb = new StringBuffer();
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("enter surname:");
String first = br.readLine();
System.out.print("enter midname:");
String midname = br.readLine();
System.out.print("enter lastname:");
String last = br.readLine();
sb.append(first);
sb.append(last);
System.out.println("name=" + sb);
int n = first.length();
sb.insert(n, midname);
System.out.println("Full name= " + sb);
System.out.println("In reverse= " + sb.reverse());
}
}

