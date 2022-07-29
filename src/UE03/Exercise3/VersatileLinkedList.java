package UE03.Exercise3;

public class VersatileLinkedList extends LinkedStringList {

    public void add(int value){                         // a) convert int to string and add
    add(Integer.toString(value));
    }

    public void add(boolean value) {                // b) convert boolean to string and add
        if (value == true) {
            add("yes");
        }
        else {
            add("no");
        }
    }

    public void add(LinkedStringList value){                        // c all elements of value list get added to this. list
    for(int i = 0; i < value.size(); i++){
        add(value.get(i));
    }
    }

    public void add(LinkedStringList value, int start, int end){            // d)  adds elements from value list (start to end index) to this list
    if(start < end){
        for(int i = start; i < end; i++){
            add(value.get(i));
        }
    }
    }

    public VersatileLinkedList reverse(){                   // e) creates new list in reversed order
        VersatileLinkedList tmp = new VersatileLinkedList();
        for (int i = this.size() - 1; i > 0; i--){
        tmp.add(this.get(i));
        }
        return tmp;
    }

    public boolean equals(VersatileLinkedList value){       // f) compares two lists
        for (int i = 0; i < this.size(); i++){
        if(!this.get(i).equals(value.get(i))){
            return false;
        }
        }
        return true;
    }


    public static void main(String[] args) {
        VersatileLinkedList list = new VersatileLinkedList();       // d) Test
        LinkedStringList listTest = new LinkedStringList();
        listTest.add("a");
        listTest.add("b");
        listTest.add("c");
        listTest.add("d");
        list.add(listTest, 1,3);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));


        VersatileLinkedList reverseList = new VersatileLinkedList();        // e) Test  reverse-Method
        reverseList.add(1);
        reverseList.add(2);
        reverseList.add(3);
        reverseList.add(4);
        VersatileLinkedList newList = reverseList.reverse();

        System.out.println(reverseList.equals(reverseList));


    }

}
