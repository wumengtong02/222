package wumengtong;

public class SMTest {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        StudentManager.addStudent(1,"����ͩ","1999.7",true);
        StudentManager.seek("����ͩ");
        StudentManager. change("����ͩ");
        StudentManager.printAll();
        StudentManager.tuichu();
    }
}
