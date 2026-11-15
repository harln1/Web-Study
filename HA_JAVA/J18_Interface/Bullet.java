package J18_Interface;
// Bullet.java
public interface Bullet {
    int tax = 3000;
    String showSound = "탕";
    // ------------------------------
    void Fire();
    void Reload();
}
// 위의 인터페이스를 구현하는 BuckShot 클래스는 아래와 같슴다
// 1. 최대 5발 발사 가능 -> capacity , magazine -> capacity
// 2. 장전시 한번에 하나만 가능
// 3. 발사할 때는 Fire, 재장전할 때는 Reload 함수를 구현
