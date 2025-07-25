public abstract class Monster implements Creature {
    private String name;
    private int hp;
    private char suffix;

    public Monster(String name, int hp, char suffix) {
        this.name = name;
        this.hp = hp;
        this.suffix = suffix;
    }

    public final boolean isAlive() {
        return this.getHp() > 0;
    }

    @Override
    public void showStatus() {
        System.out.println("["+this.getName()+"]"+"["+this.getSuffix()+"]:HP ["+this.getHp()+"]");
    }

    @Override
    public String getName() {
        return name;
    }

    public int getHp(){
        return hp;
    }

    public char getSuffix(){
        return suffix;
    }

    public void setHp(int hp){
        this.hp = hp;
    }
}

