import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldBuilder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldBuilder
{

    public WorldBuilder()
    {
        // super(1000, 600, 1);
    }
    public PlayerLevel PrepareAndReturnLevel2 (){
     PlayerLevel level = new  PlayerLevel();
     level.addItem(new Level2BackGround());
      level.addItem(new Level2Booster()); 
     return  level;
   }   

     public PlayerLevel PrepareAndReturnLevel3 (){
        PlayerLevel level = new  PlayerLevel();
        level.addItem(new Level3BackGround());
        level.addItem(new Level3Booster());
        return level;
   }   
 
    
    
}
