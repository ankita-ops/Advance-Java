package lambda;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
public class MainStream {

        public static void main(String[] args) {

            Person fred = new Person("Fred", "Smith", 56);
            Person maria = new Person("Maria", "Gracia", 43);
            Person rob = new Person("Rob", "Hartman", 36);
            Person ashish = new Person("Ashish", "Hartman", 36);

            List<Person> persons = asList(fred, maria, rob, ashish);

            List<Integer> collect = persons.stream()
                    .map(Person::getAge)
                    .peek(System.out::println)
                    .filter(age -> age > 40)
                    .collect(Collectors.toList());

            System.out.println("AFTER: " + collect);
        }
    }
