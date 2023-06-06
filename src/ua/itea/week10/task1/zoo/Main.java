package ua.itea.week10.task1.zoo;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.addingAnimals("Horse");
        zoo.addingAnimals("Shark");
        zoo.addingAnimals("Bear");
        zoo.addingAnimals("Giraffe");
        zoo.addingAnimals("Crocodile");
        zoo.addingAnimals("Hippopotamus");
        zoo.addingAnimals("Fox");
        zoo.addingAnimals("Wolf");
        zoo.printInfoAllListAnimals();


        zoo.removingAnimals(7);
        zoo.removingAnimals(5);
        zoo.removingAnimals(3);
        System.out.println(zoo.getSizeListAnimals());
        zoo.printInfoAllListAnimals();

    }
}
