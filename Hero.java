import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{   
    Arsenal a = new Arsenal(this);
    boolean isRDown = false;
    
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        moveAndAim();
        shoot();
    }
    /* get current arsenal */
     public Arsenal GetArsenal()
    {
        return a;
    }
    
    /**
     * moveAndAim - use keyboard "w, a, s, and d" to control movement; use mouse to aim
     *
     */
    public void moveAndAim()
    {
        // turn towards mouse when mouse moves
        if (Greenfoot.mouseMoved(null) || Greenfoot.mouseDragged(null))
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if (mouse != null) turnTowards(mouse.getX(), mouse.getY());
        }
        int dx = 0, dy = 0; // 2D axis coordinates
        int moveSpeed = 2;
        MyWorld refi=(MyWorld)getWorld();
        if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left") )
        {
            MyWorld ref=(MyWorld)getWorld();
            dx--;
            ref.add();
            
            setLocation(getX() + moveSpeed*dx, getY() + moveSpeed*dy);
            
            ref.setP(getX(),getY());
            
            if(ref.checkCount())
            {  
            ref.moveIt();
            }
            
            return;
        }
 
        if (Greenfoot.isKeyDown("d")|| Greenfoot.isKeyDown("right")) 
        { 
            MyWorld ref=(MyWorld)getWorld();
            dx++;
            ref.subtract();
            setLocation(getX() + moveSpeed*dx, getY() + moveSpeed*dy);
            
            ref.setP(getX(),getY());
             
            if(ref.checkCount())
            {
              ref.moveIt();
            }
              return;
        }
        
        if (Greenfoot.isKeyDown("w")|| Greenfoot.isKeyDown("up"))
        {
        dy--;
        setLocation(getX() + moveSpeed*dx, getY() + moveSpeed*dy);
        refi.setP(getX(),getY());
        return;
    }
        if (Greenfoot.isKeyDown("s")|| Greenfoot.isKeyDown("down")) 
        {
        dy++;
        setLocation(getX() + moveSpeed*dx, getY() + moveSpeed*dy);
        refi.setP(getX(),getY());
        return;
    }
        
    }
    
    /**
     * shoot - when left click mouse keys, shoots bullets from the hero
     *
     */
    public void shoot()
    {
        // put your code here
        if (Greenfoot.mouseClicked(null))
        {
            a.fire();
        }
        if (Greenfoot.isKeyDown("r"))
        {
            if(!isRDown)
           {
               a.reload();
               isRDown = true;
           }
        }
        else
        {
            isRDown = false;
        }
    }
}
