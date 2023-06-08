import com.erbai.Manager;


public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("二白","S01",18);
        System.out.println(manager.getSubjectLife()+manager.getSubjectNo()+manager.getSubjectName());
    }
}
