package JungleProblem;

class Snake extends Animal{
    Snake(){
        incrementAnimalCount();
    }
    @Override
    public void goToSleep(){
        energy = energy + 8;
    }
    @Override
    public void makeSound(){
        System.out.println("Snake rattling");
        energy = energy -2; 
    }
    @Override
        public void eatFood(){
        energy = energy +3;
    }
    @Override
    public void drinkWater(){
        System.out.println("Whatch out, snake is coming down the river, she's thirsty");
        energy = energy + 4;
    }

}
