import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ZombieActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZombieActor extends Actor
{
    protected static final int SMOOTH = 200; //divides the rotation and movement ints for smooth movements
    
    private int zX, zY; // Zombie location coordinates
    private int vX, vY; // Zombie speeds along the horizontal axis and the vertial axis
    private int zR; // Zombie rotation
    BoosterFactory boosterFactory = new BoosterFactory();
    public long end;
    public void move()
    {
        zX += vX; // adjust x coordinate value according to horizontal speed
        zY += vY; // adjust y coordinate value according to vertical speed
        super.setLocation(zX/SMOOTH, zY/SMOOTH); // set current location of actor
       
    }    
    
    public void setLocation(int x, int y)
    {
        super.setLocation(x, y); // set location of actor
        zX = getX()*SMOOTH; // set Zombie's x coordinate 
        zY = getY()*SMOOTH; // set Zombie's y coordinate
    }
        
    public void turn(int amount)
    {
        zR = (zR+amount); // adjust the zombie rotation
        super.setRotation(zR/SMOOTH); // set rotation
    }
        
    public void turnTowards(int x, int y)
    {
        super.turnTowards(x, y); // turn towards point
        zR = getRotation()*SMOOTH; // set rotation
    }
      
    public void setRotation(int angle)
    {
        super.setRotation(angle); // set rotation
        zR = getRotation()*SMOOTH; // set smooth rotation
    }    
    
    public void addForce(int amount, int direction)  // adds extra speed to zombie movement as it approaches the hero
    {
        vX += Math.cos((double)direction*Math.PI/(180*SMOOTH))*(double)amount; // after adding horizontal speed
        vY += Math.sin((double)direction*Math.PI/(180*SMOOTH))*(double)amount; // after adding vertical speed
    }
    
    public void move(int amount, int direction)
    {
        int holdX = vX, holdY = vY; // save the current speeds
        vX = 0; vY = 0; // clear the values
        addForce(amount, direction);
        move();
        vX = holdX; vY = holdY; // restore saved speeds
    }
    
    public void move(int amount)
    {
        move(amount, zR); 
    //    rotationalBounce = true;
    } 
    
    public void killHero(){
    Actor hero;
        hero = getOneObjectAtOffset(0, 0, Hero.class);
        if(hero != null)
        {
            
            LifeLine  lifeline = (LifeLine) boosterFactory.GetBooster(GameEnum.BOOSTERTYPE.LIFE);
            int currentCount = lifeline.GetLifeLine();
            if(currentCount > 0)
            {
              lifeline.SetLifeLine(currentCount, true);
            }
            if(currentCount < 1)
            {
                World world = getWorld();
                world.removeObject(hero);        
                end=System.currentTimeMillis();
                MyWorld ref=(MyWorld)getWorld();
            //    System.out.println("Time alive: "+(end-ref.start));
                ExitScreen es=new ExitScreen();
           
                es.survval=(end-ref.start);
                System.out.println("Time: "+es.survval);
                     es.prepare();
                Greenfoot.setWorld(es);      
            }
        }
    }
    
    // getters and setters
    protected int getzY() { return zY; }        
    protected int getZR() { return zR; }        
    protected int getVX() { return vX; }        
    protected int getVY() { return vY; }        
    protected void setVX(int speed) { vX = speed; }   
    protected void setVY(int speed) { vY = speed; }
 
}
