package UE02.Exercise2;

public class Figure {
private String name;
private String description;
private Figure[] sequence;

    public Figure(){};

    public Figure(String name){
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    public void setSequence(Figure[] sequence) {
    for(int i = 0; i < sequence.length; i++){
        if(this.getName() == sequence[i].getName()){
        System.out.println("Error: " + this.getName() + " duplicate found");
        break;
        }
    }
        this.sequence = sequence;
    }
    public Figure[] getSequence() {
        return sequence;
    }

    public boolean add(Figure figure){                     // returns false and doesnt add figure when duplicate found
        for (int i = 0; i < this.getSequence().length; i++){
        if(figure.getName() == this.getSequence()[i].getName()){
            System.out.println("fail");
            return false;
        }
        }
        Figure[] tmp = new Figure[this.getSequence().length + 1];
        tmp = this.getSequence();
        tmp[tmp.length - 1] = figure;
        this.setSequence(tmp);
        System.out.println("success");
        return true;
    }

}
