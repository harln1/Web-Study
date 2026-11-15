package HomeWork.Quize4.Animall;

public class Main {
    public static void main(String[] args) {
        //Animal,Dog
        Animal an = new Animal("호랑이", 1);
        an.Sleep();

        System.out.println();

        Dog haru = new Dog("haru", 2);
        haru.Eat();
        haru.Sleep();

        
    }
    
}
