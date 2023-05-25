/******************************************************************************

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	
	 int a=10, b=2;
     System.out.println("Soma = "+ soma(a,b));
     System.out.println("Subtracao = "+ subtracao(a,b));
     System.out.println("Produto= "+ prod(a,b));
     System.out.println("Resto = "+ resto(a,b));
     System.out.println("Divisao = "+ divisao(a,b));

	}
	public static int soma(int a, int b){
        return a+b;
    }
    	public static int subtracao(int a, int b){
        return a-b;
    }
    	public static int prod(int a, int b){
        return a*b;
    }
    	public static int resto(int a, int b){
        return b%a;
    }
    	public static int divisao(int a, int b){
    	    if(b==0)return 0;
        return a/b;
    }
    
}
