class Student{
int rollno;
String name;
static String college="ITS";
static void change(){
college="MTIET";
}
Student(int r,String n){
rollno = r;
name = n;
}
void display(){System.out.println(rollno+" "+name+" "+college);}
}
public class StaticMethod{
public static void main(String args[]){
Student.change();
Student s1 = new Student(123,"Thulasi");
Student s2 = new Student(321,"Pooja");
Student s3 = new Student(122,"Shilpa");
s1.display();
s2.display();
s3.display();
}
}