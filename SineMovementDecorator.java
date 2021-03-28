import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
class SineMovementDecorator implements MovementStrategy {
    float theta;
    MovementStrategy movement;

    public SineMovementDecorator(MovementStrategy movement) {
        theta = random(PI / 2);
        this.movement = movement;
    }

    public void move(Enemy e) {
        float storedXSpeed = e.xSpeed;
        float storedYSpeed = e.ySpeed;
        e.xSpeed = (abs(sin(theta)) + 0.5f) * storedXSpeed;
        e.ySpeed = (abs(sin(theta)) + 0.5f) * storedYSpeed;
        theta += PI / 200;
        movement.move(e);
        e.xSpeed = storedXSpeed;
        e.ySpeed = storedYSpeed;
    }

}
