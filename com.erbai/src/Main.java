import com.erbai.Manager;
import com.erbai.Student;


public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("计算机应用技术", "J001", 4);
        System.out.println(manager.info());
        Student student = new Student("二白", "S01", "男", 18);
        System.out.println(student.introduction(manager.getSubjectName(), manager.getSubjectLife()));
        System.out.println(student.introduction(manager));
        Student student2 = new Student("二白", "S01", "男", 18, manager);
        System.out.println(student2.introduction());
    }
}
