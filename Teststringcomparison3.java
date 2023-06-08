public class Teststringcomparison3{
public static void main(String args[]){
String s1="sachin";
String s2="Sachin";
String s3=new String("sachin");
String s4= "saurov";
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s3));
}
}


