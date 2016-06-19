import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Bullets
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
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
        move(this.getSpeed() + 5);
        if(isAtEdge())
        {
            myWorldRef.removeObject(this);
        }
    }    
}
