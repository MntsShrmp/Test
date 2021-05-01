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
void setup(){
  size(800,800);
  frameRate(60);
  c = new Character(200,200);
  enemies = new ArrayList<Enemy>();
  enemies.add(new Enemy(random(width-50)+25,random(height-50)-25,new SineBouncingMovement()));
  enemies.add(new Enemy(random(width-50)+25,random(height-50)-25,new BouncingMovement()));
//  enemies.add(new Enemy(random(width-50)+25,random(height-50)-25,new SineSideMovement()));
//  enemies.add(new Enemy(random(width-50)+25,random(height-50)-25,new SineSideMovement()));
}

void draw(){
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

void keyPressed(){
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


String message(){
  if(c.direction() == 1) return "right";
  else return "left or stop";
}

}
