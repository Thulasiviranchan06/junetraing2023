import java.util.Scanner;
class Print_stars
{
public static void Print_multiple_stars(int i)
{
int k=1;
for(;k<=i;k=k+1)
System.out.print("*");
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int j;
j=sc.nextInt();
Print_multiple_stars(j);
 System.out.println(" ");
} 
}
