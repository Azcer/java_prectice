public class Frog extends Animal implements Swim{
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+"吃虫子");
    }

    @Override
    public void swim() {
        System.out.println(getName()+"在蛙泳");
    }
}
