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
EnemyList enemies;
void setup(){
  size(800,800);
  frameRate(60);
  c = new Character(200,200);
  EnemyList enemies ;
  do{
    enemies = new EnemyList();
    enemies.add(new Enemy(random(width-50)+25,random(height-50)-25,new SineBouncingMovement()));
    enemies.add(new Enemy(random(width-50)+25,random(height-50)-25,new BouncingMovement()));
  }while(sqrt(enemies.totalSpeed() + 1/4) > 10);
  this.enemies = enemies;
}

void draw(){
  EnemyList myEnemies = enemies;
  if(myEnemies.totalSpeed() == -1) return;
  background(0);
  c.update(); 
  enemies.updateAll();
  c.render();
  enemies.drawAll();
  if(c.isHit(enemies.getEnemies()))
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


}
