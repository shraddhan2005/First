
class Study{
    String name;
    int age;
    String dob;
    Study(String n,int a,String d){
        this.name=n;
        this.age=a;
        this.dob=d;
    }
    void display(){
            System.out.println("name:"+name);
            System.out.println("age:"+age);
            System.out.println("dob:"+dob);
        } 
    }
    class Course{
        void show(){
    System.out.println("maths:021");
    System.out.println("BDA:022");
    System.out.println("Devops:023");
}
}

public class Student{
    public static void main(String[] args){
        Study s1=new Study ("alice",19,"20-07-2005");
        Course c1 =new Course();
        s1.display();
        c1.show();
    }

}
