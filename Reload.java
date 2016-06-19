import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Reload here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reload extends Actor implements WeaponState
{
    /**
     * Act - do whatever the Reload wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    Arsenal hbp;
    Hero h;
    
    public Reload(Arsenal bpRef, Hero hRef)
    {
        hbp = bpRef;
        h = hRef;
    }
    
    @Override
    public void fire()
    {
        
    }
    
    @Override
    public void addAmmo(int newAmmo)
    {
        if (newAmmo > 0)
        {
            hbp.ammo += newAmmo;
            if (hbp.ammo > 35)
            {
                hbp.ammo = 35;
            }
        }
    }
    
    @Override
    public void addClip(int newClip)
    {
        hbp.clip += newClip;
    }
    
    @Override
    public void reload()
    {
        // delay weapon for a few seconds
    }
}
