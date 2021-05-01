class SineBouncingMovement extends BouncingMovement{
  float theta;
  
  public SineBouncingMovement(){
    super();
    theta = random(PI/2);
  }
  
  public void move(Enemy e){
    float storedSpeed = e.speed;
    e.speed = abs(sin(theta))*storedSpeed;
    theta += PI/200;
    super.move(e);
    e.speed = storedSpeed;
    PApplet.isGreaterThanZero(10);
  }
  
}
