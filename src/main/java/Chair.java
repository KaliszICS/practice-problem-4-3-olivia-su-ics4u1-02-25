public class Chair {
    
    //Instance variables
    private int legs;
	private String material;

//Constructor
	public Chair(int legs, String material) {
		this.legs = legs;
        this.material = material;
	}

    public Chair(int legs){
        this.legs = legs;
        this.material = "wood";
    }

	//overloaded constructor
	public Chair() {
		//unique because it has no parameters
		this.legs = 4;
		this.material = "wood";
		
	}

    //getters
    public int getLegs(){
        return this.legs;
    }

    public String getMaterial(){
        return this.material;
    }
}
