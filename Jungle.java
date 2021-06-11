package JungleProblem;
import java.util.*; 

public class Jungle{
    public static void main(String []args){

        // List of animal in the Jungle 
        List<Animal> animalList = new ArrayList<Animal>();
        // Creating an Animals object
        Tiger tiger1 = new Tiger();
        Monkey monkey1 = new Monkey();
        Snake snake1 = new Snake();
        // Adding new Tiger object to the animalList 
        animalList.add(tiger1);
        animalList.add(monkey1);
        animalList.add(snake1);
        // Random activities
        randomActivity(animalList);

        System.out.println("***** ANIMAL COUNT *****");
        System.out.println("Tigers: " + tiger1.getAnimalCount());
        System.out.println("Monkeys: " + monkey1.getAnimalCount());
        System.out.println("Snakes: " + snake1.getAnimalCount());
        System.out.println();

        System.out.println("***** ANIMALS IN ACTION *****");

        monkey1.play();
        System.out.println("Monkey1 is playing");
        monkey1.makeSound();
        monkey1.eatFood();    
        System.out.println("Monkey1 energy level: " + monkey1.getEnergyLevel());
            
        tiger1.goToSleep();
        tiger1.eatFood(new Meat());
        tiger1.eatFood(new Grain());
        tiger1.makeSound();
        System.out.println("Tiger1 energy level: " + tiger1.getEnergyLevel());

        snake1.goToSleep();
        snake1.eatFood();
        snake1.drinkWater();
        snake1.makeSound();
        System.out.println("Snake1 energy level: " + tiger1.getEnergyLevel());
        
        System.out.println();
        soundOff(animalList);
        System.out.println("Animals bussin");
    }
    public static void randomActivity(List<Animal> animalList){

        Random rand = new Random(); 
        for(Animal animal: animalList){
            int rand_int1 = rand.nextInt(3);
            if(rand_int1 == 0)
            animal.makeSound();
            else if (rand_int1 == 1){
                animal.eatFood();
            }
            else
                animal.goToSleep();
        }
    }
    public static void soundOff(List<Animal> animalList){

        System.out.println("Sound off");
        for(Animal animal : animalList){
            animal.makeSound();
        }
    }
}