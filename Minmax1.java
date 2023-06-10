import java.util.Scanner;
public class Minmax1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i;
i=sc.nextInt();
int j;
j=sc.nextInt();
if(i<j)
{
System.out.println(i+"is min\n");
}
else{
System.out.println(j+" is max\n");
}
}
}