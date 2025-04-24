package pack;

public class Person {private String name;
private int age;
private String address;

// Default constructor (no arguments)
public Person() {
    this.name = "Unknown";
    this.age = 0;
    this.address = "Unknown";
}

// Parameterized constructor (with arguments)
public Person(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
}

// Method to get the name
public String getName() {
    return name;
}

// Method to set the name
public void setName(String name) {
    this.name = name;
}

// Method to get the age
public int getAge() {
    return age;
}

// Method to set the age
public void setAge(int age) {
    this.age = age;
}

// Method to get the address
public String getAddress() {
    return address;
}

// Method to set the address
public void setAddress(String address) {
    this.address = address;
}

// Method to display person information
public void displayPersonInfo() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Address: " + address);
}

public static void main(String[] args) {
    // Create two Person objects using the constructors
    Person person1 = new Person("John Doe", 30, "123 Main St");
    Person person2 = new Person("Jane Smith", 25, "456 Oak Ave");

    // Display the information of the two persons
    System.out.println("Person 1 Information:");
    person1.displayPersonInfo();

    System.out.println("\nPerson 2 Information:");
    person2.displayPersonInfo();

    //Demonstrate the use of getter and setter methods
    person1.setAge(31);
    System.out.println("\nPerson 1's new age: " + person1.getAge());
}
}
