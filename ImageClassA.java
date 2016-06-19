import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ImageClassA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ImageClassA extends Actor implements ActorVisitor
{
    public ImageClassA(){
    }    
    public java.lang.String visit(Zombie zom){
        return zom.getActorImage();
    }
    public java.lang.String visit(ZombieNew zomn){
        return zomn.getActorImage();
    }
}
