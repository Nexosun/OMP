package UE04.Exercise2;

public class ZapMultiples extends Filter{           // d)  Filter with basicNumber being the number filtered out of the Sequence
    int basicNum;
    int value;

    ZapMultiples(Sequence value) {
        super(value);
    }

    public ZapMultiples(int basicNumber, Sequence sequence) {
        super(sequence);
        this.basicNum = basicNumber;
        this.calcNextInt();
    }



    @Override
    public int getNext() {
    int result = this.value;
    this.calcNextInt();
    return result;
    }

    private void calcNextInt(){
    while (true){
        this.value = this.sequence.getNext();
        if(this.value % this.basicNum != 0){
            break;
        }
    }
    }


    public static void main(String[] args) {
    new ZapMultiples(3 , new Naturals());
    }
}
