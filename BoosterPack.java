import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/** 
 * Write a description of class BoosterPack here.
 * 
 * @author (your name) 
 * @version (a ver sion number or a date)
 */ 
public class BoosterPack extends Actor
{
    GreenfootImage i;
    private PowerUpObservor _powerUpObserver;
    /**
     * Act - do whatever the BoosterPack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public void Image(GreenfootImage s){
        i = s; 
        setImage(i); 
    }
    
    public void act() 
    {
        // Add your action code here.
        MyWorld world=(MyWorld)getWorld();
        Actor actorZom = getOneIntersectingObject(BoosterPack.class);
        if(actorZom != null){
           // world.UpdateWorldBoostCounter(lifeLineCount,bulletBoosterCount); 
          }
        
    }   
    
    public void Notify(Actor booster)
    {
        _powerUpObserver = new PowerUpObservor();
        _powerUpObserver.attach(new LifeLineObservor());
        _powerUpObserver.attach(new BulletCountObservor());
        _powerUpObserver.Notify(booster);
        
    }
}
 