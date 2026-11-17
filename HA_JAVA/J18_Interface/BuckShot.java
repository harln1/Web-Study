package J18_Interface;

import java.awt.Toolkit;

public class BuckShot implements Bullet {
    // --------------------------------------
    // 필드
    int maxCapacity;
    int magazine;
    int price;

    // --------------------------------------
    // 생성자
    BuckShot() {
        this.maxCapacity = 5;
        this.magazine = 0;
        this.price = 5000 + tax;
    }

    BuckShot(int price) {
        this();
        this.price = price + tax;
    }

    // --------------------------------------
    // 메소드
    @Override
    public void Fire() {
        // 총알 없으면 안됨!!!
        if (magazine == 0) {
            Reload();
        }else{
            System.out.println(showSound);
            magazine--;
        }
    }

    @Override
    public void Reload() {
        // 한발씩 장전
        // 꽉 차있는데 장전 누를 수 있다!
        if (magazine == maxCapacity) {
        } else {
            System.out.print("[RELOAD!] ");
            // 장전해야 하는 총알의 개수는 몇개일까?
            // magaizine 2 -> 3 ( maxCapacity - magazine )
            int temp = maxCapacity - magazine;
            for (int i = 0; i < temp; i++) {
                magazine++;
                System.out.print(">");
                Toolkit.getDefaultToolkit().beep();

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            System.out.println(" 촵!");
        }
    }
}
// 위의 인터페이스를 구현하는 BuckShot 클래스는 아래와 같슴다
// 1. 최대 5발 발사 가능 -> capacity , magazine -> capacity
// 2. 장전시 한번에 하나만 가능
// 3. 발사할 때는 Fire, 재장전할 때는 Reload 함수를 구현

// ctrl꾹 + kf 따닥