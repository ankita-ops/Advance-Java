package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
public class Runner {

  public static void main(String[] args) {
    Person fred = new Person("Fred", "Smith", 56);
    Person maria = new Person("Maria", "Gracia", 43);
    Person rob = new Person("Rob", "Hartman", 36);

    Person[] persons = {fred, maria, rob};

    Comparator<Person> agecomparator = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());
    Comparator<Person> namecomparator = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());


    Arrays.sort(persons, namecomparator.thenComparing(agecomparator));
    for (Person p : persons) {
      System.out.println(p);
    }

    // TODO: Write comparators (firstname and age) for Person using lambda expressions.
    //  Apply comparators for sorting person list
    //  When the age is same, it should compare the firstname
  }

}
