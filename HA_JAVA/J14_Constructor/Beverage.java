package J14_Constructor;

import java.util.Scanner;

public class Beverage {
    // --------------------------------------
    public int size;
    String[] beverage; // 여기다 = new String요고 하면안됨
    int[] price;
    // --------------------------------------
    public Beverage(int size){
        beverage = new String[size];
        price = new int[size];

        Scanner dongas = new Scanner(System.in);

        for(int i=0; i<size; i++){
            // 스키너로 가각 이름, 가격 입력받아서 [i] 입력
            System.out.print("음료 이름 : ");
            beverage[i] = dongas.nextLine();
            System.out.print("음료 가격 : ");
            price[i] = dongas.nextInt();

            dongas.nextLine(); // 엔터제거
        }

        dongas.close();
    }
    // --------------------------------------
    void Show(){
        for(int i=0; i<size; i++){
            System.out.printf("이름 : %s, 가격 : %d\n",beverage[i],
                                                      price[i]   );
        }
    }

    void Order(int index){
        System.out.println(beverage[index] + "맛있게 드세요!");
    }
}
