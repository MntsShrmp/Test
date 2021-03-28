//Questions to discuss in class
//is it good to encapsulate xSpeed, ySpeed in this strategy?
//what about x and y?
//Should I extend this class in the future to alter how enemies render, or does that change make it lose the main idea?
interface MovementStrategy {
    void move(Enemy e);
    void play(String s);
}
