package J17_ObjectArray.Quiz2;

public class Pizza {
    // ====================================
    String pizzaName;
    int price;
    String explain;
    // ====================================
    Pizza(String pizzaName, int price, String explain){
        this.pizzaName = pizzaName;
        this.price = price;
        this.explain = explain;
    }
    // ====================================
    void Introduce(){
        System.out.println("-----------");
        System.out.println(pizzaName);
        System.out.println(price);
        System.out.println(explain);
        System.out.println("-----------");
    }
    void Sizeup(){
        price += 5000;
        pizzaName = "L" + pizzaName ; // super.Sizeup()
    }
}
