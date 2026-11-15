package HomeWork.Quize1;

public class Chicken {
    int time;
    String chickenName;
    int price;
    //-------------------------------------------------------------
    Chicken(int time,String chickenName,int price){
        this.time = time;
        this.chickenName = chickenName;
        this.price = price;

    }

    //-------------------------------------------------------------

    void Introduce(){
        System.out.println(chickenName + "," + price );
    }
    void JiggleJiggle(){
        for(int i=0;i<time;i++){
        System.out.println("지글지글");}
    }
    int GetPrice(){
        return price;
    }
    
}


