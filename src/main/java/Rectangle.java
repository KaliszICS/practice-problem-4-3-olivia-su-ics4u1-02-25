class Rectangle{
//Instance variables
    private double length;
	private double width;

//Constructor
	public Rectangle(double length, double width) {
		this.length = length;
        this.width = width;
	}

    public Rectangle(double length){
        this.length = length;
        this.width = 8;
    }

	//overloaded constructor
	public Rectangle() {
		//unique because it has no parameters
		this.length = 4;
		this.width = 8;
		
	}

    //getters
    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }
}