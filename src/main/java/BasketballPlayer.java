import javax.swing.text.Position;

public class BasketballPlayer {

    private String name;
    private String position;
    private String team;
    private int height;
    private int weight;
    private int agility;
    private int speed;
    private int ballHandling;

    public BasketballPlayer(){

    }

    public BasketballPlayer(String name, String position, String team) {
        this.name = name;
        this.position = position;
        this.team = team;
    }

    public BasketballPlayer(String name, String position, String team, int height, int weight, int agility, int speed, int ballHandling) {
        this.name = name;
        this.position = position;
        this.team = team;
        this.height = height;
        this.weight = weight;
        this.agility = agility;
        this.speed = speed;
        this.ballHandling = ballHandling;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getTeam() {
        return team;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getAgility() {
        return agility;
    }

    public int getSpeed() {
        return speed;
    }

    public int getBallHandling() {
        return ballHandling;
    }

    @Override
    public String toString() {
        return "BasketballPlayer{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", team='" + team + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", agility=" + agility +
                ", speed=" + speed +
                ", ballHandling=" + ballHandling +
                '}';
    }
public int getValue(){
    if(position=="Center") {
        if (height >= 82 && (220 < weight && weight < 250) && ballHandling > 5) {
            return 10;
        } else if (height >= 82 && (210 < weight && weight < 260) && ballHandling > 5) {
            return 8;
        } else if (height >= 80 && ballHandling > 4) {
            return 6;
        } else if (height >= 78 && agility > 7) {
            return 5;
        } else if (height >= 78) {
            return 4;
        } else if (height >= 78 && agility > 5) {
            return 2;
        } else {
            return 0;
        }
    }

        else if (position=="Forward"){
            if (height >= 80 && (agility > 8||speed > 7)){
                return 10;
            }
            else if (height >=78 && agility > 6 && speed > 5){
                return 8;
            }
            else if (height >= 77 && agility>5){
                return 6;
            }
            else if (height >= 76 && speed > 4){
                return 5;
            }
            else if (height >= 75 && ((agility > 3) || (speed > 3))){
                return 3;
            }
            else if (height >= 74){
                return 1;
            }
            else{
                return 0;
            }
        }
        else if (position=="Guard"){
            if (height >= 78 && ballHandling > 7 && (agility>7 || speed > 7)){
                return 10;
            }
            else if (height >= 76 && ballHandling > 7 && (agility>6 || speed > 6)){
    return 8;
            }
            else if (height >= 74 && ballHandling > 5 && agility > 5 && speed > 6){
                return 6;
            }
            else if (ballHandling > 6 && agility > 6 && speed > 5){
                return 4;
            }
            else if (ballHandling > 4 && agility > 4){
                return 2;
            }
            else{
                return 0;
            }
        }
        return 0;
    }
}

