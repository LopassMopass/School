package Player;

import java.util.Random;

public class Overall {
    private String name;
    private int health;
    private int number;
    private Random random = new Random();

    public boolean isDead(){
        if (health <= 0){
            return true;
        }else return false;
    }

    public void changeHealth(){
        this.health = this.number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = random.nextInt(99)+1;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = 100;
    }
}
