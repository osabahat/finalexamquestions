package QuestionC;

public class Rectangle extends Shape {

	public Rectangle(int newx, int newy) {
		super(newx, newy);
	}

	@Override
	void draw() {
	}

	@Override
	public double ComputeArea() throws IllegalRectangleException{
		if (this.getX() >= 0 & this.getY() >= 0){
		return this.getX() * this.getY();
	}
		else {
			if (this.getX() < 0){
				throw new IllegalRectangleException(this.getX());
			}
			else {
				throw new IllegalRectangleException(this.getY()); 
			}
		}
			
		}

}
