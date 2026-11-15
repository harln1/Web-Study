package J17_ObjectArray.Quiz3;

public class Person {
    String name;
    int age;
    // 멤버변수 name, age 생성자로 초기화. name 생성자로 초기화(age=0)
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    Person(String name){
        this.name = name;
        this.age = 0;
    }
    // 메소드
    // Introduce - 안녕 {name} 아
    void Introduce(){
        System.out.println("안녕 " + name +" 야");
        System.out.println("너 나이는 " + age);
    }

}
