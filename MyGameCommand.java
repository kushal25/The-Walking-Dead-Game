import greenfoot.*;
/**
 * Write a description of class MyGameCommand here.
 * 
 * @author Kushal 
 * @version 1.0 / 04-20-2016
 */
public class MyGameCommand implements ICommand
{
    // instance variables - replace the example below with your own
    private MyWorld myworld;

    /**
     * Constructor for objects of class MyGameCommand
     */
    public MyGameCommand(MyWorld myworld)
    {
        this.myworld = myworld;
    }

    public void execute()
    {
        Greenfoot.setWorld(myworld);
    }
}
