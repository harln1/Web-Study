package J17_ObjectArray.Quiz1;

public class Food {
    String name;
    int price;
    Food(String name, int price){
        this.name = name;
        this.price = price;
    }
    int Sales(){
        System.out.println(name + "맛있게 드세요!");
        return price;
    }
}
