package by.academy.java.generic;

public final class PairUtil {

    public static void main(String[] args) {

        Pair<Integer, String> pair = new Pair<>(1, "first number");
        System.out.println(swap(pair));
    }

    public static String swap(Pair<?, ?> pair) {
        return "( " + pair.getValue() + ", " + pair.getKey() + ")";
    }
}
