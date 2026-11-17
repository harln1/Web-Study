package J17_ObjectArray.Quiz2;

public class Main {
    public static void main(String[] args) {
        Pizza[] pizzaList = new Pizza[4];
        pizzaList[0] = new Pizza(    "콤비네이션"  , 18000, "다 서꺼버려"   );
        pizzaList[1] = new Pizza(    "치즈피자"    , 15000, "치즈가 맛있어용");
        pizzaList[2] = new RectPizza("민초피자"    , 33000, "한정판 피자"   );
        pizzaList[3] = new RectPizza("사각사각피자", 28000, "진짜 네모에요"  );
        // ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
        // Pizza에 Pizza와 RectPizza를 모두 담았음
        // 자료형을 Pizza에 담았으니 Pizza에 해당하는 필드와 메소드만 사용가능!!
        // ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
        for(int i=0; i<pizzaList.length; i++){
            pizzaList[i].Introduce();
            pizzaList[i].Sizeup();
            pizzaList[i].Introduce();
            // pizzaList[i].Special();
            System.out.println("~~~~~~~~~~~~~~");
        }
    }
}
