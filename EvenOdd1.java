import java.util.Scanner;
public class EvenOdd1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter a number");
n=sc.nextInt();
if(n%2*2==n)
{
System.out.println("even\n");
}
else
{
System.out.println("odd\n");
}
}
}