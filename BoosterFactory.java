import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Construct different kind of boosters here
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BoosterFactory 
{
    /**
     * Act - do whatever the BoosterFactory wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BoosterPack GetBooster(GameEnum.BOOSTERTYPE boosterType) 
    {
        if(boosterType == GameEnum.BOOSTERTYPE.LIFE)
        {
            return new LifeLine();
        }
        else if(boosterType == GameEnum.BOOSTERTYPE.BULLET)
        {
            return new BulletBooster();
        }
        return new BoosterPack();
        
    }    
}
