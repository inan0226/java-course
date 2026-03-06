package inanzoo;

public class ZooKeeper {
    private String name;
    private String specialty; // 전문 분야 ( 포유류 , 조류 등)

    // 사육사가 고용 될 때 이름과 전문 분야를 정해줍니다.
    public  ZooKeeper(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }
    // 핵심 기능 : 사육사가 동물과 놀아줍니다.
    public void playWithAnimal(Animal animal) {
        System.out.println("\n사육사[" + name + "]님이" + animal.getName() + "와(과) 놀아주기를 시작합니다.");

        // 1. 기본적으로 동물이 노는 기능 실행
        animal.play();

        // 2. 전문 분야 시너지 확인
        // 만약 사육사가 포유류 전문이고, 동물이 포유류(Mammal)라면?
        if (specialty.equals("포유류") && animal instanceof Mammal) {
            System.out.println("[전문가 시너지] 포유류 전문 사육사의 손길! " + animal.getName() + "이(가) 두 배로 행복해합니다!");
            animal.happiness += 10; // 보너스 행복도 추가!
        }
        // 만약 사육사가 조류 전문이고 동물이 조류 라면 ?
        else if (specialty.equals("조류") && animal instanceof Bird) {
            System.out.println("[전문가 시너지] 조류 전문 사육사의 손길!" + animal.getName() + "이(가) 두배로 행복해집니다!");
            animal.happiness += 10;
        }
    }
}
