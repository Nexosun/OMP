package UE05.Exercise2;

public abstract class CarPart implements CarComponent{
protected String name;
protected CarComponent[] component = new CarComponent[0];

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarComponent[] getComponent() {
        return component;
    }

    public void setComponent(CarComponent[] component) {
        this.component = component;
    }





    public static class Motor extends CarPart{ public Motor() { name = "Motor";}        // Inner Classes

        @Override
        public CarComponent[] getComponents() {
            return new CarComponent[0];
        }
    }
    public static class Wheel extends CarPart{ public Wheel() { name = "Wheel";}

        @Override
        public CarComponent[] getComponents() {
            return new CarComponent[0];
        }
    }
    public static class Seat extends CarPart{ public Seat() { name = "Seat";}

        @Override
        public CarComponent[] getComponents() {
            return new CarComponent[0];
        }
    }
    }


