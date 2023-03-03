import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollSort {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        int number;
        for (int counter = 1; counter <= 20; counter++) {
            number = random.nextInt(100);
            if (list.contains(number)) { //если уже такое число есть то генерируем другое
                number = random.nextInt(100);
            }
            list.add(number);
        }
        Collections.sort(list);
        System.out.println(list);
    }
}

