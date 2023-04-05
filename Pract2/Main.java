package Pract2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.SocketHandler;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Human> list = new ArrayList<>();

        list.add(new Human(40, "Иван", "Иваныч", LocalDate.of(1981, 2, 2), 80));
        list.add(new Human(32, "Сергей", "Сергеевич", LocalDate.of(1988, 7, 15), 77));
        list.add(new Human(25, "Аркадий", "Аркадьевич", LocalDate.of(1995, 9, 24), 63));
        list.add(new Human(60, "Алексей", "Алексеевич", LocalDate.of(1960, 5, 10), 50));

        System.out.println("Sort by name:");
        list.stream().sorted(Comparator.comparing(Human::getFirstName)).forEach(System.out::println);



        System.out.println();

        System.out.println("Reverse sort by age:");
        list.stream().sorted(Comparator.comparingInt(Human::getAge).reversed()).forEach(System.out::println);

        System.out.println();

        System.out.println("Sort by birthdate:");
        list.stream().sorted(Comparator.comparing(Human::getBirthDate)).forEach(System.out::println);

        System.out.println();

        System.out.println("average weight = " + list.stream().mapToInt(Human::getWeight).average().orElseThrow());

    }
}
