package lab;

public class Exam {
    static String prefix = "Hollow";
    private String name = "World";
    public static String getName() {
        return new Exam().name;
    }
    public static void main(String[] args) {
        Exam q = new Exam();
        System.out.println(Exam.prefix + Exam.name);
    }
}
