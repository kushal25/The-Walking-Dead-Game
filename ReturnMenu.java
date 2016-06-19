import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReturnMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReturnMenu extends Actor
{
    public ReturnMenu()
    {
        GreenfootImage back = new GreenfootImage("back_button.png");
        back.scale(50,50);
        setImage (back);
    }
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new GameMenu());
        }
    }    
}
