import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Bomb extends Actor
{
 
    public void act()
    {
        move(-10);
        if(getX() <= 0)
        {
            resetBomb();
        }
    }
    
    public void resetBomb()
    {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0)
        {
            setLocation(600, 100);
        }
        else
        {
            setLocation(600, 300);
        }
        
    }
}
