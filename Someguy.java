import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Someguy extends Actor
{
    
    public void act()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 15);
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 15);
        }
        
        if(Greenfoot.isKeyDown("Left"))
        {
            setLocation(getX() - 15, getY());
        }
        
        if(Greenfoot.isKeyDown("Right"))
        {
            setLocation(getX() + 15, getY());
        }
    }
}
