public abstract class Character implements Creature{
    private String name;
    private int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public final boolean isAlive() {
        return this.hp > 0;
    }

    @Override
    public void showStatus() {
        System.out.println("[" + this.getName() + "] :HP [" + this.getHp() + "]");
    }

    public String getName(){
        return name;
    }

    @Override
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}

