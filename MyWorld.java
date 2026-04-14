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
        
        showText("Score: " + score, 50, 20);
    }
    
    public void increaseScore()
    {
        score = score + 1;
        showText("Score: " + score, 50, 20);
    }
}
