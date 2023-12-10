package ua.edu.ucu.apps.second;

public class Main {
    public static void main(String[] args) {
        Group<Integer> group = new Group<>();
        group
                .addTask(new Signature<>(System.out::println))
                .addTask(new Signature<>(x -> System.out.println(2 * x)));

        Group<Integer> otherGroup = new Group<>();
        otherGroup
                .addTask(group)
                .addTask(new Signature<>(x -> System.out.println(3 * x)));

        otherGroup.apply(5);
    }
}
