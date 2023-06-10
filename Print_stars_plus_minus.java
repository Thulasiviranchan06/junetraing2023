import java.util.Scanner;
class Print_stars_plus_minus
{
public static void Print_multiple_chars(int i,char c)
{
int k;
for(k=1;k<=i;k=k+1)
System.out.print(c);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int j;
j=3;

Print_multiple_chars(j,'*');
Print_multiple_chars(j+1,'@');
Print_multiple_chars(j-2,'$');
System.out.print(" ");
}
}