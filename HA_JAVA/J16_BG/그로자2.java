package J16_BG;

public class 그로자2 extends 그로자{
    그로자2(String name){
        super(name);
        // -----------------------
        // 이제 맘에 안드는 나만의 필드 세팅 진행
        this.탄창 = 50;
        this.최대탄창 = 50;
        this.등장확률 = 0.00001;
        
        this.초당데미지 = 20;
        this.연사속도 = 99;

        this.탄약종류 = "7.62mm";
    }
}
