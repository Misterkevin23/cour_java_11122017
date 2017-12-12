package fr.dessin;

public class Point2D {

	private int x;
	private int y;

	private static int count = 0;

	public Point2D() {
		this(0, 0);
	}

	public Point2D(int vX, int vY) {
		this.setX(vX);
		this.setY(vY);
		Point2D.count ++;
	}

	public static int getCompteur() {
		return Point2D.count;
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void afficher() {
		System.out.println(this.toString());
		//		System.out.println("["+getX() +","+ getY()+"]");
	}

	public void translater(int dX, int dY) {
		this.x = this.x+dX;
		this.y = this.y+dY;
		//autre ecriture
		// x = x +dX
		//this.setX(this.getX() + dX) ->favorable car plus facile a faire des test mais perte de performance
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+" [x=" + this.x + ", y=" + this.y + "]";
	}

	//	@Override
	//	public String toString() {
	//		// TODO Auto-generated method stub
	//		return "["+getX() +","+ getY()+"]";
	//	}



}
