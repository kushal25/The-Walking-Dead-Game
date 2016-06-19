import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameName here.
 * 
 * @author Kushal 
 * @version 1.0 / 04-24-2016
 */
public class GameName extends Actor
{
    private GameMenuInvoker menuInvoker = new GameMenuInvoker();
    private MyWorld myWorld = new MyWorld();
    private ICommand myGame = new MyGameCommand(myWorld); 
    private GifImage gif;
    public GameName ()
    {        
          gif = new GifImage("start.gif");              
    }
    
    public void act() 
    {
         setImage(gif.getCurrentImage());
    }    
}
