//hack/slash simulation
package conditional;

import conditional.character;

public class hackslash {

    /**
     * A hack/slash simulator
     */
    public static void main(String[] args) {
        //name, action, max dmg
        weapon sword = new weapon("Sword", "Slash", 10);
        weapon club = new weapon("Club", "Bash", 8);
        //name, hp, armor, weapon
        character player = new character("Paladin", 20, 3, sword);
        character monster = new character("Troll", 30, 0, club);
        dice d20 = new dice(20);
        
        // player atk first
        int roll = d20.roll();
        System.out.printf("[Roll=%d|AC=%d] ", roll, monster.armor());
        System.out.printf("%s uses his %s to %s the %s and ", player.name(), player.weapon().name(), player.weapon().action(), monster.name());
        if (roll >= monster.armor())
        {
            int damage = player.weapon().hitDamage();
            monster.takeDamage(damage);
            System.out.printf("hits for %d damage", damage);
            if (monster.isDead())
            {
                System.out.printf("! %s is dead", monster.name());
            }           
        }
        else
        {
            System.out.printf("misses");
        }
        System.out.println("!");
                     
    }
}