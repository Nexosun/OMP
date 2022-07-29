package UE02.Exercise2;

public class Dance {
private String name;
private Beat beat;
private Figure[] figures;

    public Dance(String name){
        this.setName(name);
    }
    public Dance(){};
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBeat(Beat beat) {
        this.beat = beat;
    }

    public Beat getBeat() {
        return beat;
    }

    public void setFigures(Figure[] figures) {
        this.figures = figures;
    }

    public Figure[] getFigures() {
        return figures;
    }
}
