package shortWay;

public class Point implements Cloneable {
	
	int x,y;
	
	public Point(){
		this.x = 0;
		this.y = 0;
	}
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void show(){
		System.out.println("("+x+", "+y+")");
	}
	public boolean equals(Point obj) {
		if (obj.x == this.x && obj.y == this.y) return true;
		else return false;
	}	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		String point = "X = " + this.x + ", Y = " + this.y;
		return point;
	}
	

}
