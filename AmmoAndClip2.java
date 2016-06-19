import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.Color;

/**
 * Write a description of class AmmoAndClip2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AmmoAndClip2 extends Actor
{
    Arsenal aaa2;
    /**
     * Act - do whatever the AmmoAndClip2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setImage(new GreenfootImage("Clip: " + aaa2.clip, 20, Color.white, null));
    }
    
    public AmmoAndClip2(Arsenal aRef)
    {
        aaa2 = aRef;
    }
}
