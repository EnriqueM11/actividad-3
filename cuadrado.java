
public class cuadrado {
	public int id;
	public int perimetro;
	public int area;
	public int diagonal;
	
	public cuadrado() {
		this(174798);}
	
	public cuadrado(int id) { 	
		this.id=id;}
	
	public int perimetro() {
		return perimetro=id*4;
	}
	
	public int area() {
		return area=id*2;
	}
	public int diagonal() {
		return diagonal=(int)Math.sqrt(Math.pow(id, 2)+Math.pow(id, 2));
	}
}
	



