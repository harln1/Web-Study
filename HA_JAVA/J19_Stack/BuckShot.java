package J19_Stack;

public class BuckShot implements Bullet {
    // ------------------------------
    // 필드
    int bulletCount;
    // ------------------------------
    // 생성자
    BuckShot(){
        this.bulletCount = 20;
    }
    // ------------------------------
    // 메소드
    @Override
    public void Fire() {
        for(int i=0; i<bulletCount; i++){
            System.out.print(".");
        }
        System.out.println();
    }
}
