public class frog extends Animal{
    public frog() {
    }

    public frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + "在吃虫子");
    }
}
