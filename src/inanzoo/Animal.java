package inanzoo;

public abstract class Animal {
    protected String name;
    protected int age;
    protected int hunger;
    protected int happiness;

    // 💡 수정 1: 소문자 food를 대문자 Food로 변경했습니다.
    protected food favoriteFood;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.hunger = 50;
        this.happiness = 50;
    }

    // 💡 수정 2: 사육사가 어떤 먹이(givenFood)를 주는지 받아옵니다.
    public void feed(food givenFood) {
        // 만약(if) 내가 좋아하는 먹이와 사육사가 준 먹이가 똑같다면?
        if (this.favoriteFood == givenFood) {
            this.hunger -= 10;
            this.happiness += 5;
            System.out.println(name + "이(가) 먹이를 아주 맛있게 먹습니다! 냠냠!");
        }
        // 그렇지 않다면(else)?
        else {
            System.out.println(name + ": 웩! 나 이거 안 먹어! (선호하는 먹이가 아닙니다)");
        }
    }

    public void play() {
        this.happiness += 10;
        System.out.println(name + "와(과) 신나게 놀았습니다!");
    }

    public abstract void makeSound();

    public void printStatus() {
        System.out.println("[" + name + " / " + age + "살] 포만감: " + hunger + ", 행복도: " + happiness);
    }

    public String getName() {
        return name;
    }
}