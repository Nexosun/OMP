package UE04.Exercise2;

public class Naturals implements Sequence{          // b)

    private int value;

    @Override
    public int getNext() {
    return value = this.value + 1;
    }


    public static void main(String[] args){
    Naturals test = new Naturals();
    System.out.println(test.getNext());
    }
}
