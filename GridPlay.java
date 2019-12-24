import java.util.*;
import java.io.*;
import java.lang.*;
class Game{
    int ballx=(int)(Math.random()*10);
    int bally=(int)(Math.random()*10);
}
class Player{
    int playerx,playery;
    Player(int x,int y){
        this.playerx=x;
        this.playery=y;
    }
    Game g=new Game();
    void displyPos(){
       System.out.println(g.ballx+" "+g.bally);
    }
    void move(){
        //move right
        while(g.ballx!=playerx){
            System.out.print("("+playerx+","+playery+")-->");
            playerx++;
        }
        //move right
        while(g.bally!=playery){
            System.out.print("("+playerx+","+playery+")-->");
            playery++;
        }
        System.out.print("("+playerx+","+playery+")");
    }
    
}
public class GridPlay{
    public static void main(String args[]){
        Player p=new Player(0,0);
        p.displyPos();
        p.move();
    }
}
