import java.util.Scanner;
class Pattern16{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
char ch=sc.next().charAt(0);
n=sc.nextInt();
for(int i=1;i<=n;i++){
for(int j=i;j<n;j++){
System.out.print("#");
}
for(int j=1;j<=i;j++){
System.out.print(ch);
}
System.out.println();
}
}
}