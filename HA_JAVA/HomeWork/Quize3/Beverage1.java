package HomeWork.Quize3;

import java.util.Scanner;

public class Beverage1 {
    int size;
    String[] beverage;
    int[] price;

   //--------------------------------------------------------------
    public Beverage1(int size) {
        this.size = size;
        this.beverage = new String[size];
        this.price = new int[size];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.print("음료 이름 입력 : ");
            this.beverage[i] = scanner.next();

            System.out.print("음료 가격 입력 : ");
            this.price[i] = scanner.nextInt();
        }
    }
    //--------------------------------------------------------------

    void Show() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + "번 : " + beverage[i] + " - " + price[i] + "원");
        }
    }

    void Order(int index) {
        System.out.println(beverage[index] + " 맛있게 드세요!");
    }
}
