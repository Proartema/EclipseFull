package e43ingles;

public class MovablePoint implements Movable{
	protected int x;
	protected int y;
	protected int xSpeed;
	protected int ySpeed;
	public MovablePoint() {
		
	}
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getxSpeed() {
		return xSpeed;
	}
	public int getySpeed() {
		return ySpeed;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}
	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}
	@Override
	public void moveUp() {
		this.y -= this.ySpeed;
		
	}
	@Override
	public void moveDown() {
		this.y += this.ySpeed;
		
	}
	@Override
	public void moveLeft() {
		this.x-= this.xSpeed;
		
	}
	@Override
	public void moveRight() {
		this.x+= this.xSpeed;
		
	}
	@Override
	public String toString() {
		return "MovablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}
	
	
	
}
