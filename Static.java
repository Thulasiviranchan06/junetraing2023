//demonstrating the use of static variable
class Student{
int rollno;
String name;
static String college="ITS";
Student(int r,String n){
rollno = r;
name = n;
}
void display(){System.out.println(rollno+" "+name+" "+college);}
}
public class Static{
public static void main(String args[]){
Student s1 = new Student(121,"Thulasi");
Student s2 = new Student(212,"nowhi");
Student.college="MTIET";
s1.display();
s2.display();
}
}