
public class EnemyShipFactory {
    public EnemyShip EnemyShipBuild(String name){
        if(name.equals("U")) return new UfoEnemyShip();
        else if (name.equals("R")) return new RocketEnemyShip();
        else if (name.equals("B"))return new BIGUFOEnemyShip();
        else return null;
    }
}
