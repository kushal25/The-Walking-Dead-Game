import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.Color;

/**
 * Write a description of class CheckScoreScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CheckScoreScreen extends ParentWorld
{

    /**
     * Constructor for objects of class CheckScoreScreen.
     * 
     */
    
    public CheckScoreScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);     
        
        
  
    
       
    }
    
    public void setter()
    {
        GreenfootImage bg = new GreenfootImage("back.jpg");
        bg.scale(1000,600);
           CheckScoreS s=new CheckScoreS();
           s.setKill(kills);
     addObject(s,500,250);
        setBackground(bg);
         prepare();
    }
    
    public void setZero()
    {
        kills=0;
    }
    
    
    public void prepare()
    {
          ReturnExit returnexit = new ReturnExit();
          addObject(returnexit, 515, 380);
        //returnmenu.setLocation(507, 372);
        //returnmenu.setLocation(503, 371);
          returnexit.setLocation(500, 530);
    }
}
