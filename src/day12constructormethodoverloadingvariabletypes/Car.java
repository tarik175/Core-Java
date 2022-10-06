package day12constructormethodoverloadingvariabletypes;

public class Car {

    /*
    1)Constructors are used to create object from a class
    2) Java puts default constructors inside every class
    3) Default constructors does not have any parameters inside the constructor paren thesisS
    4) Constructor names must match with the class names
    5) In a class we can have multiple constructors
    How to create a constructor? I
    1) Type access modifier
    2)TYpe the class name as constructor name
    3) 0pen-close parenthesis
    4) 0pen curly brace press enter

    What are the differences between "constructors andmethods "?
    1) Constructors do not have return type but methods must have
    2) Constructor names must be same with the class name because of that you cannot decide constructor names
        but method names can be assigned by developer .
     */

    String make;
    String model;
    double price;
    int year;





    public Car(){

    }

    public Car(String make, String model,double price,int year){
        this.make=make;
        this.model=model;
        this.year=year;

    }
    public Car(String make, String model){
        this.make=make;
        this.model=model;
    }




    public static void main(String[] args) {
        Car c1=new Car();

    }
}

