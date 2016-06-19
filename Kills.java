import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.Color;

/**
 * Write a description of class AmmoAndClip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kills extends Actor
{
    int kills=0;
    /**
     * Act - do whatever the AmmoAndClip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void setKill(int i)
    {
        kills=i;
    }
    
    public void act() 
    {
        // Add your action code here.
        setImage(new GreenfootImage("Kill: " + kills + "\n", 20, Color.white, null));
    }
    
    
}