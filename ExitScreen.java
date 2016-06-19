import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExitScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExitScreen extends World
{

    /**
     * Constructor for objects of class ExitScreen.
     * 
     */
    private CheckScore checkScore;
  
    private PlayAgain playAgain = new PlayAgain();
    private MyWorld  myworld = new MyWorld();
    static GreenfootSound gameOver = new GreenfootSound("sounds/gameOver.mp3");
    public long survval;
    public ExitScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        myworld.stopped();
        GreenfootImage bg = getBackground();
        bg.scale(1000,600);                 
      
    }
    
     
    
    public void act()
    {
        if(gameOver.isPlaying() == false)
         {
             gameOver.playLoop();
             gameOver.setVolume(70);
         }
    }
    
    public void prepare()
    {        
        checkScore=new CheckScore(survval);
        addObject(checkScore, 330, 530);
        addObject(playAgain, 660, 520);
    }
    
    public void stopped()
    {
        gameOver.pause();
    }
    
}
