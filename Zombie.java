import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie extends ZombieActor implements ActorObjects
{   
    int dt = 0; // Zombie turn rate   
    java.lang.String image;
    public Zombie(java.lang.String image)
    {
        GreenfootImage myZom = new GreenfootImage(image);
        setImage(myZom);        
    }    
    
    public String getActorImage(){
        return image;
    }
    
    public void act()
    {   
        
        int dx = 0, dy = 0; // the differences in locational coordinates of Zombie and hero
        int rate = 0; // the rate of turn and moving speed
        MyWorld world = (MyWorld)getWorld();
        Hero hero = world.getHero();
        if (hero != null && hero.getWorld() != null)
        { 
            dx = getX()-hero.getX();
            dy = getY()-hero.getY();
            rate = 400-(int)Math.abs(dx)-(int)Math.abs(dy);
        }
        if (rate > 100)
        { // chase
            int angleDiff = getRotation()-(int)(Math.atan2(dy, dx)*180/Math.PI); // range: -359 to 359
            int anglet = (angleDiff+360+180)%360-180; // range: -180 to 179 (sign is turn direction)
               
            turn(rate*(int)Math.signum(anglet)); 
            move(rate/2, getZR());
        }
        else
        { // Zombie wander           
            dt += 2-Greenfoot.getRandomNumber(5)-(int)Math.signum(dt);
            // limit turn rate to between 40 units left and right
            if (dt < -40) dt = -40;
            if (dt > 40) dt = 40;
            // turn and move
            turn(dt);
            move(110);
        }    
        killHero();        
    } 
    
    public java.lang.String accept(ActorVisitor visitor){
        return visitor.visit(this);
    }
}