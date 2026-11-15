package J17_ObjectArray.Quiz1;

public class Main {
    public static void main(String[] args) {
        // "생선회", "새우회" 객체를 각각 10개를
        //  Food menuList 배열에 저장하세요
        Food[] menuList = new Food[20];
        for(int i=0; i<10; i++){
            menuList[i] = new 생선회();
        }
        for(int i=0; i<10; i++){
            menuList[i+10] = new 새우회();
        }
        // menuList[19] = new Food("얼박사", 23);
        // 이후 money 변수를 선언 후, menuList에 있는 객체들의 Sales메소드  
        // 실행해서 리턴값을 money에 저장해서 출력하세요
        int money = 0;
        for(int i=0; i<menuList.length; i++){
            money += menuList[i].Sales();
        }
        System.out.println("총 "+money+"원 입니다.");


    }
}
