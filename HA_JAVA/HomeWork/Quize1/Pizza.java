package HomeWork.Quize1;
public class Pizza{
    String pizzaName;
    int price;

    //-------------------------------------------------------------

    Pizza(String pizzaName,int price){
        this.pizzaName=pizzaName;
        this.price=price;

    }

    //-------------------------------------------------------------

    void Introduce(){
        System.out.println(pizzaName);
        
        System.out.println(price);
        System.out.println("-------");
    }

    


}