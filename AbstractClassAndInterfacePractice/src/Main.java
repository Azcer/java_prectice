public class Main {
    public static void main(String[] args) {
        BasketballCoach bc = new BasketballCoach("zhangsan", 18);
        BasketballPlayer bp = new BasketballPlayer("lisi", 19);
        TablerennisCoach tv = new TablerennisCoach("wangwu",19);
        TabletennisPlayer tp = new TabletennisPlayer("zhaoliu",21);

        bc.teach();
        bp.play();
        tv.speak();
        tv.teach();
        tp.play();
        tp.speak();
    }
}