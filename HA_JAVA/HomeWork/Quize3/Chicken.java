package HomeWork.Quize3;

public class Chicken {
    int times;
    String chickenName;
    int price;
    //-----------------------------------------------------
    public Chicken(int times,String chickenName,int price){
        this.times=times;
        this.chickenName = chickenName;
        this.price = price;
    }
    //-----------------------------------------------------
    void Introduce(){
        System.out.println(chickenName+":"+price);
    }

    void JiggleJiggle(){
        for(int i=0; i<times ;i++){
            try{
                System.out.print("지");
                Thread.sleep(500);
                System.out.print("글");
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    int  GerPrice(){
        return price;
    }


    
}
