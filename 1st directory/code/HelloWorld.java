import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("You will see 'Hello World!' 7 times: ");
        for (int i = 0; i < 7; i++) {
            System.out.println("Hello World!");


        }
        List<Integer> integerList = new ArrayList<>(List.of(12, 42, 23, 545));
        Collections.sort(integerList);
        integerList.forEach(System.out::println);
    }


}
