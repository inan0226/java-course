package inanzoo;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + "이(가) 동물원에 등록되었습니다.");
    }

    public void showAllAnimals() {
        System.out.println("\n=== 현재 등록된 동물 ===");
        if (animals.isEmpty()) {
            System.out.println("등록된 동물이 없습니다.");
            return;
        }
        for (int i = 0; i < animals.size(); i++) {
            System.out.println((i + 1) + ". " + animals.get(i).getName());
        }
    }

    public void playWithAnimal(int index) {
        animals.get(index).play();
    }

    public void feedAnimal(int index) {
        animals.get(index).feed();
    }

    public void showAnimalStatus(int index) {
        animals.get(index).printStatus();
    }

    public void makeAnimalSound(int index) {
        animals.get(index).makeSound();
    }

    // 동물이 몇 마리인지 알려주는 기능 (Main에서 쓰기 위해 추가했어요)
    public int getAnimalCount() {
        return animals.size();
    }
}