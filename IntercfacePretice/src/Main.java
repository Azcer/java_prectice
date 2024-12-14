public class Main {
    public static void main(String[] args) {
        Rabbit r = new Rabbit("zhangsan",1);
        Frog f = new Frog("lisi",2);
        Dog d = new Dog("wangwu",3);

        r.eat();

        f.eat();
        f.swim();

        d.eat();
        d.swim();

    }
}