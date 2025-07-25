public class Goblin extends Monster{

    public Goblin(char suffix, int hp) {
        super("ゴブリン",hp,suffix);
    }

    @Override
    public void attack(Creature target) {
        System.out.println(this.getName() + " " + this.getSuffix() + "はナイフで切りつけた！");
        System.out.println(target.getName() + "に８のダメージを与えた！");
        target.setHp(target.getHp()-8);
        if (target.getHp() < 0) {
            target.setHp(0);
        }
    }
}

