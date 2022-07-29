package UE04.Exercise1;

public class SineFunction extends Function{
    SineFunction(){
        super();
    }
    SineFunction(Function previous){
        super(previous);
    }

    @Override
    public double calculate(double value){
        value = super.calculate(value);
        return Math.sin(value);
    }
}
