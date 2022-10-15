package objectmanipulations;

public class Person {

    public String name;
    public String lastname;
    private int id;
    private int age;
    private double salary;

    public Person(){

    }

    public Person(String name, String lastname){
        this.name=name;
        this.lastname=lastname;

    }

    public static void main(String[] args) {
        Person person=new Person("Maha","Wael");

        System.out.println(person.name);
        System.out.println(person.lastname);




    }



}
