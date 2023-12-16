import java.util.Random;

public class ItisStudent extends Student{

    @Override
    public void makeProgramming() {
        rating += new Random().nextInt(2) + 3; // 3 или 4 балла
    }

    @Override
    public void makeElecEngineering() {
        rating += new Random().nextInt(2) + 4; // 4 или 5 баллов
    }
}
