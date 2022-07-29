package UE04.Exercise1;

public abstract class Function {
    protected Function previous;

    Function(){
        this.previous = null;
    }
    Function(Function value){
        this.previous = value;
    }

    public double calculate(double value){
        if(this.previous != null){
            value = this.previous.calculate(value);
        }
    return value;
    }


    public static void main(String[] args) {
        Function chain = new CosineFunction(new SquareRootFunction(new SineFunction()));        // function chain goes to the back and then calculates each step and goes to the front
        System.out.println(chain.calculate(1));
    }
}
