import java.util.*;

public class FactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip Ship = null  ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the type of enemy ship (U/R/B)");
        String s = in.nextLine();
        Ship = shipFactory.EnemyShipBuild(s);
        if(Ship!=null)
        {
            DoStuff(Ship);
        }
        else System.out.print("Please enter U, R, or B next time");
    }



    public static void DoStuff(EnemyShip ship){
        ship.displayEnemyShip();
        ship.followHeroShip();
        ship.enemyShipShoots();

    }
    
}
