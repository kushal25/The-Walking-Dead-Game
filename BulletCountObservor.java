import greenfoot.*; 
/**
 * Write a description of class BulletCountObservor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BulletCountObservor extends PowerUpObservor 
{
     // instance variables - replace the example below with your own
    private BulletBooster _bullets;

    /**
     * Constructor for objects of class BulletCountObservor
     */
    public BulletCountObservor()
    {
        _bullets = new BulletBooster();

    }

    /**
     * Updates observors in case bullet pack bonus is picked
     * 
     * @param  Actor   actor param
     * 
     */
   @Override
   public void update(Actor actor) 
    { 
        // put your code here
        String name = actor.getClass().getName();
        if(name == "BulletBooster")
        {
        Integer currentCount = BulletBooster.GetBulletBoosterCount();
        _bullets.SetBulletBoosterCount(currentCount+1);
        }

    }
    
   
}
 