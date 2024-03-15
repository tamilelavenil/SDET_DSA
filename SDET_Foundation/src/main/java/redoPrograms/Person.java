package redoPrograms;

public class Person {
    private String name ="tamil";
    private int age=27;

    // Constructor with two parameters
    public Person(String name, int age) {
        // Use "this" to invoke another constructor in the same class
        this.name = name;
        this.age = age;
    }

    // Constructor with one parameter, invoking the two-parameter constructor
    public Person(String name) {
    	 this(name,0); // Invoking the two-parameter constructor with age set to 0
    }

    // Getter methods
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        // Creating instances of Person
   
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("bob");

        // Displaying information
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");
    }
}

