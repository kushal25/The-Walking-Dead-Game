import greenfoot.*;
/**
 * Write a description of class ControlsCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlsCommand implements ICommand 
{
    private ControlsScreen cs;
    
    public ControlsCommand (ControlsScreen cs){
        this.cs = cs;
    }
    
    public void execute ()
    {
        Greenfoot.setWorld(cs);
        //Greenfoot.setWorld(new GameControls());
    }
    

   
}
