public abstract class Animals {
    private String name;
    int totalEnergy;


    public Animals(String name,int totalEnergy) {
        this.name = name;
        this.totalEnergy=totalEnergy;

    }
    public abstract void makeSound();
    public abstract void eat();
    public abstract void sleep();

    public abstract int getTotalHealthCare();

    public String getName() {
        return name;
    }

    public int getTotalEnergy() {
        return totalEnergy;
    }
}
