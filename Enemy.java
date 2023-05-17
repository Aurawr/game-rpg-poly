public class Enemy extends Character {
    public void move(){
        System.out.println("Enemy moves!");
    }
    public void move(int step){
        System.out.println("Enemy moves " + step + " steps.");
    }
}
