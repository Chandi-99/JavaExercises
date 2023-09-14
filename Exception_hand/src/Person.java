class Person {
public void talk(){

    System.out.print("I am a Person");

}
}
class Student extends Person{

    public void talk(){

                System.out.print("I am a Student");

    }

}

public class TestPerson {

    public static void main(String args[]){

                Person p=new Student();

                p.talk();

    }

}