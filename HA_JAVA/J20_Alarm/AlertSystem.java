package J20_Alarm;

public interface AlertSystem {
    int alertTime3 = 3;
    int alertTime5 = 5;
    int alertTime7 = 7;   
    void AlertPlay();
    void ChangeTime();
    void ChangeTime(int time);
}
