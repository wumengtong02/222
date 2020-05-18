package wumengtong;

public class SMTest {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        StudentManager.addStudent(1,"ÎâÃÏÍ©","1999.7",true);
        StudentManager.seek("ÎâÃÏÍ©");
        StudentManager. change("ÎâÃÏÍ©");
        StudentManager.printAll();
        StudentManager.tuichu();
    }
}
