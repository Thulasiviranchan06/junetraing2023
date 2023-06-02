import  java.util.Scanner;
class InputMonthNumber1{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int mn;
mn=scob.nextInt();
switch(mn){
case 0:System.out.println("JAN");
case 1:System.out.println("FEB");
case 2:System.out.println("MAR");
case 3:System.out.println("APR");
case 4:System.out.println("MAY");
case 5:System.out.println("JUN");
case 6:System.out.println("JULY");
case 7:System.out.println("AUG");
case 8:System.out.println("SEPT");
case 9:System.out.println("OCT");
case 10:System.out.println("NOV");
case 11:System.out.println("DEC");
default:System.out.println("INVALID");
}
}
}