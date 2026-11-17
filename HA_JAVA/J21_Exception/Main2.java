package J21_Exception;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner dongas = new Scanner(System.in);
        System.out.println("숫자 하나 입력");
        try{
            int num = dongas.nextInt();
    
            if(num==100){
                System.out.println("Great");
            }else if(num<0 || num>100){
                System.out.println("Out of Score Range");
            }else{
                System.out.println("Not 100");
            }
    
            dongas.close();
        }catch(java.util.InputMismatchException 불고기){
            System.out.println("Invalid Input value");
        }catch(java.util.NoSuchElementException 뚝배기){
            System.out.println("Program Exit");
        }

    }
}
