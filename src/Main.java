public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setBossDefence("Magical");
        System.out.println("Boss health:" + boss.getHealth() + " " + "boss damage:" + boss.getDamage() + " " + "boss defence:" + boss.getBossDefence());


    }


}
    