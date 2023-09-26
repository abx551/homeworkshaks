// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        Weapon weapon = new Weapon();
        boss.setIdol(500);
        boss.setUron(350);
        weapon.setAK47("AK47");
        weapon.setAvtomat("Avtomat");
        boss.setShax(weapon);
        System.out.println(boss.getUron());
        System.out.println(boss.getIdol());
        System.out.println(boss.getShax().getAK47());
        System.out.println(boss.getShax().getAvtomat());
    }
}