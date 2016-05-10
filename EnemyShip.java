
public abstract class EnemyShip 
{
    private String name;
    private double damage ;
    public void setName(String s)
    {
        name = s;
    }
    public  void setDamage(double x)
    {
    	damage = x;
    }
    public String getName()
    {
        return  name;
    }
    public double getDamage()
    {
        return damage;
    }
   

    public void displayEnemyShip()
    {
                System.out.println(name + " is on the screen");

    }
    public void followHeroShip()
    {

        System.out.println(name + " is following the hero");

    }

    public void enemyShipShoots() 
    {
        System.out.println(name + " attacks and does " + damage + " damage to hero");
    }

}