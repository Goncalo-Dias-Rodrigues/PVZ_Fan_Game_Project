import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Peashooter rockPea = new Peashooter("Rock Pea", 200, 150, 30);
        Gargantuar normalGargantuar = new Gargantuar("Gargantuar", 300, 500, 50);

        do {
            System.out.println("The zombie has: " + normalGargantuar.health + " of health.");
            System.out.println("The plant has: " + rockPea.health + " of health.");

            System.out.println("Who do you want to use (P for Peashooter or G for Gargantuar): ");
            String character = scanner.next();

            String ability;

            if (character.equals("G")){

                System.out.println("What ability do you want to use? (SMASH or IMP) ");
                ability = scanner.next();
                if(ability.equals("SMASH")){
                    rockPea.takeDamage(normalGargantuar.splashDamage());
                }
                else if(ability.equals("IMP")){
                    rockPea.takeDamage(normalGargantuar.homingImp());
                }

                System.out.println("What ability do you want to use? (PEA or GATLING) ");
                ability = scanner.next();
                if(ability.equals("PEA")){
                    normalGargantuar.takeDamage(rockPea.splashDamage());
                }
                else if(ability.equals("GATLING")){
                    normalGargantuar.takeDamage(rockPea.peaGatling());
                }

            }
            else if(character.equals("P")){

                System.out.println("What ability do you want to use? (PEA or GATLING) ");
                ability = scanner.next();
                if(ability.equals("PEA")){
                    normalGargantuar.takeDamage(rockPea.splashDamage());
                }
                else if(ability.equals("GATLING")){
                    normalGargantuar.takeDamage(rockPea.peaGatling());
                }

                System.out.println("What ability do you want to use? (SMASH or IMP) ");
                ability = scanner.next();
                if(ability.equals("SMASH")){
                    rockPea.takeDamage(normalGargantuar.splashDamage());
                }
                else if(ability.equals("IMP")){
                    rockPea.takeDamage(normalGargantuar.homingImp());
                }
            }

        }while (rockPea.health > 0 && normalGargantuar.health > 0);

        if (rockPea.health <= 0 && normalGargantuar.health > 0){
            System.out.println("The Zombie won with " + normalGargantuar.health + " health.");
        }
        else if(rockPea.health > 0 && normalGargantuar.health <= 0) {
            System.out.println("The Plant won with " + rockPea.health + " health.");
        }
        else {
            System.out.println("They both died at the same time!!");
        }
        scanner.close();

    }
}