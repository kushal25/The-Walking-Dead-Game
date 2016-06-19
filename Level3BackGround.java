/**
 * Write a description of class PlayerLevel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*; 
public class Level3BackGround implements WorldItem 
{
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
        return 4000;
    }
    
    public BoosterPack[] getLevelBoosters()
    {
        bombs=new bomb[6];
        
        for (int i=0 ; i < 6 ; i++)
        {
                GreenfootImage lifelineimg =new GreenfootImage("bomb1.png");
                bombs[i] = new bomb();
                bombs[i].Image(lifelineimg);

        
        }   
        return bombs;
    }
}
