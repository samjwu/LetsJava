//weapon class for use in hack/slash simulation
package conditional;

public class weapon {
    private String _name;       // eg: sword
    private String _action;     // eg: slash
    private int _maxDamage;     
    private int _criticalHit;  
    private dice _dice;
    
    /**
     * Creates a new weapon
     * @param name name of the weapon
     * @param action the verb which describes the weapon attack
     * @param maxDamage the maximum amount of damage the weapon does
     */
    public Weapon(String name, String action, int maxDamage)
    {
        this._name = name;
        this._action = action;
        this._maxDamage = maxDamage;
        this._dice = new dice(_maxDamage);
    }
    
    /**
     * Name of the weapon
     * @return name of weapon
     */
    public String name() { return _name; }   

    /**
     * The Action of the weapon
     * @return 
     */
    public String action() { return _action; }

    /**
     * The maximum amount of damage the weapon can do
     * @return 
     */
    public int maxDamage() { return _maxDamage; }
    
    /**
     * A dice roll to determine the amount of damage done by this weapon.
     * @return damage value between 1 and maxDamage()
     */
    public int hitDamage() {
        return _dice.roll();        
    }
      
}