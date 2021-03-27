//initial class
class Enemy{
  public float x,y;
  public float size;
  protected float xSpeed,ySpeed;
  public float speed;
  public MovementStrategy movement;
  
  public Enemy(float x,float y,MovementStrategy movement){
     this.x = x;
     this.y = y;
     speed = 4;
     size = 50;
     this.xSpeed = random(100);
     this.ySpeed = random(100); 
     this.movement = movement;
  }
  
  public void render(){
    fill(50,50,200);
    noStroke();
    rect(x,y,size,size);  
  };
  
  public void update(){movement.move(this);};
  
  public float getX(){return x;}
  public float getY(){return y;}
  public float getSize(){return size;}
  
}
