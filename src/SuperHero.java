public class SuperHero extends Hero {
    public SuperHero(Hero hero) {
        super(hero.getName(),hero.getHp(), hero.getWeapon());
    }

    @Override
    public void attack(Creature target) {
        System.out.println(this.getName() + "は" + this.getWeapon() + "で攻撃！");
        System.out.println(target.getName() + "に25のダメージを与えた！");
        target.setHp(target.getHp() - 25);
        if (target.getHp() < 0) {
            target.setHp(0);
        }
    }
}