import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BaseObservor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class GameObservorBase 
{
    /**
     * Act - do whatever the BaseObservor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   protected abstract void Notify(Actor actor);
   protected abstract void update(Actor actor);
   
}
