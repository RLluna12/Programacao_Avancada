/******************************************************************************


*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	   mensagem();
	   mensagem("que legal");
	   mensagem("cada enxadada uma minhoca");
	   mensagem("cada enxadada uma minhoca ","cada enxadada uma minhoca");
	}
	public static void mensagem(){
	    	System.out.println("Hello World");
	}
	public static void mensagem(String m){
	    	System.out.println(m);
	    
	}
		public static void mensagem(String m, String n){
	    	System.out.println(m+n);
	    
	}
}
