package de.ait.generics;

public class SimplePairApp {
    public static void main(String[] args) {
        SimplePair<Integer, String> pair = new SimplePair<>(1, "Hallo");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        System.out.println("---------------------------");
        SimplePair<String, Integer> pair2 = new SimplePair<>("Hallo", 1);
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
    }
}
