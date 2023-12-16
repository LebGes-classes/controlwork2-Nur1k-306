public abstract class Student {
    int rating =0;
    public abstract void makeProgramming();
    public abstract void makeElecEngineering();

    void printRating() {
        System.out.println("Рейтинг студента: " + rating);
    }
}
