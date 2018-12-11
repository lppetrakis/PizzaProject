package pizzashop.menu;

public class Pizza{
    int size;
    String crust;

    /*
     * access modifiers: public, (default), protected, private
     * private: only accessible within the class
     * (default): only accessible within the package and subclasses
     * public: accessible anywhere
    */
    public Pizza(int size){
    	this.size = size;
    }

    public Pizza(){}

    public String toString(){
	    return "Pizza size: " + size;
    }
    
}
