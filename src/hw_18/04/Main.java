package hw;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
hw.Address address=new hw.Address("Friedrichstr",12);
        hw.Person person=new hw.Person("Mike",21,address);
        hw.Address address1=new hw.Address("Friedrichstr",34);
        hw.Person person1=new hw.Person("Leon",24,address1);
        hw.Address address2=new hw.Address("Friedrichstr",54);
        hw.Person person2=new hw.Person("Mike",16,address2);
        hw.Address address3=new hw.Address("Friedrichstr",65);
        hw.Person person3=new hw.Person("Mike",14,address3);
        List<hw.Person>personList=Arrays.asList(person,person1,person2,person3);

        System.out.println(getAddresses(personList));


    }

   public static List<hw.Address> getAddresses(List<hw.Person> input) {
        return input.stream()
                        .filter(p -> p.getAge() > 17)
                .map(p->p.getAddress())
                              .collect(Collectors.toList());


    }
    public static long countWords(String input, String letter){
        return Arrays.stream(input.split(" "))
                .filter(s->s.charAt(0)==letter.charAt(0))
                .count();


    }

}
