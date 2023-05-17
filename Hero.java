public class Hero extends Character{
    public void move(){
        System.out.println("Hero moves!");
    }
    public void move(String direction){
        System.out.println("Hero moves " + direction + "." );
    }
}
