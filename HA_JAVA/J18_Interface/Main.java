package J18_Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 인터페이스는 객체를 만들 수 없다
        // Animal ani = new Animal();

        Dog d = new Dog();
        //System.out.println(d.maxAge);
        d.Transform();
        d.Sleep();
        d.Attack();
        d.Eat();
        // ------------------------------------------
        TextPrinter tp = new TextPrinter();   // cp = 0
        Scanner dongas = new Scanner(System.in);
        while(true){
            System.out.println("< 메뉴를 선택하세용 >");
            System.out.println("1. 현재 줄 출력");
            System.out.println("2. 다음 줄 출력");
            System.out.println("3. 이전 줄 출력");
            System.out.println("4. 첫 줄로 이동");
            System.out.println("5. 전체 출력");
            System.out.println("6. 종료");
            System.out.print("입력 : ");
            int choice = dongas.nextInt();
            // -----------------------------------
            if(     choice==1){tp.PCurrent();}
            else if(choice==2){tp.PNext();}
            else if(choice==3){tp.PPreview();}
            else if(choice==4){tp.Reset();}
            else if(choice==5){tp.PAll();}
            else if(choice==6){break;}
            else {            
                System.out.println("[SYS] 올바르지 않은 값을 입력");
            }
        }

        // --------------------------------------------
        BuckShot pumpShotgun = new BuckShot();
        while(true){
            System.out.println("< 행동을 선택하세용 >");
            System.out.println("1. 발사");
            System.out.println("2. 재장전");
            System.out.println("3. 종료");
            System.out.print("입력 : ");
            int choice = dongas.nextInt();
            // -----------------------------------
            if(     choice==1){pumpShotgun.Fire();}
            else if(choice==2){pumpShotgun.Reload();}
            else if(choice==3){break;}
            else {            
                System.out.println("[SYS] 올바르지 않은 값을 입력");
            }
        }


        dongas.close();
    }
}
