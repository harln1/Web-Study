package J17_ObjectArray.Quiz2;

public class RectPizza extends Pizza {
    // RectPizza(){super();}
    RectPizza(String pizzaName, int price, String explain){
        super(pizzaName, price, explain);
    }
    // =================================================
    //메소드 Introduce 기존 내용 모두 추가 후 "사각 피자입니다." 추가 출력
    @Override
    void Introduce() {
        super.Introduce();
        System.out.println("사각 피자입니다.");
    }
    // Sizeup() +50 00 -> +7000, pizzaName에 "L"앞에 붙이기
    @Override
    void Sizeup() {
        super.Sizeup();
        price += 2000;

        // price += 7000;
        // pizzaName = "L" + pizzaName;
    }

    void Special(){
        System.out.println("피자조아");
        System.out.println("피자조아");
        System.out.println("피자조아");
        System.out.println("피자조아");
        System.out.println("피자조아");
    }

}
