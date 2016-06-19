/**
 * Write a description of class ActorVisitor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface ActorVisitor  
{
    
    java.lang.String visit(Zombie zom);
    java.lang.String visit(ZombieNew zomn);  
}
