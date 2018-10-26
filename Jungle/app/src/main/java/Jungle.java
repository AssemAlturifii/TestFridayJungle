import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jungle {
    private List<Animals> allAnimals=new ArrayList<>();

    List<String> foodlist = Arrays.asList("meat", "fish", "bugs", "grain");

    public void addAnimal(String animal){ //Italian tiger male
        String[] words=animal.split(" ");

        for(int i=0;i<words.length;i++){
            if(words[i].equalsIgnoreCase("tiger")){
                Tigers tiger=new Tigers(animal,100);
                allAnimals.add(tiger);
            }
            else if(words[i].equalsIgnoreCase("monkey")){
                Monkey monkey=new Monkey(animal,100);
                allAnimals.add(monkey);
            }
            else if(words[i].equalsIgnoreCase("snake")){
                Snakes snake=new Snakes(animal,100);
                allAnimals.add(snake);
            }

        }

    }


    public void makeSoundOff(){
        for(Animals animal:allAnimals){

            animal.makeSound();
        }

    }




    public List<Animals> getAllAnimals() {
        return new ArrayList<>(allAnimals);
    }
}
