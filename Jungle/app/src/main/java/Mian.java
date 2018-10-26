public class Mian {
    public static void main(String[] args) {
//        Tigers tiger=new Tigers("Italian Tiger",100);
//        Monkey monkey=new Monkey("African Monkey",100);
//        Snakes snake=new Snakes("Indian Snake",100);
//        Snakes snake2=new Snakes("Indian Snake",100);
//        Snakes snake3=new Snakes("Indian Snake",100);
//
//        monkey.eat();
//        monkey.makeSound();
//        monkey.makeSound();
//        monkey.play();
//        System.out.println(monkey.getTotalHealthCare());

        Jungle jungle = new Jungle();
        jungle.addAnimal("Italian tiger");
        jungle.addAnimal("snake");
        jungle.addAnimal("indian snake");
        jungle.addAnimal("monkey");

        jungle.makeSoundOff();


       for(int i=0;i<jungle.getAllAnimals().size();i++){
           System.out.println(jungle.getAllAnimals().get(i).getName()+".His energy "+jungle.getAllAnimals().get(i).getTotalHealthCare());
       }




    }
}
