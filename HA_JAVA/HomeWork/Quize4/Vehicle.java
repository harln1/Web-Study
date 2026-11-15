package HomeWork.Quize4;

public class Vehicle {

    String model;
    int capacity;
    int price;

    //------------------------------------------
    Vehicle(String model,int capacity,int price){
        this.model = model;
        this.capacity = capacity;
        this.price= price;
    }

    //------------------------------------------
    void Move(){
        System.out.println("부릉부릉");
    }

}

    

