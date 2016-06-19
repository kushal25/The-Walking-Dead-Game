import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Default here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Default extends Bullets
{
    /**
     * Act - do whatever the Default wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // get a reference of the world so that to get a ref of the hero
        MyWorld myWorldRef = (MyWorld)getWorld();
        Hero heroRef = myWorldRef.getHero();
        if (getSetRot() != true)
        {
            setSetRot(heroRef.getRotation());
        }
        move(this.getSpeed());
        
       if(hit(Zombie.class)||hit(ZombieNew.class)){
            myWorldRef.setKill(1);
            getWorld().removeObject(this);
            
        }
        
       else if(isAtEdge())
        {
          getWorld().removeObject(this);  
        }
        
       /* if(isAtEdge())
        {
            myWorldRef.removeObject(this);
        }*/
    } 
    
    public boolean hit(Class cl){
        Actor actorZom = getOneIntersectingObject(cl);
        if(actorZom != null){
           getWorld().removeObject(actorZom);
           //commented as of now to finalize logic
           //super.Notify(actorZom);
           return true;
        }
        return false;
    }
}
