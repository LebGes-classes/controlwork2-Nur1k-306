import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите сколько студентов:");
        int numberStudent=scanner.nextInt();
        List<Student> students = generateStudents(numberStudent); // Генерируем список студентов

        // Проведем несколько работ
        for (int i = 0; i < 3; i++) {
            for (Student student : students) {
                if (new Random().nextBoolean()) {
                    student.makeProgramming();
                } else {
                    student.makeElecEngineering();
                }
            }

            System.out.println("После работы " + (i + 1) + ":");
            printStudentStates(students);

            // Сортируем студентов по рейтингу в убывающем порядке
            Collections.sort(students, (s1, s2) -> Integer.compare(s2.rating, s1.rating));
            // Раздаем макбуки лучшим 25%
            int numMacBooks = (int) (students.size() * 0.25);
            System.out.println("Лучшие студенты получают макбук: ");
            for (int j = 0; j < numMacBooks; j++) {
                students.get(j).printRating();
            }
            System.out.println("-----");
        }
    }

    private static List<Student> generateStudents(int numStudents) {
        List<Student> students = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numStudents; i++) {
            if (random.nextBoolean()) {
                students.add(new ItisStudent());
            } else {
                students.add(new IvmitStudent());
            }
        }

        return students;
    }

    private static void printStudentStates(List<Student> students) {
        for (Student student : students) {
            if (student instanceof ItisStudent) {
                System.out.println("ITIS Student: " + student.rating);
            } else if (student instanceof IvmitStudent) {
                System.out.println("IVMiIT Student: " + student.rating);
            }
        }

    }
}