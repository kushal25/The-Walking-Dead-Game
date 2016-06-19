import greenfoot.*; 
import java.util.*;

/**
 * Write a description of class PlayerLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerLevel 
{
    List<WorldItem> items = new ArrayList<WorldItem>();
    /**
     * Constructor for objects of class PlayerLevel.
     * 
     */
    public PlayerLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //super(600, 400, 1); 
    }
    
    public void addItem(WorldItem item)
    {
        items.add(item);
    }
    
     public void removeItem(WorldItem item)
    {
         items.remove(item);
    }
    
    public WorldItem getLevelBackground()
    {
        return items.get(0);
    }
    
    public WorldItem getAllLevelBoosters()
    {
        return items.get(1);
    }
    
   
}
