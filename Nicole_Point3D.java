package b.klassen;

public class Nicole_Point3D extends Nicole_Point2D{
	
	private float z = 0.0f;
	
	public Nicole_Point3D(float x, float y, float z) {
		
	}
	public Nicole_Point3D() { }

	public float getZ() {
		return this.z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	public void setXYZ(float x, float y, float z) {
		this.setX(x);
		this.setY(y);
		this.setZ(z);
	}

			public float[] getXYZ() {
				float[] ausgabe = { this.getX(),this.getY(), this.getZ() };
					return ausgabe;
			}
			
	public String toString() {
		String ausgabe = "(" + this.getX() + "," + this.getY() + this.getZ() + ")";
		return ausgabe;
	}
}
