public class Teststringcomparison2{
public static void main(String args[]){
String s1="sachin";
String s2="sachin";
String s3=new String("Sachin");
String s4= "saurov";
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s3));
System.out.println(s1.equals(s4));
}
}


