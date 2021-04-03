class BouncingMovement implements MovementStrategy{
  
   public void move(Enemy e){ 
     if(e.x<=-e.xSpeed ||
        e.x+e.xSpeed >= width-e.size){
       e.xSpeed = -e.xSpeed;
     }
     if( e.y<=-e.ySpeed ||
         e.y+e.ySpeed >= width-e.size){
       e.ySpeed = -e.ySpeed;
     }
    if(e.xSpeed != 0 || e.ySpeed != 0){
      float sp = sqrt(e.xSpeed*e.xSpeed+e.ySpeed*e.ySpeed);
      e.xSpeed = e.speed * e.xSpeed/sp;
      e.ySpeed = e.speed * e.ySpeed/sp;
    }
     else{return}
    e.x += e.xSpeed;
    e.y += e.ySpeed;
    
   }
  
}
