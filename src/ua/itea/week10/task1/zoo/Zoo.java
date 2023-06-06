/**
 * Завдання 1
 * Використовуючи Intelij IDEA, створити проект, пакет. Створити клас Zoo. У класі створити список, який записати 8 тварин через
 * метод add(index, element). Вивести список у консоль.
 * Завдання 2
 * Використовуючи Intelij IDEA, створити проект, пакет. Використовуючи клас Zoo Завдання 2, видалити 3, 5, 7 тварин,
 * дізнатися розмір списку і вивести в консоль.
 */


package ua.itea.week10.task1.zoo;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<String> listAnimals = new ArrayList<>();


    public void addingAnimals(String animalToAdd) {
        listAnimals.add(listAnimals.size(), animalToAdd);
    }

    public void printInfoAllListAnimals() {
        for (int i = 0; i < listAnimals.size(); i++) {
            System.out.println(listAnimals.get(i));
        }

    }

    public void removingAnimals(int indexElementToRemove) {
        listAnimals.remove(indexElementToRemove);

    }


    public int getSizeListAnimals() {
        return listAnimals.size();
    }


}
