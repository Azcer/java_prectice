public class Employee {

    private String id;
    private String name;
    private int salary;

    public Employee() {
    }

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // 工作
    public void work(){
        System.out.println("员工在工作");
    }

    //展示信息
    public void showInfo(){
        System.out.println("id: "+ id + ",姓名: " + name + ",工资: " + salary);
    }
}
