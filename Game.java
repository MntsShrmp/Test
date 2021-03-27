import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 
import Enemy.*;


public class Game extends PApplet {

Character c;
ArrayList<Enemy> enemies;
public void setup(){
  
  c = new Character(200,200);
  enemies = new ArrayList<Enemy>();
  enemies.add(new Enemy(random(width-50)+25,
                        random(height-50)-25,
                        new HeavyMovementDecorator(new BouncingMovement())
                        ));


}

public void draw(){
  background(0);
  c.update(); 
  for(Enemy e:enemies){
     e.update();
  }
  c.render();
  for(Enemy e:enemies)
    e.render();
  if(c.isHit(enemies))
    stop();
}

public void keyPressed(){
  //System.out.println(key);
  if(key == 'a')
    c.moveLeft();
  if(key == 'd')
    c.moveRight();
  if(key == 'w')
    c.moveUp();
  if(key == 's')
    c.moveDown();
  
  
}

public void changed(String s) {
  int k = 5;
}

  public void settings() {  size(800,800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--stop-color=#cccccc", "sinewdp" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
