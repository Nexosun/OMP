package UE01.Aufgabe1;

public class Animal {
    private String name;
    private Animal[] foodA = new Animal[10];
    private Plant[] foodP = new Plant[10];

    public Animal[] getFoodA() {
        return foodA;
    }
    public Plant[] getFoodP() {
        return foodP;
    }

    public void setFoodA(Animal[] foodA) {
        this.foodA = foodA;
    }

    public void setFoodP(Plant[] foodP) {
        this.foodP = foodP;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eatPlant(Plant plant){                  // iterate trough foodArray and search a free space (or do nothing)
    for(int i = 0; i < this.getFoodP().length; i++ ){
    if(getFoodP()[i] == null ){
        this.getFoodP()[i] = plant;
        break;
    }
    }
    }
    public void eatAnimal(Animal animal){
        for(int i = 0; i < this.getFoodA().length; i++){
        if(getFoodA()[i] == null){
            this.getFoodA()[i] = animal;
            break;
        }
        }
    }


    public boolean eatsAnimal(){                                // help-method (only looks if one animal/plant is in the foodArray
        for(int i = 0; i < this.getFoodA().length; i++){
        if(this.getFoodA()[i] != null){
            return true;
        }
        }
        return false;
    }

    public boolean eatsPlant(){
        for(int i = 0; i < this.getFoodP().length; i++){
            if(this.getFoodP()[i] != null){
                return true;
            }
        }
        return false;
    }

   public boolean isOmnivore(){                             // three methods to get type (omnivore/carnivore/herbivore) using the two help-methods in boolean
       return this.eatsAnimal() && this.eatsPlant();
   }

   public boolean isCarnivore(){
       return this.eatsAnimal() && this.eatsPlant() == false;       // if statement simplified (recommended by IDE)
   }

   public boolean isHerbivore(){
        if(this.eatsAnimal() == false && this.eatsPlant()){
            return true;
        }
        return false;
   }
}
