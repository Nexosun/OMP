package UE05.Exercise3;

public class TestGroup {
    public static void main(String[] args){             // given test-main-method
        Group<Person> group = new Group<>();
        group.add(new Person("Alice", 25));
        group.add(new Person("Bob", 23));
        group.add(new Person("Carl", 26));
        System.out.println(group.getOldest().getName());
    }
}
