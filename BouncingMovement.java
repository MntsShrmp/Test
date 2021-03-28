
class BouncingMovement implements MovementStrategy {

    public void move(Enemy e) {
        if (e.x < 0 || e.x + e.size > width)
            e.xSpeed = -e.xSpeed;
        if (e.y < 0 || e.y + e.size > height)
            e.ySpeed = -e.ySpeed;

        e.x += e.xSpeed;
        e.y += e.ySpeed;
    }

}
