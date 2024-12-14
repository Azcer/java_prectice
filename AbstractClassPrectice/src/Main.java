public class Main {
    public static void main(String[] args) {
        Animal[] a = new Animal[3];
        a[0] = new frog("张三", 12);
        a[1] = new Dog("李四 ", 18);
        a[2] = new Sheep("王五", 20);

        a[0].drink();
        a[0].eat();

        a[1].drink();
        a[1].eat();

        a[2].drink();
        a[2].eat();
    }
}