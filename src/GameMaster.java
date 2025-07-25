import java.util.ArrayList;

public class GameMaster {

    public static void main(String[] args) {


        ArrayList<Character> party = new ArrayList<>();
        Hero hero = new Hero("勇者", 100, "剣");
        Wizard wizard = new Wizard("魔法使い", 60, 30); // mpはWizardクラスのコンストラクタで初期化される
        Thief thief = new Thief("盗賊", 70);
        party.add(hero);
        party.add(wizard);
        party.add(thief);


        ArrayList<Monster> monsters = new ArrayList<>();
        Goblin goblinA = new Goblin('A', 50);
        Matango matangoA = new Matango('A', 45);
        Slime slimeA = new Slime('A', 40);
        monsters.add(goblinA);
        monsters.add(matangoA);
        monsters.add(slimeA);


        System.out.println("--- 味方パーティ ---");
        for (Character c : party) {
            c.showStatus();
        }
        System.out.println("--- 敵グループ ---");
        for (Monster m : monsters) {
            m.showStatus();
        }


        System.out.println("味方の総攻撃！");
        for (Character attacker : party) {
            for (Monster target : monsters) {
                if (attacker.isAlive() && target.isAlive()) {
                    attacker.attack(target);
                }
            }
        }

        System.out.println("敵の総攻撃！");
        for (Monster attacker : monsters) {
            if (attacker.isAlive()) {

                for (Character target : party) {
                    if (target.isAlive()) {
                        attacker.attack(target);
                    }
                }
            }
        }


        System.out.println("ダメージを受けた勇者が突然光だした！");

        System.out.println("勇者はスーパーヒーローに進化した！");
        SuperHero superHero = new SuperHero(hero);

        party.set(party.indexOf(hero), superHero);


        if (superHero.isAlive() && goblinA.isAlive()) {
            superHero.attack(goblinA);
        }

        if (superHero.isAlive() && matangoA.isAlive()) {
            superHero.attack(matangoA);
        }

        if (superHero.isAlive() && slimeA.isAlive()) {
            superHero.attack(slimeA);
        }


        System.out.println("--- 味方パーティ最終ステータス ---");
        for (Character c : party) {
            System.out.print(c.getName() + ": HP " + c.getHp() + " ");
            System.out.println("生存状況: " + (c.isAlive() ? "生存" : "死亡"));
        }

        System.out.println("--- 敵グループ最終ステータス ---");
        for (Monster m : monsters) {
            System.out.print(m.getName() + m.getSuffix() + ": HP " + m.getHp() + " ");
            System.out.println("生存状況: " + (m.isAlive() ? "生存" : "討伐済み"));
        }
    }
}

