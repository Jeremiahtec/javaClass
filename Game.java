class GameCharacter {
    String name;    
    int power;

    public GameCharacter(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public void boostPower(int powerBoost) {
        this.power += powerBoost;
        if(this.power > 100) {
            this.power = 100;
        }   
    }    
    
    public int kick() {
        System.out.println("Kicked!, burnt 10% power");
        return this.power -= 10;
    }
}

public class Game {
    public static void main(String[] args) {
        GameCharacter character1 = new GameCharacter("Warrior", 80);
        GameCharacter character2 = new GameCharacter("Mage", 70);
        GameCharacter character3 = new GameCharacter("Jerry", 50);
        character3.boostPower(20);
        System.out.println(character3.name + " has power " + character3.power);
    }
}
