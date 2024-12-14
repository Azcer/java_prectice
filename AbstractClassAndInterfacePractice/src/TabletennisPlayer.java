public class TabletennisPlayer extends Player implements Speak{
    public TabletennisPlayer() {
    }

    public TabletennisPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println(getName() + "打兵乓求");
    }

    @Override
    public void speak() {
        System.out.println(getName() + "说英语");
    }
}
