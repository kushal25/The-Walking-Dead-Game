import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CheckScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CheckScore extends Actor
{
    /**
     * Act - do whatever the CheckScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */    
    //static GreenfootSound gameOver = new GreenfootSound("sounds/gameOver.mp3");
    public CheckScore()
    {
        GreenfootImage highScores = new GreenfootImage("checkScore.png");       
        highScores.scale(200,150);
        setImage(highScores);
    }
    public void act() 
    {
        // Add your action code here.
        
        if (Greenfoot.mouseClicked(this)){   
            CheckScoreScreen cs=new CheckScoreScreen();
            cs.setter();
           Greenfoot.setWorld(cs);
        }
    } 
        
}
