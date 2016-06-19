import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Bullets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullets extends Actor
{
    /**
     * Act - do whatever the Bullets wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private boolean setRot = false;
    private int speed = 15;
    private int _bulletCount = 0;
    private PowerUpObservor _powerUpObserver = new PowerUpObservor();
    public boolean getSetRot()
    {
        return setRot;
    }
    
    /**
     * setSetRot - set the rotation of the bullet, mark rotation as set
     *
     * @param  newRot   new rotation
     */
    public void setSetRot(int newRot)
    {
        setRotation(newRot);
        setRot = true;
    }
    
    /**
     * getSpeed - get the speed of this bullet, default is 15
     */
    public int getSpeed()
    {
        return speed;
    }
    
    /**
     * setSpeed - set the speed of the bullet
     *
     * @param  y   new speed
     */
    public void setSpeed(int s)
    {
        // put your code here
        speed = s;
    }
    
    public void act()
    {
        
    }    
    
    public int GetBulletCount()
    {
        return _bulletCount;
    }
    public void SetBulletCount(int bulletCount)
    {
        _bulletCount = bulletCount;
    } 
    
    public void Notify(Actor zombie)
    {
        _powerUpObserver.attach(new LifeLineObservor());
        _powerUpObserver.attach(new BulletCountObservor());
        _powerUpObserver.Notify(zombie);
        
    }
    
}
