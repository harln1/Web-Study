package J18_Interface;

public interface TextInterface {
    // 출력할 대사 목록
    public static final String[] LINES = {
        "1. ORA ORA ORA ORA ORA ORA!",
        "2. Do you remember how many breads you have eaten in your life?",
        "3. Gold Experience Requiem!",
        "4. Your next line is... 'What?!",
        "5. MUDA MUDA MUDA MUDA MUDA!"
    };
    public abstract void PCurrent();
    public abstract void PNext();
    public abstract void PPreview();
    public abstract void Reset();
    public abstract void PAll();
}

