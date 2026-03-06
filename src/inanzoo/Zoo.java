package inanzoo;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals;
    private ZooKeeper keeper; // 동물원에 사육사 1명을 고용

    public Zoo() {
        animals = new ArrayList<>();
        // 동물원이 만들어질 때 , 조류 전문 사육사 '강형욱' 님을 고용
        keeper = new ZooKeeper("강형욱","조류");
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
       keeper.playWithAnimal(animals.get(index));
    }

    // 💡 1. 수정된 부분: 이제 사육사(Main)에게 먹이를 받아서 동물에게 전달합니다!
    public void feedAnimal(int index, food givenFood) {
        animals.get(index).feed(givenFood);
    }

    // 💡 2. 복구된 부분: 5번 메뉴(상태 확인)에서 쓸 기능 다시 추가!
    public void showAnimalStatus(int index) {
        animals.get(index).printStatus();
    }

    public void showStatistics() {
        System.out.println("\n=== 동물원 통계 ===");

        if (animals.isEmpty()) {
            System.out.println("현재 등록된 동물이 없습니다.");
            return;
        }

        int totalAnimals = animals.size();
        int totalHappiness = 0;

        System.out.println("- 전체 동물 수: " + totalAnimals + "마리");
        System.out.print("- 배고픈 동물(포만감 30 미만): ");

        boolean hasHungry = false;

        for (Animal a : animals) {
            totalHappiness += a.happiness;

            if (a.hunger < 30) {
                System.out.print(a.getName() + " ");
                hasHungry = true;
            }
        }

        if (!hasHungry) {
            System.out.print("없음 (모두 배가 부릅니다!)");
        }
        System.out.println();

        double avgHappiness = (double) totalHappiness / totalAnimals;
        System.out.printf("- 평균 행복도: %.1f\n", avgHappiness);
    }

    public void makeAnimalSound(int index) {
        animals.get(index).makeSound();
    }

    public void useSpecialAbility(int index) {
        Animal target = animals.get(index);

        if (target instanceof Flyable) {
            Flyable flyer = (Flyable) target;
            flyer.fly();
        }
        else if (target instanceof Swimmable) {
            Swimmable swimmer = (Swimmable) target;
            swimmer.swim();
        } else {
            System.out.println(target.getName() + "은(는) 특별한 능력이 없습니다.");
        }
    }

    public int getAnimalCount() {
        return animals.size();
    }
}