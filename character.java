//character class (pun not intended) for use in hack/slash simulation
package conditional;

public class character {
       private String _name;    
       private int _health;     
       private int _armor; 
       private Weapon _weapon;   
       
       /**
        * Create a new character (player or monster)
        * @param name  name of character
        * @param health  number of health points
        * @param armorClass armor points
        * @param weapon weapon the character uses
        */
       public Actor(String name, int health, int armor, Weapon weapon)
       {
           this._name = name;
           this._health = health;
           this._armor = armor;
           this._weapon = weapon;
       }

       
       /**
        * Get the character name
        * @return 
        */
       public String name() { return _name; }
       
       /**
        * Get the current health
        * @return 
        */
       public int health() { return _health; }
    
       /**
        * get the current armor
        * @return 
        */
       public int armor() { return _armor; }
       
       /** 
        * get the current weapon
        * @return 
        */
       public Weapon weapon() { return this._weapon; }
       
       /**
        * Detects if the character is dead (health <=0)
        * @return 
        */
       public boolean isDead() {
           return (this._health <=0);
       }
       
       /**
        * Applies damage to the character
        * @param amount the amount of damage to apply
        * @return
        */
       public int takeDamage(int amount) {
           this._health = this._health - amount;
           return this._health;           
       }
        
}