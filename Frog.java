import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Actor
{
    public Frog()
    {
        getImage().scale(100, 100);    
    }
    
     /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeyboard();
        isHit();
        // Add your action code here.
    }
    public void isHit()
    {
        if(isTouching(Bee.class))
        {
            removeTouching(Bee.class);
            
            MyWorld w=(MyWorld)getWorld();
            Bee myBee=new Bee();
            w.eatBee();
            w.addObject(myBee,Greenfoot.getRandomNumber(600)+100,Greenfoot.getRandomNumber(600)+100);
        }
    }
    
    public void checkKeyboard()
    {
        //controleer of de kikker naar rechts wil
        boolean key=Greenfoot.isKeyDown("right");
        if(key==true)
        {
            setLocation(getX()+2,getY());
        }
        
        //controleer of de kikker naar links wil
        key=Greenfoot.isKeyDown("left");
        if(key==true)
        {
            setLocation(getX()-2,getY());
        }
        
        key=Greenfoot.isKeyDown("up");
        if(key==true)
        {
            setLocation(getX(),getY()-2);
        }
        
        key=Greenfoot.isKeyDown("down");
        if(key==true)
        {
            setLocation(getX(),getY()+2);
        }
    }
}
