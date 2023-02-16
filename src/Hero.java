public class Hero {
    private int health;
    private int damage;
    private String superpower;
    public Hero(int health,int damage,String superpower){
        this.health=270;
        this.damage=20;
        this.superpower="power";

    }
    public Hero(int health,int damage){
        this.health=270;
        this.damage=20;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperpower() {
        return superpower;
    }
}


