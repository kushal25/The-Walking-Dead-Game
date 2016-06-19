import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HasAmmo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasAmmo extends Actor implements WeaponState
{
    /**
     * Act - do whatever the HasAmmo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    Arsenal hbp;
    Hero h;
    
    public HasAmmo(Arsenal bpRef, Hero hRef)
    {
        hbp = bpRef;
        h = hRef;
    }
    
    @Override
    public void fire()
    {
        hbp.setWeaponState(hbp.getPullTriggerState());
        h.getWorld().addObject(new Default(), h.getX(), h.getY());
        GreenfootSound gun_shot = new GreenfootSound("sounds/gun_shot.wav");
        gun_shot.play();     
        gun_shot.setVolume(70);
        hbp.ammo -= 1;
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
        if (hbp.clip > 0)
        {
            hbp.setWeaponState(hbp.getReloadState());
            hbp.clip -= 1;
            hbp.setAmmoInWeapon(35);
            GreenfootSound reload = new GreenfootSound("sounds/uReload.mp3");
            reload.play();
            hbp.setWeaponState(hbp.getHasAmmoState());
        }
    }
}
