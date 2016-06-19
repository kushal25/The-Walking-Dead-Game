import greenfoot.*;
/**
 * Write a description of class InstructionsCommand here.
 * 
 * @author Kushal
 * @version 1.0 / 04-30-2016
 */
public class InstructionsCommand implements ICommand  
{
    private InstructionsScreen is;

    public InstructionsCommand(InstructionsScreen is)
    {
        this.is = is;
    }
    
     public void execute ()
    {
        Greenfoot.setWorld(is);        
    }
    
    

   
}
