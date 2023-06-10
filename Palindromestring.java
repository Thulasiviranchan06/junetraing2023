import java.util.Scanner;
public class Plindromestring{
public static void main(String args[]){
String n;
String rs=" ";
System.out.print("Enter a string");
n=s.next();
int len=n.length()-1;
for(int i=len;i>=0;i--)
{
rs=rs+n.harAt(i);}
if(n.equals(rs))
{