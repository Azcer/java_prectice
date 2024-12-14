public class TablerennisCoach extends Coach implements Speak{
    public TablerennisCoach() {
    }

    public TablerennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println(getName() + "教兵乓求");
    }

    @Override
    public void speak() {
        System.out.println(getName() + "说英语");
    }
}
