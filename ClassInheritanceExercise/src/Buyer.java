public class Buyer extends AdminStaff{
    public Buyer() {
    }

    public Buyer(String id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("采购员正在采购");
    }
}
