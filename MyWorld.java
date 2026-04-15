import greenfoot.*;

public class MyWorld extends World {
    int score= 0;
   
    public MyWorld() 
    {
        super(600, 400, 1);
        
        Someguy someguy = new Someguy();
        addObject(someguy, 100, 100);
        
        Bomb bomb = new Bomb();
        addObject(bomb, 600, 100);
        
        Minus1 pizza = new Minus1();
        addObject(pizza, 600, 200);
        
        
        showText("Score: " + score, 50, 20);
    }
    
    public void pressStart()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            showText("GAME START!", 300, 200);
            Greenfoot.start();
        }
    }
    
    public void increaseScore()
    {
        score = score + 1;
        showText("Score: " + score, 50, 20);
        
        if(score % 5 == 0)
        {
            Bomb extraBomb = new Bomb();
            int randomY = Greenfoot.getRandomNumber(400);
            addObject(extraBomb, 600, randomY);
        }
        
        if(score % 2 == 0)
        {
            Minus1 extraMinus1 = new Minus1();
            int randomY = Greenfoot.getRandomNumber(400);
            addObject(extraMinus1, 600, randomY);
        }

    }
    
    public void decreaseScore()
    {
        score = score - 10;
        showText("Score: " + score, 50, 20);
    }
}
