package JungleProblem;

class Tiger extends Animal{

    Tiger(){
        incrementAnimalCount();
    }
    @Override   
    public void goToSleep(){
        this.energy = this.energy + 5;
        System.out.println("Tiger goes to sleep");
    }
    @Override
    public void makeSound(){
        System.out.println("Tiger rooooaaaarsssss");
        this.energy = this.energy -3; 
    }
    public void eatFood(Food food){
        if(food instanceof Grain){
            System.out.println("Tigers can't eat grain because they have sensitive digestive systems");
        }
        else{
            System.out.println("Tiger eats food");
            this.energy = this.energy + food.energy;
        }
    }
}
