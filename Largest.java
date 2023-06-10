import java.util.Scanner;
public class Largest{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i,k,j;
i=sc.nextInt();
k=sc.nextInt();
j=sc.nextInt();
if(i>k&&i>j)
{
System.out.print(i+ "is largest");
}
else if(k>j&&k>i)
{
System.out.print(k+ "is largest");

}
else
{
System.out.print(j+ "is largest");
}
}
 }