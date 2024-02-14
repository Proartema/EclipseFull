package e43ingles;

public class MovableCircle extends MovablePoint implements Movable{
	
	private int radius;
	private MovablePoint center;
	
	public MovableCircle() {
		
	}

	public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
		super(x,y,xSpeed,ySpeed);
		this.radius=radius;
		center = new MovablePoint (x,y,xSpeed,ySpeed);
	}
	
	
	public int getRadius() {
		return radius;
	}
	public MovablePoint getCenter() {
		return center;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void setCenter(MovablePoint center) {
		this.center = center;
	}
	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		center.y -= center.ySpeed;
	}
	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		center.y += center.ySpeed;
	}
	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		center.x -= center.xSpeed;
	}
	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		center.x += center.xSpeed;
	}
	@Override
	public String toString() {
		return "MovableCircle [radius=" + radius + ", center=" + center + ", x=" + x + ", y=" + y + "]";
	}
	
	
	
	
	
}
