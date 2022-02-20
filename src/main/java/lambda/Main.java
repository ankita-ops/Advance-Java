package lambda;

import javax.swing.plaf.basic.BasicListUI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {
        List<Integer> integers = asList(1, 2, 3, 4, 5);

//    for (Integer i = 0; i < integers.size() ; i++) {
//      if(integers.get(i) > 3 && i != (integers.size() - 1)) {
//        newList.add(integers.get(i) * 2);
//      }
//    }

        List<Integer> newList = integers.stream()
                .filter(i -> i > 3)
                .map(i -> i * 2)
                .limit(1)
                .collect(Collectors.toList());

        System.out.println("OLD: " + integers);
        System.out.println("NEW: " + newList);
    }
}
