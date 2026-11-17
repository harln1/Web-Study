// Weapon.java
package J16_BG;

public class Weapon {
    // ----------------------------------------
    // 무기라면 모두 가지고 있어야하는 필드들
    int 발당데미지;
    int 연사속도;
    int 안정성;
    int 초당데미지;
    int 탄속;
    int 유효사거리;
    String 이름;
    double 등장확률;
    String 부착물_총구;
    String 부착물_손잡이;
    String 부착물_조준기;
    String 부착물_탄창;
    int 탄창;
    int 최대탄창;
    
    // ----------------------------------------
    // 생성자
    //Weapon(){}
    public Weapon(int type, String name){
        switch(type){
            case 1 -> Init돌격소총();
            case 2 -> Init산탄총();
            default -> System.out.println("준비중..^^;;");
        }
        this.이름 = name;
        this.등장확률 = 0;
        this.부착물_총구 = null;
        this.부착물_손잡이 = null;
        this.부착물_조준기 = null;
        this.부착물_탄창 = null;
        this.탄창 = 30;
        this.최대탄창 = 30;
    
    }
    // ----------------------------------------
    // 메소드
    void Init돌격소총(){
        this.발당데미지 = 4;
        this.연사속도 = 8;
        this.안정성 = 5;
        this.초당데미지 = 7;
        this.탄속 = 6;
        this.유효사거리 = 5;
    }
    void Init산탄총(){
        this.발당데미지 = 10;
        this.연사속도 = 1;
        this.안정성 = 4;
        this.초당데미지 = 8;
        this.탄속 = 3;
        this.유효사거리 = 1;
    }
    void 발사(){
        if(this.탄창>=1){
            // 발사 가능
            System.out.println("탕");
            this.탄창--;
        }else{
            // 발사 불가능 -> 재장전
            재장전();
        }
    }
    void 재장전(){
        // 최대탄창까지 하나씩 채워야 함.
        // 현재 14발 -> 최대 30발 -> 16(30-14)
        for(int i=this.탄창; i<this.최대탄창; i++){
            this.탄창++;
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("알수없는 에러");
            }
        }
        System.out.println("장전완료");
    }
}
