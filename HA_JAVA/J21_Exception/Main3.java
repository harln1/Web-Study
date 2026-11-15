package J21_Exception;

import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        // 무한입력 실습하기 - 업다운
        // 숫자를 하나 랜덤으로 정함(1~100)
        // 숫자를 입력받아 그숫자가 작으면 UP,
        // 크면 Down 맞으면 "축하"해주기
        // 단, 1~100 범위를 벗어나거나
        // 이상한 값(숫자아닌값)을 입력한 경우
        // 다시 입력할 수 있게 처리.
        Scanner dongas = new Scanner(System.in);
        Random rand = new Random();
        int result = rand.nextInt(100) + 1;
        while(true){
            System.out.print("숫자 하나 입력 : ");
            int choice = 0;
            boolean flag = false; // true -> 에러 발생한 적 있음
            try{
                choice = dongas.nextInt();
                // if(choice == result){
                //     System.out.println("정답입니다!!");
                //     break;
                // }else if(choice < result && choice > 0){
                //     System.out.println("Up");
                // }else if(choice > result && choice < 101){
                //     System.out.println("Down");
                // }else{
                //     //1~100 아니면 여기로 들어옴???
                //     System.out.println("제대로 입력해라 마");
                // }
            }catch(java.util.InputMismatchException e){
                // 숫자가 아닌 값 입력
                System.out.println("숫자만 입력해야 합니다.");
                dongas.nextLine();
                flag = true;
            }
            if(flag==false){

                if(choice == result){
                    System.out.println("정답입니다!!");
                    break;
                }else if(choice < result && choice > 0){
                    System.out.println("Up");
                }else if(choice > result && choice < 101){
                    System.out.println("Down");
                }else{
                    //1~100 아니면 여기로 들어옴???
                    System.out.println("제대로 입력해라 마");
                }
            }


        }
        dongas.close();
    }
}
