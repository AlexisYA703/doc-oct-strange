package JungleProblem;

class Monkey extends Animal{
    Monkey(){
        incrementAnimalCount();
    }
    @Override
    public void goToSleep(){
        energy = energy + 10;
    }
    @Override
    public void makeSound(){
        System.out.println("Monkey sound");
        energy = energy -4; 
    }
    @Override
        public void eatFood(){
        energy = energy +2;
    }
    public void play(){
        if(energy >= 8){
            System.out.println("Oooo Oooo Oooo");
        }else{
            System.out.println("Monkey is too tired");
        }
    }
} 
