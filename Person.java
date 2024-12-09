// Constructors Exercise

// Write a Java program to create a class called "Person" with a name and age attribute. 
// Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

public class Person 
{
    private String name;
    private int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;        
    }

    void display()
    {
        System.out.println("Hello! My name is "+name+", and I am "+age+" years old.");
    }

    public static void main(String[] args) 
    {
        Person person1 = new Person("Djem", 19);
        Person person2 =  new Person("Ricky", 18);

        person1.display();
        person2.display();
    }


}