public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.next();

    int cost = 0;
    switch(str){
        case "사이다":
            cost = 1700;
            break;
        case "콜라":
            cost = 1900;
            break;
        case "식혜":
            cost = 2500;
            break;
        case "솔의눈":
            cost = 3000;
            break;
        default:
            return;
    }

    System.out.println("give me money ");

    int purchased = 0;
    purchased = scan.nextInt();

    if(purchased > cost) {
        //구매할수있음
        System.out.println("ok good, here's your change : " + (purchased - cost));
    } else{
        //돈 모자라다 출력
        System.out.println("잔돈이 부족합니다.");
    }
}