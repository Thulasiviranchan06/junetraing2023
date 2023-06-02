//java program to input a string
import java.util.*;
public class Program207
{
public static void main(String[]args)
{char ch;
System.out.print("Enter your character:");
Scanner sc = new Scanner(System.in);
ch= sc.next().charAt(0);
System.out.println();
if((ch>='a'&&ch<='z'))
System.out.println(ch+"is a alphabet");
else if((ch>='1'&&ch<='9'))
System.out.println(ch+"is a digit");
else{
System.out.println(ch+"is a spl character");
}
}
}