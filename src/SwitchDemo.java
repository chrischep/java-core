class MultiDimArrayDemo {
    public static void main(String[] args) {
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]); 
           }
}
class ArrayCopyDemo {
    public static void main(String[] args) {
        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto" };
        
        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");           
        }
    }
}

class ConcatDemo {
    public static void main(String[] args){
        String firstString = "This is";
        String secondString = " a concatenated string.";
        String thirdString = firstString+secondString;
        System.out.println(thirdString);
    }
}
class UnaryDemo {

    public static void main(String[] args) {

        int result = +1;
        // result is now 1
        System.out.println(result);

        result--;
        // result is now 0
        System.out.println(result);

        result++;
        // result is now 1
        System.out.println(result);

        result = -result;
        // result is now -1
        System.out.println(result);

        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);
    }
}



class ComparisonDemo {

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        if(value1 == value2)
            System.out.println("value1 == value2");
        if(value1 != value2)
            System.out.println("value1 != value2");
        if(value1 > value2)
            System.out.println("value1 > value2");
        if(value1 < value2)
            System.out.println("value1 < value2");
        if(value1 <= value2)
            System.out.println("value1 <= value2");
    }
}
class ConditionalDemo2 {

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = true;
        result = someCondition ? value1 : value2;

        System.out.println(result);
    }


}

public class SwitchDemo {
    public static void main(String[] args) {

        int month = 8;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);
    }
}

class WhileDemo {
    public static void main(String[] args){
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
    }
}
class DoWhileDemo {
    public static void main(String[] args){
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    }
}
class ForDemo {
    public static void main(String[] args){
         for(int i=1; i<11; i++){
              System.out.println("Count is: " + i);
         }
    }
}
class EnhancedForDemo {
    public static void main(String[] args){
         int[] numbers = 
             {1,2,3,4,5,6,7,8,9,10};
         for (int item : numbers) {
             System.out.println("Count is: " + item);
         }
    }
}
class BreakDemo {
    public static void main(String[] args) {

        int[] arrayOfInts = 
            { 32, 87, 3, 589,
              12, 1076, 2000,
              8, 622, 127 };
        int searchfor = 12;

        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchfor) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at index " + i);
        } else {
            System.out.println(searchfor + " not in the array");
        }
    }
}
class Car {
    String brand;

    // Constructor
    Car(String b) {
        brand = b;
        System.out.println("Car constructor called.");
    }

    // Method
    void displayBrand() {
        System.out.println("Car brand: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota"); // Constructor is called automatically
        myCar.displayBrand(); // Method must be called explicitly
    }
}
class Car {
    String brand;

    // Constructor
    Car(String brand) {
        this.brand = brand;
    }

    void display() {
        System.out.println("Car brand: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota"); // Object initialization
        myCar.display();
    }
}
class Dog {
    String name;
    int age;
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Object created
        myDog.name = "Buddy";  // Assigning values manually
        myDog.age = 3;
        
        System.out.println("Dog Name: " + myDog.name + ", Age: " + myDog.age);
    }
}
class MathOperations {
    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        math.add(5, 10); // Passing parameters
    }
}
CALLING STATIC METHODS WITHOUT CREATING AN OBJECT 
class MathUtils {
    // Static method
    static int square(int num) {
        return num * num;
    }
}

public class Main {
    public static void main(String[] args) {
        int result = MathUtils.square(5); // Calling static method without creating an object
        System.out.println("Square of 5: " + result);
    }
}
class MathHelper {
    // Static methods
    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Addition: " + MathHelper.add(3, 7));
        System.out.println("Multiplication: " + MathHelper.multiply(4, 5));
    }
}
Calling a Static Method from Another Static Method
class Greeting {
    static void sayHello() {
        System.out.println("Hello, world!");
    }

    static void welcomeMessage() {
        sayHello(); // Calling another static method
        System.out.println("Welcome to Java programming.");
    }
}

public class Main {
    public static void main(String[] args) {
        Greeting.welcomeMessage(); // Calling the static method
    }
}
code practice on objects
class Person{
    String name;
    int age;

   Person (String name, int age){
    this.name = name;
    this.age = age;
   }
   void display() {
    System.out.println("name:" + name +",age:" +age);
   }
}
public class Main{
    public static void main (String[] args){
     Person p1 = new Person("christine", 26);
     p1.display();
    }
}

class Animal{
    String name;

    Animal(){
        name = "unknown";
        System.out.println("default constructor called");
    }
    void display(){
        System.out.println("Animal name " + name);
    }
}
public class Main{
    public static void main(String[] args){
        Animal a1 = new Animal();
        a1.display();
    }
}

class Student {
    String name;
    int age;
     
    Student(String name, int age){
        this.name = name;
        this.age = age;
        }
    void display(){
        System.out.println("student name is " + name + " and age is " + age);
    }
}
public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("joy", 45);
        Student s2 = new Student("crispus", 56);
        s1.display();
        s2.display();
    }
}

class MathOperations{
    int square(int num) {
        return num * num;
    }
}
public class Main {
public static void main(String[] args) {
    MathOperations math = new MathOperations();
    int result = math.square(5);
    System.out.println("square of 5 " + result);
}
    
}
class Person{
    String name;

    Person(String name){
        this.name = name;
    }

    Person getPerson(){
        return this;
    }
    void display(){
          System.out.println("person name:" + name);
    }
}
public class Main {
public static void main(String[] args) {
    Person p1 = new Person("john");
    Person p2 = p1.getPerson();
    p2.display();
}
    
}
class Outer{
    private String message = "hello from inner class";

    class Inner{
        void display(){
            System.out.println(message);
        }
    }
}
public class Main {
public static void main(String[] args) {
    Outer outer = new Outer();
    Outer.Inner inner = outer.new Inner();
    inner.display();
}
    
}
class Outer{
    static String message = "hello from static nested class";

