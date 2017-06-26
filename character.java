//character class (pun not intended) for use in hack/slash simulation
package conditional;

public class character {
       private String _name;    
       private int _health;     
       private int _armor; 
       private weapon _weapon;   
       
       /**
        * Create a new character (player or monster)
        * @param name  name of character
        * @param health  number of health points
        * @param armor armor points
        * @param weapon weapon the character uses
        */
       public character(String name, int health, int armor, weapon weapon)
       {
           this._name = name;
           this._health = health;
           this._armor = armor;
           this._weapon = weapon;
       }

       
       /**
        * Get the character name
        * @return char name
        */
       public String name() { return _name; }
       
       /**
        * Get the current health
        * @return health
        */
       public int health() { return _health; }
    
       /**
        * get the current armor
        * @return armor
        */
       public int armor() { return _armor; }
       
       /** 
        * get the current weapon
        * @return weapon object
        */
       public weapon weapon() { return this._weapon; }
       
       /**
        * Detects if the character is dead (health <=0)
        * @return boolean
        */
       public boolean isDead() {
           return (this._health <=0);
       }
       
       /**
        * Applies damage to the character
        * @param amount the amount of damage to apply
        * @return int dmg taken
        */
       public int takeDamage(int amount) {
           this._health = this._health - amount;
           return this._health;           
       }
        
}