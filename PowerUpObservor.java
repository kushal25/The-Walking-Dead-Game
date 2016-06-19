import greenfoot.*; 
import java.util.*;
/**
 * Write a description of class PowerUpObservor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerUpObservor extends GameObservorBase 
{
    // instance variables - replace the example below with your own
    private int x;
    private List<PowerUpObservor> observors = new ArrayList<PowerUpObservor>();
    /**
     * Constructor for objects of class PowerUpObservor
     */
    public PowerUpObservor()
    {

    } 

    /**
     * Notifies all observors
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void Notify(Actor actor)
    {

        for(PowerUpObservor observor: observors)
        {
            observor.update(actor);
        }
       
    }
   /** Attach listener 
   */
   public void attach(PowerUpObservor observor)
   {
        observors.add(observor);
   }
   
   /** Detach listener 
   */
   public void remove(PowerUpObservor observor)
   {
        observors.remove(observor);
   }

   public void update(Actor actor)
   {
       
   } 
}
 