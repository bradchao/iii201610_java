package tw.org.iii.javatest;

/**
 * Created by user01 on 2016/11/4.
 */
public class Brad24 {
    public static void main(String[] args){
        System.out.println(Person.getCounter());
        Person p1 = new Person("Brad");
        Person p2 = new Person("Brad");
        Person p3 = new Person("Brad");
        System.out.println(Person.getCounter());
        //p1.sayYa();
    }
}
class Person{
    String name;
    static private int counter;
    Person(String name){
        this.name = name;
        counter++;
    }
    void sayYa(){
        System.out.println(name + ":Ya");
    }
    static int getCounter(){
        return counter;
    }
}
