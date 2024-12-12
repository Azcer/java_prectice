public class Teacher extends Employee{
    public Teacher() {
    }

    public Teacher(String id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("员工正在教学");
    }
}
