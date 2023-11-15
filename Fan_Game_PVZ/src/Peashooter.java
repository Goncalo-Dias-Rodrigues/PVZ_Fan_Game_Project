import java.util.Random;

public class Peashooter extends Plants {

    int cooldown = 0;


    public Peashooter(String name, int sunCost, int health, int damageItCanDo) {
        super(name, sunCost, health, damageItCanDo);
    }

    public int splashDamage(){

        double min = 0.0;
        double max = 1.0;
        double splashAffect = min + Math.random() * (max - min);
        cooldown++;
        return (int) Math.ceil(this.damageItCanDo * splashAffect);
    }

    public int peaGatling(){

        int gatlingDamage = 9;
        double min = 0.0;
        double max = 1.0;
        double gatlingAffect = min + Math.random() * (max - min);
        if (cooldown % 2 == 0){
            cooldown++;
            return (int) Math.ceil((gatlingDamage * gatlingAffect)*25);
        }
        else{
            System.out.println("Pea Gatling cannot be used (One Round Cooldown)");
            return splashDamage();
        }

    }


}
