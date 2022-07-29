package UE04.Exercise1;

public class CosineFunction extends Function{
    CosineFunction(){
        super();
    }
    CosineFunction(Function previous){
        super(previous);
    }

    @Override
    public double calculate(double value){
    value = super.calculate(value);
    return Math.cos(value);
    }
}
