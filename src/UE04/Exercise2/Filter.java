package UE04.Exercise2;

public abstract class Filter implements Sequence{           // c) abstract filter class

    Sequence sequence;

    Filter(Sequence value){
    this.sequence = value;
}
}
