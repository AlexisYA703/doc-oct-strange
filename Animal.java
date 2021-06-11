package JungleProblem;

abstract class Animal{

    int animalCount = 0;
    int energy = 10;
    public void makeSound(){
        energy = energy -3;
    };
    public void eatFood(){
        energy = energy +5; 
        //System.out.println("Animal eats food");
    };
    public void drinkWater(){
        energy = energy +4;
    };
    public void goToSleep(){
        energy = energy +10;
        //System.out.println("Animal goes to sleep");
    };
    public int getAnimalCount(){
        return animalCount;
    }
    public void incrementAnimalCount(){
        animalCount++;
    }
    public int getEnergyLevel(){
        return energy;
    }
}
