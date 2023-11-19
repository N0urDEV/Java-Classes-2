public class Player {
     String name;
     int age;
     int rank;

    public Player(String name, int age, int rank) {
        this.name = name;
        this.age = age;
        this.rank = rank;
    }

    public void passBall() {
        System.out.println(name + " passes the ball.");
    }

    public void shootBall() {
        System.out.println(name + " shoots the ball.");
    }

    public void jump() {
        System.out.println(name + " jumps.");
    }
}
