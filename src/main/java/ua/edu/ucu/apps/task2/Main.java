package ua.edu.ucu.apps.task2;

public class Main {
    public static void main(String[] args) {
        Group<Integer> group = new Group<>();
        group
                .addTask(new Signature<>(System.out::println))
                .addTask(new Signature<>(x -> System.out.println(2 * x)));

        Group<Integer> group2 = new Group<>();
        group2
                .addTask(group)
                .addTask(new Signature<>(x -> System.out.println(3 * x)));

        group2.apply(5);
    }
}
