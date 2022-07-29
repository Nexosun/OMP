package UE04.Exercise1;

public class SquareRootFunction extends Function{
    SquareRootFunction(){
        super();
    }
    SquareRootFunction(Function previous){
    super(previous);
    }

    @Override
    public double calculate(double value){
    value = super.calculate(value);
    return Math.sqrt(value);
    }
}
