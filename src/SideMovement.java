class SideMovement implements MovementStrategy{
   int direction;
   String hey;
   int wow;
   public SideMovement(){
    direction = random(4);//0 n,1 e,2 s,3 w 
   }
   
   public void move(Enemy e){   
     if(e.x<=-e.xSpeed             ||
        e.x+e.xSpeed >= width-e.size ||
        e.y<=-e.ySpeed                 ||
        e.y+e.ySpeed >= width-e.size){
       direction = (direction+1)%4;
 
     }
    switch(direction){
     case 0: e.xSpeed = 0;
             e.ySpeed = -e.speed;
             break;
     case 1: e.xSpeed = e.speed;
             e.ySpeed = 0;
             break;
     case 2: e.xSpeed = 0;
             e.ySpeed = e.speed;
             break;
     case 3: e.xSpeed = -e.speed;
             e.ySpeed = 0;
             break;
    }
    e.x += e.xSpeed;
    e.y += e.ySpeed;
   }
}
