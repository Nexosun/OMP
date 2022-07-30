package UE05.Exercise3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Group <T extends Person>{          // extends Person to be able to use getAge method from person
    List<T> group;

    Group(){
    List<T> list = new LinkedList<>();
    this.group = list;
    }

    public List<T> getGroup() {
        return group;
    }

    public void setGroup(List<T> group) {
        this.group = group;
    }

    public void add(T member){
        group.add(member);
    }

    public T getOldest() {
        T oldest = group.get(0);
        for (int i = 0; i < group.size(); i++) {
            if (oldest.isOlder(group.get(i)) == false) {            // uses isOlder Method from person class
                oldest = group.get(i);
            }
        }
        return oldest;
    }


}
