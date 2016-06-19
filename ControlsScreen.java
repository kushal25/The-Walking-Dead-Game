import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ControlsScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlsScreen extends World
{

    /**
     * Constructor for objects of class ControlsScreen.
     * 
     */
    public ControlsScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        GreenfootImage controlScreen = new GreenfootImage("controlsScreen.jpg");
        controlScreen.scale(1000,600);
        setBackground(controlScreen);
        prepare();
    }
    
    private void prepare()
    {
        ReturnMenu returnmenu = new ReturnMenu();
        addObject(returnmenu, 515, 380);
        //returnmenu.setLocation(507, 372);
        //returnmenu.setLocation(503, 371);
        returnmenu.setLocation(300, 530);
    }
}
