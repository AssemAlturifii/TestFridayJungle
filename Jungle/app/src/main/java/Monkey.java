public class Monkey extends Animals implements toDoInterface{
    public static int numInstances=0;
    private int totalHealthCare=totalEnergy;


    public Monkey(String name,int energy) {
        super(name,energy);
        numInstances++;

    }

    @Override
    public void makeSound() {
        System.out.println(getName()+" making sound.");
        totalHealthCare-=4;


    }

    @Override
    public void eat() {
        System.out.println(getName()+" making eating.");
        totalHealthCare+=2;

    }

    @Override
    public void sleep() {
        System.out.println(getName()+" making sleeping.");
        totalHealthCare+=10;

    }

    public static int getNumInstances() {
        return numInstances;
    }

    public int getTotalHealthCare() {
        return totalHealthCare;
    }

    @Override
    public void play() {
        if(totalHealthCare>8) {
            System.out.println("Oooo Oooo Oooo");
            this.totalHealthCare = totalHealthCare - 8;
        }
        else{
            System.out.println("Monkey is too tired to play");
        }

    }
}
