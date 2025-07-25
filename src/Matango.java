public class Matango extends Monster{

    public Matango(char suffix,int hp){
        super("マタンゴ",hp,suffix);
    }

    @Override
    public void attack(Creature target) {
        System.out.println(this.getName()+" "+this.getSuffix()+"は体当たり攻撃！");
        System.out.println(target.getName()+"に6のダメージを与えた！");
        target.setHp(target.getHp()-6);
        if (target.getHp() < 0) {
            target.setHp(0);
        }
    }
}
