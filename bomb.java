import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomb extends BoosterPack
{
     GreenfootImage i;
     private boolean used=false;
    /**
     * Act - do whatever the bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if (isTouching(Hero.class))
        {
        Actor hero;
        hero = getOneObjectAtOffset(0, 0, Hero.class);
          used=true;
          World world = getWorld();
          world.removeObject(hero);                        
          Greenfoot.setWorld(new ExitScreen());   
          
        }
        // Add your action code here.
    }    
    
      public void Image(GreenfootImage s){
        i = s; 
        setImage(i);
    }
    
     public boolean unUsed()
    {
        return used;
    }
}
