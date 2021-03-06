public class Snakes extends Animals{
    public static int numInstances=0;
    private int totalHealthCare=totalEnergy;

    public Snakes(String name,int energy) {
        super(name,energy);
        numInstances++;

    }

    @Override
    public void makeSound() {
        System.out.println(getName()+" making sound.");
        totalHealthCare-=3;

    }

    @Override
    public void eat() {
        System.out.println(getName()+" making eating.");
        totalHealthCare+=5;

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
}
