import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Actor
{
    public Exit()
    {
        GreenfootImage exit = new GreenfootImage("exit.png");            
        setImage(exit); 
    }
    
    public void act() 
    {       
         if (Greenfoot.mouseClicked(this)){
             Greenfoot.stop();
        }
    }    
}
