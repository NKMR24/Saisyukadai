public class Wizard extends Character{
    private int mp;

    public Wizard(String name, int hp, int mp) {
        super(name, hp);
        this.mp = 30;
    }

    @Override
    public void attack(Creature target) {
        System.out.println(this.getName() + "は火の玉をとなえた！" );
        System.out.println(target.getName() + "に3のダメージを与えた！");
        target.setHp(target.getHp() - 3);
        this.setMp(this.getMp() - 1);
        if (target.getHp() < 0) {
            target.setHp(0);
        }
    }

    public int getMp() {
        return mp;
    }
    public void setMp(int mp) {
        this.mp = mp;
    }
}

