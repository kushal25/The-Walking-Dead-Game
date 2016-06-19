/**
 * Write a description of class PlayerLevel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*; 
public class Level2BackGround implements WorldItem 
{
    private int[] xL;
    private int[] yL;  
    private bomb[] bombs;
    private BoosterPack[] BoosterPacks;
    public String WorldBackGroundImgName()
    {
        return "Game.jpg";
    }
    public int PlayerLevel()
    {
        return 1;
    }
    public int PlayerScore()
    {
        return 1000;
    }
    public int scoreThresholdForNextLevel()
    {
        return 2000;
    }
    
      public BoosterPack[] getLevelBoosters()
    {
        int xcord = 640;
        int ycord = 600;
        xL=new int[10]; 
        yL=new int[10];
        bombs=new bomb[20];
        
        for (int i=0 ; i < 5 ; i++)
        {
                GreenfootImage lifelineimg =new GreenfootImage("bomb.gif");
                bombs[i] = new bomb();
                bombs[i].Image(lifelineimg);
                //xL[i]=getRandomNumber(50,1000);
                //yL[i]=getRandomNumber(0,1000);
                //addObject(bombs[i],xL[i],yL[i]); 
        
        }   
        return bombs;
    }
}
