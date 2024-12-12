import java.util.Random;

public class role {

    // 属性
    private String name;
    private int blood;
    private int energy;

    // 方法

    public role() {
    }

    public role(String name) {
        this.name = name;
        this.blood = 100;
        this.energy = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }



    // 角色信息显示
    public void showInfo(){
        System.out.println("姓名: " + this.name);
        System.out.println("血量: " + this.blood);
        System.out.println("蓝量: " + this.energy);
    }

    // 能量增长
    public void increaseEnergy() {
        Random rd = new Random();
        int randInt = rd.nextInt(20);
        if (this.energy + randInt >= 100) {
            this.energy = 100;
        }else{
            this.energy += randInt;
        }
        System.out.println(this.name + "获得了" + randInt + "能量");
    }

    // 攻击
    public void attack(role attacker) {
        Random r = new Random();
        int randomInt = r.nextInt(5);
        attacker.blood -= randomInt;
        System.out.println(this.name + "对" + attacker.name + "进行了攻击造成了" + randomInt + "伤害");
        this.increaseEnergy();
    }

    // 大招
    public void skill(role attacker){
        if(this.energy != 100){
            System.out.println("能量不够不能释放大招！");
            return;
        }
        Random r = new Random();
        int randomInt = r.nextInt(50);
        attacker.blood -= randomInt;
        System.out.println(this.name + "对" + attacker.name + "使用了技能造成了" + randomInt + "伤害");
        this.energy = 0;
    }
}
