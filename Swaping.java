import  java.util.Scanner;
class Swaping{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.println("Enter a number");
int num1,num2;
num1=scob.nextInt();
num2=scob.nextInt();
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
System.out.println(num1 +" "+ num2);
}
}