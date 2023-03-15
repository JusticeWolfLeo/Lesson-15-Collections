import java.util.HashMap;
import java.util.Map;

public class MapsPractice {
    public static void main(String[] args) {
        char[] chr = "Hello world".toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (var i : chr) {
            if (map.containsKey(i)) {
                map.replace(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        System.out.println(map);
    }
}
/*
    String string = new String("Hello world");
    String[] Split = string.split("");
    Map<String, Integer> map = new HashMap<>();
        for (var i : Split) {
                if (map.containsKey(i)) {
                map.replace(i, map.get(i) + 1);
                } else {
                map.put(i, 1);
                }
                }
                System.out.println(map);
*/