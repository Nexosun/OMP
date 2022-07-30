package UE06.Exercise1;

public interface MultiSet<T> extends Iterable<T>{
void add(T element);       // add elements
int count(T element);      // count of an Element

}
