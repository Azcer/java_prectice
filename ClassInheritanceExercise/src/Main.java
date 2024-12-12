public class Main {
    public static void main(String[] args) {
        Lecturer l = new Lecturer("123","张三",100);
        l.work();
        l.showInfo();

        Tutor t = new Tutor("1232", "李四", 1000);
        t.work();
        t.showInfo();

        Maintainer m = new Maintainer("32132","王五", 1231);
        m.work();
        m.showInfo();

        Buyer b = new Buyer("321321", "赵六", 32134);
        b.work();
        b.showInfo();
    }
}