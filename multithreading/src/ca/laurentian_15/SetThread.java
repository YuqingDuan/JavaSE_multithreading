package ca.laurentian_15;

public class SetThread implements Runnable {
    private Student s;

    public SetThread(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        // Student s = new Student();
        s.name = "林青霞";
        s.age = 27;
    }
}
