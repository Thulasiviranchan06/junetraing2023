import  java.util.Scanner;
class InputDayNumber2{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int dn;
dn=scob.nextInt();
switch(dn){
case 0:System.out.println("SUNDAY");break;
case 1:System.out.println("MONDAY");break;
case 2:System.out.println("TUESDAY");break;
case 3:System.out.println("WEDNESDAY");
case 4:System.out.println("THURSDAY");
case 5:System.out.println("FRIDAY");
case 6:System.out.println("SATURDAY");
default:System.out.println("INVALID");
}
}
}