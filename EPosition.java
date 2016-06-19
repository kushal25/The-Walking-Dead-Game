import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FeatureBrick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EPosition extends Actor implements IPosition
{
    /**
     * Act - do whatever the FeatureBrick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String s;
    
    public EPosition()
    {
        s="Adding features to brick ";
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
    
    public String getPosition()
    {
        return "Position is: ";
    }
    
    
    public void setPosition(int g)
    {
    }
}
