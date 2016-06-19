import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Actor
{
    private GameMenuInvoker menuInvoker = new GameMenuInvoker();
    private InstructionsScreen is = new InstructionsScreen();
    private ICommand myGame = new InstructionsCommand(is);
    public Instructions()
    {
        GreenfootImage instructions = new GreenfootImage("instructions.png");            
        setImage(instructions);    
    }
    
    public void act() 
    {
        menuInvoker.setCommand(myGame);
        if (Greenfoot.mouseClicked(this)){
            
            menuInvoker.clickMenuOption();
        }
    }    
}
