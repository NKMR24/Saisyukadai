public class Hero extends Character{
    private String weapon;

    public Hero(String name,int hp,String weapon) {
        super(name,hp);
        this.weapon = weapon;
    }

    @Override
    public void attack(Creature target) {
        System.out.println(this.getName() + "は" + this.getWeapon() + "で攻撃！");
        System.out.println(target.getName() + "に10のダメージを与えた！");
        target.setHp(target.getHp()-10);
        if (target.getHp() < 0) {
            target.setHp(0);
        }
    }
    public String getWeapon() {
        return weapon;
    }
    public void setWeapon(String weapon){
        this.weapon = weapon;
    }
}
