public class AdminStaff extends Employee{
    public AdminStaff() {
    }

    public AdminStaff(String id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("员工正在办公");
    }
}