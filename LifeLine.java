import greenfoot.*; 
import java.util.ArrayList;
import java.util.List;
 // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LifeLineCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifeLine extends BoosterPack
{ 
    GreenfootImage i;
    private static int _lifelineCount = 0;
    private static  MyWorld _world = null;
    private boolean used=false;
    
    public LifeLine()
    {
    }
   
      public boolean unUsed()
    {
        return used;
    }
    
    
     public void Image(GreenfootImage s){
        i = s; 
        setImage(i);
    }
    
    public void act() 
    {
        // Add your action code here.
      
        if (isTouching(Hero.class))
        {
            MyWorld world=(MyWorld)getWorld();
            _world = world;
            used=true;
            getWorld().removeObject(this);
            super.Notify(this);
    
            
        }
         
        if(used==false)
        {
               if(atWorldEdge())
        {
            this.getImage().setTransparency(0);
        }
        else
        {
            this.getImage().setTransparency(255);
        }
        } 
    }  
    
       /**
     * Test if we are close to one of the edges of the world. Return true is we are.
     */
    public boolean atWorldEdge()
    {
        if(getX() < 20 || getX() > getWorld().getWidth() - 20)
            return true;
        if(getY() < 20 || getY() > getWorld().getHeight() - 20)
            return true;
        else
            return false;
    }
    
     public static void ResetLifeBoosterCount()
    {
       _lifelineCount = 0;
    }
 
    /**
     * Getter for lifeline
     * 
     */
      public static int GetLifeLine()
    {
        return _lifelineCount;  
    }
    
      /**
     * Setter for lifeline
     * 
     */
    public void SetLifeLine(int lifelineCount, boolean isLifeReduced)
    {
         if(isLifeReduced && lifelineCount > 0)
         {
             lifelineCount -=1;
         }
         else
         {
             lifelineCount +=1;
            }
        _lifelineCount=lifelineCount;
         //UpdateBoosterLifeLine(_lifelineCount);
          if(_world!=null)
          {
                _world.UpdateWorldLifeBooster(_lifelineCount); 
           }
        
        
    }
    
  
}
 