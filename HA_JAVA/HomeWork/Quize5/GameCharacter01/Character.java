package HomeWork.Quize5.GameCharacter01;

import java.util.Scanner;

public class Character {
    static Scanner scanner = new Scanner(System.in);

    String nickname;
    int money;
    int hp;
    int mp;
    int power;
    int magic;
    int speed;

    //----------------------------------------------------------------------
    Character() {
        this(1000, 100, 50, 10, 10, 10);
    }

  
    Character(int money, int hp, int mp, int power, int magic, int speed) {
        System.out.print("캐릭터 닉네임을 입력하세요: ");
        this.nickname = scanner.next();
        this.money = money;
        this.hp = hp;
        this.mp = mp;
        this.power = power;
        this.magic = magic;
        this.speed = speed;
    }

    //----------------------------------------------------------------------

    void Attack() {
        System.out.println("기본 공격! 퍽!");
    }


    void Introduce() {
        System.out.println(" 캐릭터 정보 ");
        System.out.println("닉네임: " + nickname + " | 소지금: " + money);
        System.out.println("HP: " + hp + " | MP: " + mp);
        System.out.println("공격력: " + power + " | 마력: " + magic + " | 속도: " + speed);
    }

  
    void GetDamageSound() {
        System.out.println("으악! 데미지를 입었습니다.");
    }
}

