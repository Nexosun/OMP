package UE01.Aufgabe1;

public class BioTest {

    public static void main(String[] args){             // create plants/animals and example console prints using the getter and methods
    Plant gras = new Plant();
    gras.setName("gras");
    gras.setDescription("green");

    Plant berry = new Plant();
    berry.setName("berry");
    berry.setDescription("red");

    Animal zebra = new Animal();
    zebra.setName("zebra");
    zebra.eatPlant(gras);

    Animal lion = new Animal();
    lion.setName("lion");
    lion.eatAnimal(zebra);

    Animal fish = new Animal();
    fish.setName("fish");
    Animal bear = new Animal();
    bear.setName("bear");
    bear.eatPlant(berry);
    bear.eatAnimal(fish);

    System.out.println(gras.getName() + " is " + gras.getDescription());
    System.out.println(berry.getName() + " is " + berry.getDescription());
    System.out.println(zebra.getName() + " eats " + zebra.getFoodP()[0].getName());
    System.out.println(lion.getName() + " eats " + lion.getFoodA()[0].getName());
    System.out.println(bear.getName() + " eats " + bear.getFoodP()[0].getName());
    System.out.println(bear.getName() + " eats " + bear.getFoodA()[0].getName());

    System.out.println("Zebra is herbivore: " + zebra.isHerbivore());
    System.out.println("Lion is Carnivore: " + lion.isCarnivore());
    System.out.println("Bear is Omnivore: " + bear.isOmnivore());
    }
}
