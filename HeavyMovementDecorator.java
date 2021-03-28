
class HeavyMovementDecorator implements MovementStrategy {
    MovementStrategy movement;

    public HeavyMovementDecorator(MovementStrategy movement) {
        this.movement = movement;
    }

    public void move(Enemy e) {
        e.ySpeed += 0.2f;
        movement.move(e);
    }

}
