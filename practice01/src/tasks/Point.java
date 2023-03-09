package tasks;

public class Point {
private double X;
private double Y;
private double Z;
Point(double X, double Y, double Z){
	this.X=X;
	this.Y=Y;
	this.Z=Z;
}
public double getX() {
	return X;
}

public double getY() {
	return Y;
}

public double getZ() {
	return Z;
}
public double distanceTo(Point X) {
	return Y;
	
}
public double distanceTo(Point X, Point Y) {
	return Z;
	
}
@Override
public String toString() {
	return "Point [X=" + X + ", Y=" + Y + ", Z=" + Z + "]";
}
}
