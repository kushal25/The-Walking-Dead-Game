import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Brick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Position extends Actor implements IPosition
{
    /**
     * Act - do whatever the Brick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected IPosition y;
    
    public Position(IPosition t)
    {
        y=t;
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
