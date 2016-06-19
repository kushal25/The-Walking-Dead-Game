/**
 * Write a description of class GameMenuInvoker here.
 * 
 * @author Kushal
 * @version 1.0 / 04-20-2016
 */
public class GameMenuInvoker  
{
    // instance variables - replace the example below with your own    
    private ICommand command;
    
    public void setCommand(ICommand command) {
        this.command = command;
    }
    
    public void clickMenuOption() {
        command.execute();
    }  
    
}
