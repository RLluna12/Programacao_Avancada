/******************************************************************************
 calculadora
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		
		System.out.println(soma(10,10));
		potencia(10,2);
	}
	public static int soma(int a, int b) {
		return a + b;
	}
	public static void mensagem(String m) {
		System.out.println(m);
	}
	public static void potencia(double a, double b) {
	   mensagem (a + " elevado a "+ b + " = "+ Math.pow(a,b));
	}
}
