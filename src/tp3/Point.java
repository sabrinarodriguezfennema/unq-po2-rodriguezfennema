package tp3;

public class Point {
	
	private int x;
    private int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Point() {
        this(0,0);
    }
    
    public void moverA(int x, int y) {
    	this.x = x;
    	this.y = y;
    }
    
    public Point sumarPunto(Point otroPunto) {
    	return new Point((this.x + otroPunto.getX()) , (this.y + otroPunto.getY()));
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
	    
}
