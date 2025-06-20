import java.util.*;

public class exe5 {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> b = Arrays.asList(3, 4, 5, 6, 7);
        Set<Integer> set = new HashSet<>(a);
        set.retainAll(b);
        System.out.println("Giao nhau: " + set);
    }
}
