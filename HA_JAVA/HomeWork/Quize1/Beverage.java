package HomeWork.Quize1;

public class Beverage {

    String[] items;
    int[] prices;
    int[] count;

    //-------------------------------------------------------------

    Beverage(String[]item,int[]prices,int[] count){
        this.items = item;
        this.prices = prices;
        this.count = count;

    }

    //------------------------------------------------------------- 

    void ShowBeverage(){
        System.out.println("보유중인 음료목록");
        for(int i = 0;i<items.length;i++){
            System.out.println(items[i]+ ":" +prices[i]+ "원" );
        }
    }
    void OrderBeverage(int index){
        System.out.println((index+"번째 음료 "+count[index])+"개 판매 "+items[index]+" 맛있게드세요!");

    }
    void GetPrice(int index ){
        System.out.println((prices[index]*count[index])+"원 입니다");

    }

    
}
