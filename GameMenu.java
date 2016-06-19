import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameMenu extends World
{
    private StartGame startgame = new StartGame();
    private GameName gameName = new GameName();
    private Controls controls = new Controls();
    private Exit exit = new Exit();
    private Instructions instructions = new Instructions();
    static GreenfootSound menu_music = new GreenfootSound("menu.wav");
    static GreenfootSound gamesound = new GreenfootSound("gameSound.wav");
    static GreenfootSound zombiesSound = new GreenfootSound("sounds/zombies.wav");
    //GreenfootSound click = new GreenfootSound("click.wav");     
    /**
     * Constructor for objects of class GameMenu.
     * 
     */
    public GameMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        GreenfootImage gameMenuBackground = new GreenfootImage("menu_background.jpg");
        gameMenuBackground.scale(1000,600);
        setBackground(gameMenuBackground);     
        prepare();
    }
    
    private void prepare()
    {
        addObject(startgame,250,320);
        addObject(gameName,250,70);   
        addObject(controls, 250, 380);
        addObject(instructions, 250, 440);
        addObject(exit, 250, 500);
    }
    
    public void act()
    {      
        if(menu_music.isPlaying() == false)
         {
             menu_music.playLoop();
             menu_music.setVolume(100);
         }              
        
        if ( Greenfoot.mouseClicked(startgame))
        {
            menu_music.stop();
            gamesound.playLoop();
            gamesound.setVolume(50);
            zombiesSound.playLoop();
            zombiesSound.setVolume(40);
            
        }      
    }
    
    public void stopped()
    {
        gamesound.pause();
        menu_music.pause();
        zombiesSound.pause();
    }
    
    
    
    
}
