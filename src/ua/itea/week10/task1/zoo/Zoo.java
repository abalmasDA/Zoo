package ua.itea.week10.task1.zoo;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<String> listAnimals = new ArrayList<>();


    public void addingAnimals(String animalToAdd) {
        listAnimals.add(listAnimals.size(), animalToAdd);
    }

    public void getInfoAllListAnimals() {
        for (int i = 0; i < listAnimals.size(); i++) {
            System.out.println(listAnimals.get(i));
        }

    }

}
