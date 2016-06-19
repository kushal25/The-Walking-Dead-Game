import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.Color;
/**
 * Write a description of class InstructionsScreen here.
 * 
 * @author Kushal
 * @version 1.0 / 04-30-2016
 */
public class InstructionsScreen extends World
{

    /**
     * Constructor for objects of class InstructionsScreen.
     * 
     */
    gameContents gc = new gameContents();
    public InstructionsScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        GreenfootImage bg = new GreenfootImage("back.jpg");
        bg.scale(1000,600);
        setBackground(bg);
        bg.setFont(new Font("SERIF", Font.BOLD, 16));
        bg.setColor(Color.black); 
        bg.drawString("1. The Key to survive this Zombie Apocalypse is to keep collecting bullets to kill zombies.",50, 100);
        bg.drawString("2. Since zombies follow you, moving around and killing them will make sure you survive long.",50, 130);      
        bg.drawString("3. Keeping shooting in all directions. This helps in zombies not piling up from a single end.",50, 160);
        bg.drawString("4. We recommend you to use an external mouse rather than the mousepad for better experience.", 50, 190);
        bg.drawString("5. Keep Reloading the gun for more bullets.", 50, 220);       
        bg.drawString("6. Below are the things you would see inside the game.", 50, 250);
        addObject(gc, 250, 400);
        prepare();
        
    }
    
    public void prepare()
    {
          ReturnMenu returnmenu = new ReturnMenu();         
          addObject(returnmenu, 515, 380);
        //returnmenu.setLocation(507, 372);
        //returnmenu.setLocation(503, 371);
          returnmenu.setLocation(500, 530);
    }
}