package UE06.Exercise1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HashMapMultiSet<T> implements MultiSet<T>{
private HashMap hashMap;


    HashMapMultiSet(){
        HashMap hashMap = new HashMap();
        this.hashMap = hashMap;
    }

    @Override
    public void add(T element) {
        if(this.hashMap.get(element) == null){
        this.hashMap.put(element, 1);
        } else {
            int count = count(element);
            count++;
            this.hashMap.put(element, count);
        }
    }

    @Override
    public int count(T element) {
        return (int) this.hashMap.get(element);
    }

    @Override
    public Iterator iterator() {
        return hashMap.keySet().iterator();
    }
}
