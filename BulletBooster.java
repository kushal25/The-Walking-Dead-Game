import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BulletBooster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BulletBooster extends BoosterPack
{
    GreenfootImage i;
    private static int _bulletBoosterCount = 0;
    private static  MyWorld _world = null;
    private boolean used=false;
    /** 
     * Act - do whatever the BulletBooster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BulletBooster()
    {
    }
 
     public void act() 
    {

         if (isTouching(Hero.class))
        {
            MyWorld world=(MyWorld)getWorld();
            _world = world;
            used=true;
            getWorld().removeObject(this);
            if(world.GetHero()!=null)
            {
                Arsenal a = world.GetHero().GetArsenal();
              //  a.addAmmo(35);
                a.addClip(1);
            }
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
   
    public boolean unUsed()
    {
        return used;
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
    
    public void Image(GreenfootImage s){
        i = s; 
        setImage(i);
    }
    /**
     * Getter for lifeline
     *  
     */ 
      public static int GetBulletBoosterCount()
    {
        return _bulletBoosterCount; 
    }
  
     public static void ResetBulletBoosterCount()
    {
       _bulletBoosterCount = 0;
    }
       
      /**
     * Setter for BulletBooster
     * 
     */
    public void SetBulletBoosterCount(int bulletBoosterCount)
    {
         _bulletBoosterCount=bulletBoosterCount;
          if(_world!=null)
          {
                _world.UpdateWorldBulletBoostCounter(_bulletBoosterCount); 
           }
      
       
    }
}
 