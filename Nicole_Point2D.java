package b.klassen;

public class Nicole_Point2D {
	private float x = 0.0f;
	private float y = 0.0f;
	
	public Nicole_Point2D(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public Nicole_Point2D () { 
	}
	
	public void setX (float x) {
		this.x = x;
	}
	
	public void setY (float y) {
		this.y = y;
	}
	
	public void setXY (float x, float y) {
		this.setX(x);
		this.setY(y);
	}
	
	public float getX() {
		return this.x;
	}
	
	public float getY() {
		return this.y;
	}
	
	public float[] getXY() {
		float[] xyArray = {this.getX(), this.getY()};
		return xyArray;
	}
	
	public String toString() {
		return "(" + this.getX() + "," + this.getY() + ")";
	}
}
