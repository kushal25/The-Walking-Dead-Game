/**
 * Write a description of class IWorldItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface WorldItem  
{
    
    public String WorldBackGroundImgName();
    public int PlayerLevel();
    public int PlayerScore();
    public int scoreThresholdForNextLevel();
    public BoosterPack[] getLevelBoosters();
    

   
}
