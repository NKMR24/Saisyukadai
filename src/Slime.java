public final class Slime extends Monster{

    public Slime(char suffix, int hp){
        super("スライム",hp,suffix);
    }

    @Override
    public void attack(Creature target) {

        System.out.println(this.getName() + " " + this.getSuffix() + "は体当たり攻撃！");
        System.out.println(target.getName() + "に5のダメージを与えた！");
        target.setHp(target.getHp() - 5);
        if (target.getHp() < 0) {
            target.setHp(0);
        }
    }
}
