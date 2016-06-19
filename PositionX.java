import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ColorBrick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PositionX extends Position implements IPosition
{
    /**
     * Act - do whatever the ColorBrick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private IPosition b;
    private int l;
    
    public PositionX(IPosition t)
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
        String p=b.getPosition();
        
        
        return p+ "   X["+l+"]";
    }
    
    
    public void setPosition(int s)
    {
        l=s;
    }
}
