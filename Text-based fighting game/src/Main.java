import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int select = sc.nextInt();
            switch (select) {
                // 退出游戏
                case 0:
                    System.exit(0);
                    break;

                // 开始游戏
                case 1:
                    starGame();
                    break;
            }
        }
    }

    // 显示界面
    public static void showMenu() {
        System.out.println("文字版格斗游戏");
        System.out.println("1.开始游戏");
        System.out.println("0.退出游戏");
    }

    // 创建角色
    public static role createRole() {
        System.out.println("请输入你要创建角色的名字：");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        role tmp = new role(name);
        clear();
        System.out.println("创建成功！");
        tmp.showInfo();
        System.out.println("按回车继续");
        sc.nextLine();
        clear();
        return tmp;
    }

    // 清屏
    public static void clear() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    // 开始游戏
    public static void starGame() {
        System.out.println("创建角色1");
        role r1 = createRole();
        System.out.println("创建角色2");
        role r2 = createRole();
        int actionParty;
        System.out.println("随机选边");
        Random rd = new Random();
        if(rd.nextBoolean()){
            actionParty = 1;
            System.out.println("玩家二先手！");
        }else{
            actionParty = 0;
            System.out.println("玩家一先手");
        }
        while(r1.getBlood() > 0 && r2.getBlood() > 0){
            int select;
            if(actionParty == 0){
                actionParty = 1;
                System.out.println("玩家一行动：");
                System.out.println("1.普通攻击");
                System.out.println("2.大招");
                System.out.println("3.查看信息");
                select = sc.nextInt();
                switch (select){
                    case 1:
                        r1.attack(r2);
                        break;
                    case 2:
                        if(r1.getEnergy() < 100){
                            actionParty = 0;
                        }
                        r1.skill(r2);
                        break;
                    case 3:
                        r1.showInfo();
                        actionParty = 0;
                        break;
                }
                if(r2.getBlood()<=0)
                    break;
            }
            if(actionParty == 1){
                actionParty = 0;
                System.out.println("玩家二行动：");
                System.out.println("1.普通攻击");
                System.out.println("2.大招");
                System.out.println("3.查看信息");
                select = sc.nextInt();
                switch (select){
                    case 1:
                        r2.attack(r1);
                        break;
                    case 2:
                        if(r2.getEnergy() < 100){
                            actionParty = 1;
                        }
                        r2.skill(r1);
                        break;
                    case 3:
                        r2.showInfo();
                        actionParty = 1;
                        break;
                }
                if(r1.getBlood()<=0)
                    break;
            }
        }
        if(r1.getBlood() <= 0){
            System.out.println("玩家二获胜");
        }else{
            System.out.println("玩家一获胜");
        }
    }
}
