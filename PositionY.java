import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SizeBrick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PositionY extends Position implements IPosition
{
    /**
     * Act - do whatever the SizeBrick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private IPosition b;
    private int g;
    
    public PositionY(IPosition t)
    {
        super(t);
        b=t;
    }
    
    public void act() 
    {
        // Add your action code here.
    }
    
    public String getPosition()
    {
        String f=b.getPosition();
        
        
        return f+" "+"Y["+g+"]";
    }
    
    
    public void setPosition(int s)
    {
        g=s;
    }
    
}