    static class Nested{
        void display() {
            System.out.println(message);
        }
    }
}
public class Main {
public static void main(String[] args) {
    Outer.Nested obj = new Outer.Nested();
    obj.display();
}
    
}
public class DataStructure {
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure(){
        for(int i = 0; i < SIZE; i++){
            arrayOfInts[i] = i;
        }

    }
    public void printEven(){
        DataStructureIterator iterator = this.new EvenIterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+ "");
        }
        System.out.println();
    }
    interface DataStructureIterator extends java.util.Iterator<Integer> {}
    private class EvenIterator implements DataStructureIterator{
        private int nextIndex = 0;
        public boolean hasNext(){
            return(nextIndex <= SIZE - 1);
        }
        public Integer next(){
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            nextIndex += 2;
            return retValue;
        }
    }
    public static void main(String s[]) {
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}
class Outer {
    void outerMethod(){

        class Local{
            void display(){
                System.out.println("hello from local class");
            }
        }
        Local obj = new Local();
        obj.display();
    }
}
public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerMethod();
    }

    
}
abstract class Animal{
    abstract void makeSound();
}
public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal() {
            void makeSound(){
                System.out.println("woof woof");
            }
        };
        dog.makeSound();
    }
}
interface MathOperation{
    int operate(int a, int b);
}
public class Main {

    public static void main(String[] args) {
        MathOperation addition = new MathOperation() {
            int factor = 10;

            public int operate(int a, int b){
                return (a+b) * factor;
            }
        };
        System.out.println(addition.operate(5, 3));
    }
}
@FunctionalInterface
interface Greeting {
    void sayHello();
}
public class Main {

    public static void main(String[] args) {
        Greeting greet = () -> System.out.println("hello java lambda");
        greet.sayHello();
    }
}
class Animal{
    void eat(){
        System.out.println("this animal eats food");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("dog barks");
    }
}
public class Main {

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();
    }
}
 class Vehicle{
    int speed;
    int fuelCapacity;

    Vehicle(int speed, int fuelCapacity){
        this.speed=speed;
        this.fuelCapacity=fuelCapacity;
    }
    void display(){
        System.out.println("Car speed: "+ speed +"km/h");
        System.out.println("Fuel capacity: "+ fuelCapacity +"litres");
    }
}
class Car extends Vehicle{

    int numDoor;
    Car(int speed, int fuelCapacity, int numDoor){
        super(speed, fuelCapacity);
        this.numDoor=numDoor;

    }
    void display(){
        super.display();
        System.out.println("Number of doors: "+numDoor);
    }
}
public class Main {

    public static void main(String[] args) {
       Car myCar = new Car(120, 50, 4);
       myCar.display();
    }
}
class BankAccount{
   
    double getInterestRate(){
       return 3.0;
    }
}
class SavingsAccount extends BankAccount{
    @Override
    double getInterestRate(){
        return 5.0;
    }

}
public class Main {

    public static void main(String[] args) {
        SavingsAccount savingsAccount= new SavingsAccount();
        BankAccount bankAccount= new BankAccount();

        System.out.println("bank interest rate:" +bankAccount.getInterestRate()+ "%");
        System.out.println("savings account interest rate:"+savingsAccount.getInterestRate()+"%");
        
    }
}
abstract class Shape{
    abstract double area();
}
class Circle extends Shape {
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    double area(){
        return 3.14 *radius*radius;
    }
}
abstract class Animal{
    abstract void makeSound();

    void sleep(){
        System.out.println("sleeping");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("woof woof");
    }
}
public class Main {

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.sleep();
    }
}
interface Vehicle{
    void move();
}
class Car implements Vehicle{
    public void move() {
        System.out.println("car is moving on four wheels");
    }
}
class Bike implements Vehicle{
    public void move(){
        System.out.println("bike is moving on two wheels");
    }
}
public class Main {

    public static void main(String[] args) {
        Vehicle myCar=new Car();
        Vehicle myBike=new Bike();
        myBike.move();
        myCar.move();
    }
}
abstract class Appliance{
    abstract void turnOn();

    void turnOff(){
        System.out.println("Appliance is turned off.");
    }
}
class Fan extends Appliance{
void turnOn(){
    System.out.println("Fan is now running");
}
}
class WashingMachine extends Appliance{
    void turnOn(){
        System.out.println("washing machine is now washing clothes");
    }
}
public class Main {

    public static void main(String[] args) {
        Fan myFan = new Fan();
        WashingMachine wMachine = new WashingMachine();
        myFan.turnOn();
        myFan.turnOff();
        wMachine.turnOn();
        wMachine.turnOff();
    }
}



interface Playable{
    void play();
}
class Guitar implements Playable{
    public void play(){
        System.out.println("Playing the guitar music!");
    }
}
class Football implements Playable{
    public void play(){
        System.out.println("Playing a football match!");
    }
}
public class Main {

    public static void main(String[] args) {
        Guitar g1 = new Guitar();
        Football f1 = new Football();
        g1.play();
        f1.play();
    }
}
abstract class Transport{
    abstract void speed();
}
interface Fuel{
    void fuelType();
}
class Car extends Transport implements Fuel{
    public void speed(){
        System.out.println("Car speed: 100 km/h");
    }
    public void fuelType(){
        System.out.println("Car fuel type: Petrol");
    }
}
public class Main {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.speed();
        myCar.fuelType();
    }
}
public class Main {

    public static void main(String[] args) {
        try {
            int result = 10/0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        }
    }
}
public class FinallyExample{
    public static void main(String[] args) {
        try {
            int num = 10 / 2;
            System.out.println(num);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught!");
        } finally{
            System.out.println("This will always execute");
        }
    }
}
