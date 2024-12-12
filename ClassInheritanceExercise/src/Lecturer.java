public class Lecturer extends Teacher{
    public Lecturer(String id, String name, int salary) {
        super(id, name, salary);
    }

    public Lecturer() {
    }

    @Override
    public void work() {
        System.out.println("讲师正在教学");
    }
}
