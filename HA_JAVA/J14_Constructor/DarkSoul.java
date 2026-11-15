// DarkSoul.java
package J14_Constructor;

public class DarkSoul {
    // -----------------------------
    private int hp;
    private int mp;
    private int power;
    private int magic;
    private String weapon;
    private String armor;
    private boolean isAlive;
    // -----------------------------
    // 생성자 오버로드!!
    DarkSoul(){ // 기본생성자 모양
        this.hp = 120;
        this.mp = 50;
        this.power = 10;
        this.magic = 8;
        this.weapon = "부러진 직검";
        this.armor = "누더기 갑옷";
        this.isAlive = true;
    }
    DarkSoul(String weapon){
        this();
        this.weapon = weapon;
    }
    DarkSoul(int power, int magic, String weapon){
        this(weapon);
        this.power = power;
    }
    // -----------------------------
    void PrintChar(){
        System.out.println(hp);
        System.out.println(mp);
        System.out.println(power);
        System.out.println(magic);
        System.out.println(weapon);
    }
    // ------------------------------------
    public void TakeDamaged(int power){
        // 이미 죽었으면??? -> 너무행 ㅠㅠ
        if(isAlive == false){
            System.out.println("어이어이 이미 죽었다고!");
        }else{
            this.hp -= power;
            if(this.hp<=0){
                System.out.println("크아아아아아아!! 꺡");
                isAlive = false;
            }else{
                System.out.println("간지럽군");
            }
        }
    }

    public int GetDamage(){
        return this.power;
    }

}

// 보통 제공하는 Getter는 함수이름을 Get으로 시작
// 보통 내 정보를 변경하는 Setter는 함수이름을 Set으로 시작
// 출력이 주목적 -> Print로 시작
// 최초 1회 또는 초기화 하는데 사용 -> Init으로 시작
// 필드->생성자->메소드 순으로 코드를 작성하고 ==== 로 구분
// 필드는 가급적 모두 Private, 메소드는 Public 생성자는 ? 몰루