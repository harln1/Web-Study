package HomeWork.Quize4;

public class Car extends Vehicle{

    int collingLevel;
    double accelation;

    //------------------------------------

    Car(String model,int capacity,int price){
        super(model, capacity, price);
        this.collingLevel = 5;
        this.accelation = 0.7;

    }

    //------------------------------------

    void OnAitCondition(){
        System.out.println("시원시원");
    }


    
}
