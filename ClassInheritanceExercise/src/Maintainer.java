public class Maintainer extends AdminStaff{
    public Maintainer(String id, String name, int salary) {
        super(id, name, salary);
    }

    public Maintainer() {
    }

    @Override
    public void work() {
        System.out.println("维护专员正在维护");
    }
}
