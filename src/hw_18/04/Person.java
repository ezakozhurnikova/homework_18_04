package hw;

public class Person {
    String name;
    int age;
    hw.Address address;

    Person(String name, int age, hw.Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public int getAge() {
        return age;
    }

    public hw.Address getAddress() {
        return address;
    }



    @Override
    public String toString() {
        return name + " " + age + " " + address;
    }
}
