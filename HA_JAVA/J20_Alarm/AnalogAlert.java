package J20_Alarm;

public class AnalogAlert implements AlertSystem {
    int currentAlertTime;
    // -----------------------------
    AnalogAlert(){
        // ChangeTime();
        this.currentAlertTime = alertTime3;
    }
    AnalogAlert(int time){
        // int time -> time에 해당하는 3,5,7로 설정. 
        // ex : DigitalAlert(3) -> currentAltertTIme을 
        // alertTime3을 설정 // 3 5 7
        // 만약, 3, 5, 7이 아닌 숫자를 입력했다면???
        // 1. 막는다, 2. 보다 작은 값으로 설정
        if(time!=alertTime3 && time!=alertTime5 && time!=alertTime7){
            System.out.println("올바르지 않은 값 입력. 기본값 처리");
            ChangeTime();
        }else{
            // ChangeTime(time);
            this.currentAlertTime = time;
        }
    }
    // -----------------------------
    @Override
    public void AlertPlay() {
        // AlertPlay -> currentAltertTime만큼 
        // Toolkit.getDefaultToolkit().beep(); 반복 (Sleep 활용)
        for(int i=0; i<currentAlertTime; i++){
            System.out.println("rrrr");
        }
    }

    @Override
    public void ChangeTime() {
        currentAlertTime = alertTime3;
        System.out.println("알람 시간이 3으로 설정되었습니다.");
    }

    @Override
    public void ChangeTime(int time) {
        currentAlertTime = time; // 원래는 조건문 필요한데
        // 생성자에서 걸러냈으니까 ㄱㅊㄱㅊ
        System.out.println("알람 시간이 " + time + "으로 설정되었습니다.");
    }
}
