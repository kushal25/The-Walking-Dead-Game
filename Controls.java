import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Controls here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controls extends Actor
{
    private GameMenuInvoker menuInvoker = new GameMenuInvoker();
    private ControlsScreen cs = new ControlsScreen();
    private ICommand myGame = new ControlsCommand(cs);
    public Controls()
    {
        GreenfootImage controls = new GreenfootImage("controls.png");            
        setImage(controls);
    }
    
    public void act() 
    {
        menuInvoker.setCommand(myGame);
        if (Greenfoot.mouseClicked(this)){
            
            menuInvoker.clickMenuOption();
        }
    }    
}
