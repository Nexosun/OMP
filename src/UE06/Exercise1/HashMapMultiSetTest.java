package UE06.Exercise1;

public class HashMapMultiSetTest {
    public static void main(String[] args) {
        HashMapMultiSet hMapTest = new HashMapMultiSet();
        hMapTest.add("a");
        hMapTest.add("a");
        hMapTest.add("b");
        System.out.println(hMapTest.count("a"));
        hMapTest.iterator();         // Iterator needs real implementation (returns keyset but doesnt iterate with print)
    }
}
