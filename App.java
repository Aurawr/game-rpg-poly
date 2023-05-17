public class App {
    
    public static void main(String[] args) {
        System.out.println("Implementasi Soal A");
        System.out.println("=====================================");
        Hero h = new Hero();
        Enemy e = new Enemy();
        h.move();
        h.move("south");
        System.out.println("_____________________________________");
        e.move();
        e.move(11);
        System.out.println("_____________________________________");
        System.out.println();
        System.out.println("Implementasi Soal B");
        System.out.println("=====================================");
        Character hero = new Hero();
        Character enemy = new Enemy();
        Character fighter = new Fighter();
        Character witch = new Witch();
        hero.move();
        fighter.move();
        enemy.move();
        witch.move();
        System.out.println("_____________________________________");
        System.out.println();
        System.out.println("Implementasi Soal C");
        System.out.println("=====================================");
        // Fighter f = (Fighter) witch;
        // f.move();
        ((Fighter)witch).move();

    }
}
