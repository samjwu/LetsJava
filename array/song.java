package array;

//song object has a name and rating out of 100
public class song {

    private String _name;
    private int _rating;
    
    //constructor
    public song(String name, int rating) {
        this._rating = rating;
        this._name = name;
    }
    
    //method
    public String Name() {
        return this._name;
    }
    
    //method
    public int Rating() {
        return this._rating;
    }
}