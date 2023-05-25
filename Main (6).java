/******************************************************************************
Triangulo
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	
	Triangulo x = new Triangulo(5,4,4);
	
	if(x.formaTriangulo() == 0){
	    System.out.println("Os valores nao formam um triangulo");
	 }
	 else{
	     System.out.println("Os valores formam um triangulo");
	     x.mostraTipo();
	     System.out.println("Perimetro= " + x.perimetro());
	     System.out.println("area = " + x.area());
	 }
	}
}
