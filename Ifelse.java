import java.util.Scanner;
public class Ifelse{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i;
i=sc.nextInt();
int j;
j=sc.nextInt();
if(j==0)
{
System.out.print("Division by error");
}
else
{
System.out.print(i+"division by "+j+" is "+(i/j));
i=i+j;
}
}
}