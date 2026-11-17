package J14_Constructor;

public class Main {
    public static void main(String[] args) {
        String[] speciesList = {"우나","야하","끼리이양아야아오호오"};
        Chiikawa usagi = new Chiikawa("우사기", "2019-1-22", "토끼", speciesList);
        System.out.println(usagi.name); // null -> 생성자 만든후??? 잘 나옴.
        // null -> 값이 없음 -> 에러의 주범

        // 생성자 = 신입 교육
        // 생성자 오버로드 실습
        DarkSoul 불사자1 = new DarkSoul();
        DarkSoul 불사자2 = new DarkSoul("암월의 대검");
        DarkSoul 불사자3 = new DarkSoul(20, 2, "그레이트소드");
        불사자1.PrintChar();
        불사자2.PrintChar();
        불사자3.PrintChar();
        // -------------------------------------------
        Hollow[] 망자들 = new Hollow[3]; 
        망자들[0] = new Hollow();
        망자들[1] = new Hollow();
        망자들[2] = new Hollow();

        for(int i=0; i<10 ;i++){
            망자들[0].GetDamage(불사자1);
            망자들[0].TakeDamage(불사자1);
        }
        for(int i=0; i<10 ;i++){
            망자들[1].GetDamage(불사자1);
            망자들[1].TakeDamage(불사자1);
        }
    
        // =========================================
        Beverage bev = new Beverage(3);
        bev.Show();
        bev.Order(1);
    }
}
